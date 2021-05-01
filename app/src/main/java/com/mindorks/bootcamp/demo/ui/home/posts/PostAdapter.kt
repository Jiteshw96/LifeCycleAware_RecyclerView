package com.mindorks.bootcamp.demo.ui.home.posts

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.mindorks.bootcamp.demo.ui.base.BaseAdapter


class PostAdapter(
        parentLifecycle: Lifecycle,
        posts: ArrayList<Post>
) : BaseAdapter<Post, PostViewHolder>(parentLifecycle, posts) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PostViewHolder(parent)
}