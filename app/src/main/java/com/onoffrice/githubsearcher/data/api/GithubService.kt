package com.onoffrice.githubsearcher.data.api

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {

    @GET("search/repositories")
    suspend fun repositories(
        @Query("q") query: String = "language:Java",
        @Query("sort") sort: String = "stars",
        @Query("page") page: Int
    ): RepositoriesResponse
}