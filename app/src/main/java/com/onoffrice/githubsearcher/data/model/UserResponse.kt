package com.onoffrice.githubsearcher.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class UserResponse(
    @SerialName("name")
    val name: String
)