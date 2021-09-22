package com.onoffrice.githubsearcher.data.repository

import com.onoffrice.githubsearcher.data.datasource.GithubRemoteDataSource
import com.onoffrice.githubsearcher.domain.mapper.RepositoryToPresentationMapper
import com.onoffrice.githubsearcher.domain.repository.GithubRepository
import com.onoffrice.githubsearcher.presentation.model.UserPresentation

class GithubRepositoryImpl(
    private val remoteDataSource: GithubRemoteDataSource
) : GithubRepository {

    private val mapper: RepositoryToPresentationMapper = RepositoryToPresentationMapper()

    override suspend fun getUsers(search: String): Result<UserPresentation> {
        return Result.success(mapper.map(remoteDataSource.getUsers(search)))
    }
}