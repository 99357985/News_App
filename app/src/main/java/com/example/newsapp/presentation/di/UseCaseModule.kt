package com.example.newsapp.presentation.di

import com.example.newsapp.domain.repository.NewsRepository
import com.example.newsapp.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideGetNewsHeadLinesUseCase(
        newsRepository: NewsRepository
    ) : GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Provides
    @Singleton
    fun provideGetSearchedNewsUseCase(
        newsRepository: NewsRepository
    ) : GetSearchedNewsUseCase {
        return GetSearchedNewsUseCase(newsRepository)
    }
    @Provides
    @Singleton
    fun provideSaveNewsUseCase(
        newsRepository: NewsRepository
    ) : SaveNewsUseCase {
        return SaveNewsUseCase(newsRepository)
    }
    @Provides
    @Singleton
    fun provideGetSaveNewsUseCase(
        newsRepository: NewsRepository
    ) : GetSavedNewsUseCase {
        return GetSavedNewsUseCase(newsRepository)
    }
    @Provides
    @Singleton
    fun provideDeleteSavedNewsUseCase(
        newsRepository: NewsRepository
    ) : DeleteSavedNewsUseCase {
        return DeleteSavedNewsUseCase(newsRepository)
    }
}