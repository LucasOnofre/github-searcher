package com.onoffrice.githubsearcher.data.model

import java.security.acl.Owner

data class Repository(
    val name: String,
    val owner: Owner
)