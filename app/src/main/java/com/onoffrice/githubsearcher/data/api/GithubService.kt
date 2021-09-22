package com.onoffrice.githubsearcher.data.api

import com.onoffrice.githubsearcher.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("users/{username}")
    suspend fun getUser(
        @Path("username") search: String
    ): UserResponse
}