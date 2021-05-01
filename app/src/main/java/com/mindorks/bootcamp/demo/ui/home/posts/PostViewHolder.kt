package com.mindorks.bootcamp.demo.ui.home.posts

import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.mindorks.bootcamp.demo.R
import com.mindorks.bootcamp.demo.di.component.ViewHolderComponent
import com.mindorks.bootcamp.demo.ui.base.BaseItemViewHolder
import kotlinx.android.synthetic.main.item_view_post.view.*

class PostViewHolder(parent: ViewGroup) : BaseItemViewHolder<Post, PostViewModel>(
        R.layout.item_view_post, parent) {

    override fun injectDependencies(viewHolderComponent: ViewHolderComponent) =
            viewHolderComponent.inject(this)


    override fun setupView(view: View) {

    }

    override fun setupObservers() {
        super.setupObservers()
        viewModel.data.observe(this, Observer {
            itemView.tv_message.text = it.text
        })

        itemView.setOnClickListener {
            it.tv_message
            showMessage("${it.tv_message} clicked")
        }
    }
}