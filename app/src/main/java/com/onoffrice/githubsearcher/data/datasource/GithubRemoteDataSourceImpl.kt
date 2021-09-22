package com.onoffrice.githubsearcher.data.datasource

import com.onoffrice.githubsearcher.data.api.GithubService
import com.onoffrice.githubsearcher.data.mapper.UserToDomainMapper

class GithubRemoteDataSourceImpl(
    private val api: GithubService
) : GithubRemoteDataSource {

    private val mapper: UserToDomainMapper = UserToDomainMapper()

    override suspend fun getUsers(search: String) = mapper.map(api.getUser(search))
}

