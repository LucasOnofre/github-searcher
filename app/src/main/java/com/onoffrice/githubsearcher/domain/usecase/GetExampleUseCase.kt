package com.onoffrice.githubsearcher.domain.usecase

import com.onoffrice.githubsearcher.domain.repository.YourRepository

class GetExampleUseCase(
    private val repository: YourRepository
) {

    suspend operator fun invoke() = repository.getExample()
}