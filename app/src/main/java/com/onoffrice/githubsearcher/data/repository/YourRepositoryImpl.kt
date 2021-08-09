package com.onoffrice.githubsearcher.data.repository

import com.onoffrice.githubsearcher.data.datasource.RemoteDataSource
import com.onoffrice.githubsearcher.domain.mapper.ObjectToPresentationMapper
import com.onoffrice.githubsearcher.domain.repository.YourRepository
import com.onoffrice.githubsearcher.presentation.model.ObjectPresentation

class YourRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : YourRepository {

    private val mapper: ObjectToPresentationMapper = ObjectToPresentationMapper()

    override suspend fun getExample(): Result<ObjectPresentation> {
        return Result.success(mapper.map(remoteDataSource.getExample()))
    }
}