package com.onoffrice.githubsearcher.presentation.model

import java.security.acl.Owner

data class RepositoryItemPresentation(
    val name: String,
    val owner: Owner
)