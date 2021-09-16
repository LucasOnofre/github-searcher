package com.onoffrice.githubsearcher.data.repository

import com.onoffrice.githubsearcher.data.datasource.GithubRemoteDataSource
import com.onoffrice.githubsearcher.domain.mapper.RepositoryToPresentationMapper
import com.onoffrice.githubsearcher.domain.repository.GithubRepository
import com.onoffrice.githubsearcher.presentation.model.RepositoryPresentation

class GithubRepositoryImpl(
    private val remoteDataSource: GithubRemoteDataSource
) : GithubRepository {

    private val mapper: RepositoryToPresentationMapper = RepositoryToPresentationMapper()

    override suspend fun getRepositories(page: Int): Result<RepositoryPresentation> {
        return Result.success(mapper.map(remoteDataSource.getRepositories(page)))
    }
}