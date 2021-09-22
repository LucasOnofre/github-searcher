package com.onoffrice.githubsearcher.domain.mapper

import com.onoffrice.githubsearcher.domain.model.UserDomain
import com.onoffrice.githubsearcher.presentation.model.UserPresentation
import com.onoffrice.githubsearcher.utils.Mapper

class RepositoryToPresentationMapper : Mapper<UserDomain, UserPresentation> {

    override fun map(source: UserDomain): UserPresentation {
        return UserPresentation(
            name = source.name
        )
    }
}