package com.onoffrice.githubsearcher.domain.repository

import com.onoffrice.githubsearcher.presentation.model.RepositoryPresentation

interface GithubRepository {
    suspend fun getRepositories(page: Int): Result<RepositoryPresentation>
}