package com.onoffrice.githubsearcher.data.api

import com.onoffrice.githubsearcher.data.model.RepositoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    @GET("search/repositories")
    suspend fun getRepositories(
        @Query("q") query: String = "language:Kotlin",
        @Query("sort") sort: String = "stars",
        @Query("page") page: Int
    ): RepositoryResponse
}