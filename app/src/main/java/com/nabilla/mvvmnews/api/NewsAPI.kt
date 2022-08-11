package com.nabilla.mvvmnews.api

import com.nabilla.mvvmnews.NewsResponse
import com.nabilla.mvvmnews.util.Constant.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode:String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery:String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

}