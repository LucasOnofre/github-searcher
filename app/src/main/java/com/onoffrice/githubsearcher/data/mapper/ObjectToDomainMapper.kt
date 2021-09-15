package com.onoffrice.githubsearcher.data.mapper

import com.onoffrice.githubsearcher.data.model.RepositoryResponse
import com.onoffrice.githubsearcher.domain.model.ObjectDomain
import com.onoffrice.githubsearcher.utils.Mapper


class ObjectToDomainMapper: Mapper<RepositoryResponse, ObjectDomain> {

    override fun map(source: RepositoryResponse): ObjectDomain {
        return ObjectDomain(
            id = source.id
        )
    }
}