package com.mindorks.bootcamp.demo.di.component

import com.mindorks.bootcamp.demo.di.ViewHolderScope
import com.mindorks.bootcamp.demo.di.module.ViewHolderModule
import com.mindorks.bootcamp.demo.ui.home.posts.PostViewHolder
import dagger.Component

@ViewHolderScope
@Component(
        dependencies = [ApplicationComponent::class],
        modules = [ViewHolderModule::class]
)
interface ViewHolderComponent {

    fun inject(viewHolder: PostViewHolder)
}