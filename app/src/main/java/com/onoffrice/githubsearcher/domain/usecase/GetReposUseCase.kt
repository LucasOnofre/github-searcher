package com.onoffrice.githubsearcher.domain.usecase

import com.onoffrice.githubsearcher.domain.repository.GithubRepository

class GetReposUseCase(
    private val repository: GithubRepository
) {

    suspend operator fun invoke(page: Int) = repository.getRepositories(page)
}