package com.onoffrice.githubsearcher.data.model

import java.security.acl.Owner

data class RepositoryItemResponse(
    val name: String,
    val owner: Owner
)