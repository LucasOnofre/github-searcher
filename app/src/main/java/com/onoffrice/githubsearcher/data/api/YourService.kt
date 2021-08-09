package com.onoffrice.githubsearcher.data.api

import com.onoffrice.githubsearcher.data.model.ExampleResponse
import retrofit2.http.GET

interface YourService {

    @GET("/endpoint/example")
    suspend fun getExample(): ExampleResponse
}