package com.onoffrice.githubsearcher.domain.model

import java.security.acl.Owner

data class RepositoryItemDomain(
    val name: String,
    val owner: Owner
)