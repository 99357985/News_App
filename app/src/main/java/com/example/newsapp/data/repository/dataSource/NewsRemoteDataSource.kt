package com.example.newsapp.data.repository.dataSource

import com.example.newsapp.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadLines(country: String,page: Int): Response<APIResponse>
    suspend fun getSearchedTopHeadLines(country: String,searchQuery: String,page: Int): Response<APIResponse>
}