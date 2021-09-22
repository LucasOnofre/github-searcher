package com.onoffrice.githubsearcher.data.datasource

import com.onoffrice.githubsearcher.domain.model.UserDomain

interface GithubRemoteDataSource {

    suspend fun getUsers(search: String): UserDomain
}