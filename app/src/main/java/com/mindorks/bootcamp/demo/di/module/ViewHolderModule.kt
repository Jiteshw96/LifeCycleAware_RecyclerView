package com.mindorks.bootcamp.demo.di.module

import androidx.lifecycle.LifecycleRegistry
import com.mindorks.bootcamp.demo.di.ViewHolderScope
import com.mindorks.bootcamp.demo.ui.base.BaseItemViewHolder
import dagger.Module
import dagger.Provides

@Module
class ViewHolderModule(private val viewHolder: BaseItemViewHolder<*, *>) {

    @Provides
    @ViewHolderScope
    fun provideLifecycleRegistry(): LifecycleRegistry = LifecycleRegistry(viewHolder)
}