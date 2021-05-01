package com.mindorks.bootcamp.demo.ui.home

import androidx.lifecycle.MutableLiveData
import com.mindorks.bootcamp.demo.data.local.DatabaseService
import com.mindorks.bootcamp.demo.data.remote.NetworkService
import com.mindorks.bootcamp.demo.ui.base.BaseViewModel
import com.mindorks.bootcamp.demo.ui.home.posts.Post
import com.mindorks.bootcamp.demo.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable

class HomeViewModel constructor(
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper,
        private val databaseService: DatabaseService,
        private val networkService: NetworkService)
    : BaseViewModel(compositeDisposable, networkHelper) {

    val testData = MutableLiveData<List<Post>>()

    override fun onCreate() {
        testData.postValue(listOf(
                Post("Test 1"),
                Post("Test 2"),
                Post("Test 3"),
                Post("Test 4"),
                Post("Test 5"),
                Post("Test 6"),
                Post("Test 7")
        ))
    }
}
