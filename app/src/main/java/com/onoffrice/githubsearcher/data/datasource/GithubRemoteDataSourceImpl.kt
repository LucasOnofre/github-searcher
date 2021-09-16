package com.onoffrice.githubsearcher.data.datasource

import com.onoffrice.githubsearcher.data.api.GithubService
import com.onoffrice.githubsearcher.data.mapper.RepositoryToDomainMapper

class GithubRemoteDataSourceImpl(
    private val api: GithubService
) : GithubRemoteDataSource {

    private val mapper: RepositoryToDomainMapper = RepositoryToDomainMapper()

    override suspend fun getRepositories(page: Int) = mapper.map(api.getRepositories(page = page))
}
