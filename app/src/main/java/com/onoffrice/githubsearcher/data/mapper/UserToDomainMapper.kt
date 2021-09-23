package com.onoffrice.githubsearcher.data.mapper

import com.onoffrice.githubsearcher.data.model.UserResponse
import com.onoffrice.githubsearcher.domain.model.UserDomain
import com.onoffrice.githubsearcher.utils.Mapper

class UserToDomainMapper : Mapper<UserResponse, UserDomain> {

    override fun map(source: UserResponse): UserDomain {
        return UserDomain(
            name = source.name.orEmpty(),
            avatarUrl = source.avatarUrl.orEmpty(),
            bio = source.bio.orEmpty(),
            blog = source.blog.orEmpty(),
            company = source.company.orEmpty(),
            createdAt = source.createdAt.orEmpty(),
            followers = source.followers ?: 0,
            followersUrl = source.followersUrl.orEmpty(),
            following = source.following ?: 0,
            followingUrl = source.followingUrl.orEmpty(),
            gistsUrl = source.gistsUrl.orEmpty(),
            htmlUrl = source.htmlUrl.orEmpty(),
            id = source.id ?: 0,
            location = source.location.orEmpty(),
            login = source.login.orEmpty(),
            publicGists = source.publicGists ?: 0,
            publicRepos = source.publicRepos ?: 0,
            reposUrl = source.reposUrl.orEmpty(),
            subscriptionsUrl = source.subscriptionsUrl.orEmpty(),
            url = source.url.orEmpty()
        )
    }
}