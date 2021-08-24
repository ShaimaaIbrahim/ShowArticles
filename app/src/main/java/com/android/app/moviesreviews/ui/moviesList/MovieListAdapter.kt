package com.android.app.moviesreviews.ui.moviesList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.android.app.moviesreviews.databinding.MovieItemBinding
import com.android.app.moviesreviews.model.Result
import com.android.app.moviesreviews.utils.loadImage

class MovieListAdapter : PagingDataAdapter<Result, MovieListAdapter.MoviesViewHolder>(DiffUtilsCallback) {

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = getItem(position) ?: return
        holder.bind(movie)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = MovieItemBinding.inflate(layoutInflater, parent, false)
        return MoviesViewHolder(binding)
    }

    class MoviesViewHolder(private val binding: MovieItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Result) {
            item.run {
                binding.headline.text = item.headline
                binding.title.text= item.displayTitle
                binding.movieImage.loadImage(item.multimedia!!.src!!)
                setOnClickListener(item)
            }
        }

        private fun setOnClickListener(item: Result) {
            binding.title.setOnClickListener { view ->
              navigateToDetail(item, view)
            }
        }

        private fun navigateToDetail(item: Result, view: View) {
            val directions =
                MoviesListFragmentDirections.actionMoviesListFragment2ToDetailsFragment2(item)
            view.findNavController().navigate(directions)
        }

    }



    companion object {
        val DiffUtilsCallback: DiffUtil.ItemCallback<Result> =
            object : DiffUtil.ItemCallback<Result>() {
                override fun areItemsTheSame(oldItem: Result, newItem: Result) =
                    oldItem == newItem

                override fun areContentsTheSame(oldItem: Result, newItem: Result) =
                    oldItem.byline == newItem.byline
            }
    }


}
