package com.onoffrice.githubsearcher.domain.mapper

import com.onoffrice.githubsearcher.domain.model.UserDomain
import com.onoffrice.githubsearcher.presentation.model.UserPresentation
import com.onoffrice.githubsearcher.utils.Mapper

class RepositoryToPresentationMapper : Mapper<UserDomain, UserPresentation> {

    override fun map(source: UserDomain): UserPresentation {
        return UserPresentation(
            name = source.name,
            avatarUrl = source.avatarUrl,
            bio = source.bio,
            blog = source.blog,
            company = source.company,
            createdAt = source.createdAt,
            followers = source.followers,
            followersUrl = source.followersUrl,
            following = source.following,
            followingUrl = source.followingUrl,
            gistsUrl = source.gistsUrl,
            htmlUrl = source.htmlUrl,
            id = source.id,
            location = source.location,
            login = source.login,
            publicGists = source.publicGists,
            publicRepos = source.publicRepos,
            reposUrl = source.reposUrl,
            subscriptionsUrl = source.subscriptionsUrl,
            url = source.url
        )
    }
}