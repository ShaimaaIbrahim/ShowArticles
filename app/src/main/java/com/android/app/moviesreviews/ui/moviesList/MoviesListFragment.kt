package com.android.app.moviesreviews.ui.moviesList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.paging.CombinedLoadStates
import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadState
import com.android.app.moviesreviews.R
import com.android.app.moviesreviews.databinding.FragmentMoviesListBinding
import com.android.app.moviesreviews.ui.LoadingStateAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@ExperimentalPagingApi
@AndroidEntryPoint
class MoviesListFragment : Fragment() {

    private lateinit var binding: FragmentMoviesListBinding
    private lateinit var adapter: MovieListAdapter
    private val viewModel: MovieListViewModel by viewModels()
    private lateinit var toolbar: Toolbar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMoviesListBinding.inflate(inflater, container, false)

        initViews()
        getMovies()
        openSettingsScreen()

        return binding.root
    }

    fun initViews(){
      toolbar= binding.homeToolbar
      adapter= MovieListAdapter();
      binding.moviesList.adapter= adapter

        adapter.addLoadStateListener { loadState ->
            binding.moviesList.isVisible = loadState.refresh is LoadState.NotLoading
            binding.progress.isVisible = loadState.refresh is LoadState.Loading
            binding.retryButton.isVisible = loadState.source.refresh is LoadState.Error

        }
        binding.moviesList.adapter= adapter.withLoadStateHeaderAndFooter(
            header = LoadingStateAdapter { adapter.retry() },
            footer = LoadingStateAdapter { adapter.retry() }
        )
        binding.retryButton.setOnClickListener { adapter.retry() }

    }



    private fun openSettingsScreen() {
        binding.apply {
            toolbar.setOnMenuItemClickListener {
                if (it.itemId == R.id.settings) {
                    navigateToSettingsScreen()
                }
                true
            }
        }
    }

    private fun navigateToSettingsScreen() {
       findNavController().navigate(MoviesListFragmentDirections.actionMoviesListFragmentToSettingsFragment())
    }

    private fun getMovies() {
             viewModel.getAllMovies().asLiveData().observe(requireActivity(), Observer {
                 lifecycleScope.launch {
                    adapter.submitData(it)
                 }
            })
        }
}