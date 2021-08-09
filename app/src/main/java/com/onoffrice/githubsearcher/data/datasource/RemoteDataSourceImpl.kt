package com.onoffrice.githubsearcher.data.datasource

import com.onoffrice.githubsearcher.data.api.YourService
import com.onoffrice.githubsearcher.data.mapper.ObjectToDomainMapper

class RemoteDataSourceImpl(
    private val api: YourService
) : RemoteDataSource {

    private val mapper: ObjectToDomainMapper = ObjectToDomainMapper()

    override suspend fun getExample() = mapper.map(api.getExample())
}
