package com.onoffrice.githubsearcher.presentation.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class RepositoryPresentation(
    val count: Int,
    val incompleteResults: Boolean,
    val items: List<RepositoryItemPresentation>
)