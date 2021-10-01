package com.onoffrice.githubsearcher.data.model

import com.google.gson.annotations.SerializedName


data class UserResponse(

    @SerializedName("name")
    val name: String?,

    @SerializedName("avatar_url")
    val avatarUrl: String?,

    @SerializedName("bio")
    val bio: String?,

    @SerializedName("blog")
    val blog: String?,

    @SerializedName("company")
    val company: String?,

    @SerializedName("created_at")
    val createdAt: String?,

    @SerializedName("followers")
    val followers: Int?,

    @SerializedName("followers_url")
    val followersUrl: String?,

    @SerializedName("following")
    val following: Int?,

    @SerializedName("following_url")
    val followingUrl: String?,

    @SerializedName("gists_url")
    val gistsUrl: String?,

    @SerializedName("html_url")
    val htmlUrl: String?,

    @SerializedName("id")
    val id: Int?,

    @SerializedName("location")
    val location: String?,

    @SerializedName("login")
    val login: String?,

    @SerializedName("public_gists")
    val publicGists: Int?,

    @SerializedName("public_repos")
    val publicRepos: Int?,

    @SerializedName("repos_url")
    val reposUrl: String?,

    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String?,

    @SerializedName("url")
    val url: String?
)