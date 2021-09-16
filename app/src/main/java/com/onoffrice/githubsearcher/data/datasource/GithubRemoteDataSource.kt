package com.onoffrice.githubsearcher.data.datasource

import com.onoffrice.githubsearcher.domain.model.RepositoryDomain

interface GithubRemoteDataSource {

    suspend fun getRepositories(page: Int): RepositoryDomain
}