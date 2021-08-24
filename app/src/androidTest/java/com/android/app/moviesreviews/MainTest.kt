package com.android.app.moviesreviews

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class MainTest {

    @get:Rule
    var hiltTest = HiltAndroidRule(this)

    @Before
    fun init(){
     hiltTest.inject()
    }

    @Test
    fun someTest(){

    }

    @Module
    @InstallIn(ApplicationComponent::class)
    object ApiModule{
        
    }
}