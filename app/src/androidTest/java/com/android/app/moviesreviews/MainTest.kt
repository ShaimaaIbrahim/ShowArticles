package com.android.app.moviesreviews

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.paging.ExperimentalPagingApi
import androidx.test.core.app.launchActivity
import com.android.app.moviesreviews.di.ApiModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import dagger.hilt.android.testing.UninstallModules
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import com.android.app.moviesreviews.ui.MainActivity
import com.android.app.moviesreviews.ui.moviesList.MoviesListFragment
import com.android.app.moviesreviews.utils.launchFragmentInHiltContainer
import junit.framework.Assert.assertEquals

@UninstallModules(ApiModule::class)
@HiltAndroidTest
class MainTest {

   /* @Inject
     lateinit var okHttpClient : OkHttpClient*/

    @get:Rule
    var hiltTest = HiltAndroidRule(this)

    @Before
    fun init(){
     hiltTest.inject()
    }


    @Test
    fun mainActivityTest(){
        var scenario= launchActivity<MainActivity>()
    }

    @ExperimentalPagingApi
    @Test
    fun mainFragmentTest(){
        var scenario= launchFragmentInHiltContainer<MoviesListFragment>()
    }

/*
    @Module
    @InstallIn(ApplicationComponent::class)
    object TestModule{

        @Provides
        fun provideOkHttpClientTest(): OkHttpClient {
            return OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor())
                .build()
        }
    }*/
}