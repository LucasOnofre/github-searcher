package com.onoffrice.githubsearcher.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RepositoryResponse(
    @SerialName("total_count")
    val count: Int,

    @SerialName("incomplete_results")
    val incompleteResults: Boolean,

    val items: List<Repository>
)