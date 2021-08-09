package com.onoffrice.githubsearcher.domain.repository

import com.onoffrice.githubsearcher.presentation.model.ObjectPresentation

interface YourRepository {

    suspend fun getExample(): Result<ObjectPresentation>
}