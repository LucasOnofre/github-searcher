package com.onoffrice.githubsearcher.data.datasource

import com.onoffrice.githubsearcher.domain.model.ObjectDomain

interface RemoteDataSource {

    suspend fun getExample(): ObjectDomain
}