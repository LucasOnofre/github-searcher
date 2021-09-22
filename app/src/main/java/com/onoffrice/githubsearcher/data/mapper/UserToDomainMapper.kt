package com.onoffrice.githubsearcher.data.mapper

import com.onoffrice.githubsearcher.data.model.UserResponse
import com.onoffrice.githubsearcher.domain.model.UserDomain
import com.onoffrice.githubsearcher.utils.Mapper

class UserToDomainMapper : Mapper<UserResponse, UserDomain> {

    override fun map(source: UserResponse): UserDomain {
        return UserDomain(
            name = source.name
        )
    }
}