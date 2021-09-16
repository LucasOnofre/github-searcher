package com.onoffrice.githubsearcher.domain.model

data class RepositoryDomain(
    val count: Int,
    val incompleteResults: Boolean,
    val items: List<RepositoryItemDomain>
)