package com.onoffrice.githubsearcher.domain.model

data class UserDomain(
    val name: String,
    val avatarUrl: String,
    val bio: String,
    val blog: String,
    val company: String,
    val createdAt: String,
    val followers: Int,
    val followersUrl: String,
    val following: Int,
    val followingUrl: String,
    val gistsUrl: String,
    val htmlUrl: String,
    val id: Int,
    val location: String,
    val login: String,
    val publicGists: Int,
    val publicRepos: Int,
    val reposUrl: String,
    val subscriptionsUrl: String,
    val url: String
)