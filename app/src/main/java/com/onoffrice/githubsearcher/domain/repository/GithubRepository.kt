package com.onoffrice.githubsearcher.domain.repository

import com.onoffrice.githubsearcher.presentation.model.UserPresentation

interface GithubRepository {
    suspend fun getUsers(search: String): Result<UserPresentation>
}