package com.onoffrice.githubsearcher.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(

    @SerialName("name")
    val name: String?,

    @SerialName("avatarUrl")
    val avatarUrl: String?,

    @SerialName("bio")
    val bio: String?,

    @SerialName("blog")
    val blog: String?,

    @SerialName("company")
    val company: String?,

    @SerialName("created_at")
    val createdAt: String?,

    @SerialName("followers")
    val followers: Int?,

    @SerialName("followers_url")
    val followersUrl: String?,

    @SerialName("following")
    val following: Int?,

    @SerialName("following_url")
    val followingUrl: String?,

    @SerialName("gists_url")
    val gistsUrl: String?,

    @SerialName("html_url")
    val htmlUrl: String?,

    @SerialName("id")
    val id: Int?,

    @SerialName("location")
    val location: String?,

    @SerialName("login")
    val login: String?,

    @SerialName("public_gists")
    val publicGists: Int?,

    @SerialName("public_repos")
    val publicRepos: Int?,

    @SerialName("repos_url")
    val reposUrl: String?,

    @SerialName("subscriptions_url")
    val subscriptionsUrl: String?,

    @SerialName("url")
    val url: String?
)