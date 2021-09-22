package com.onoffrice.githubsearcher.domain.usecase

import com.onoffrice.githubsearcher.domain.repository.GithubRepository

class GetUsersUseCase(
    private val repository: GithubRepository
) {
    suspend operator fun invoke(search: String) = repository.getUsers(search)
}