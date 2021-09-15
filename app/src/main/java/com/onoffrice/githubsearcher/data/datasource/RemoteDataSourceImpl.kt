package com.onoffrice.githubsearcher.data.datasource

import com.onoffrice.githubsearcher.data.api.GithubService
import com.onoffrice.githubsearcher.data.mapper.ObjectToDomainMapper

class RemoteDataSourceImpl(
    private val api: GithubService
) : RemoteDataSource {

    private val mapper: ObjectToDomainMapper = ObjectToDomainMapper()

    override suspend fun getExample() = mapper.map(api.getExample())
}
