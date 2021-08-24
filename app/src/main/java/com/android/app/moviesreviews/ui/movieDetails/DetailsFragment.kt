package com.android.app.moviesreviews.ui.movieDetails

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.android.app.moviesreviews.R
import com.android.app.moviesreviews.databinding.ContentMovieBinding
import com.android.app.moviesreviews.databinding.FragmentDetailsBinding
import com.android.app.moviesreviews.databinding.FragmentMoviesListBinding
import com.android.app.moviesreviews.model.Result
import com.android.app.moviesreviews.utils.loadImage
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding

    val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)

        setupActionBar();
        getSelectedArticle(args.selectedMovie);

        return binding.root;
    }

    private fun getSelectedArticle(article : Result) {
        binding.movie.apply {
          headline.text = article.headline
          source.text = article.displayTitle
          auther.text = article.byline
          date.text = article.dateUpdated
          description.text = article.summaryShort
          summary.text= article.summaryShort
        }
        binding.apply {
            articleImage.loadImage(article.multimedia!!.src!!)
        }

    }

    private fun setupActionBar() {
        binding.toolbar.apply {
            setTitle(R.string.app_name)
            setNavigationOnClickListener { findNavController().navigateUp() }
        }
    }
}