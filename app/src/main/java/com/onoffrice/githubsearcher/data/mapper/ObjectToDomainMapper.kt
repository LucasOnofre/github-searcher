package com.onoffrice.githubsearcher.data.mapper

import com.onoffrice.githubsearcher.data.model.ExampleResponse
import com.onoffrice.githubsearcher.domain.model.ObjectDomain
import com.onoffrice.githubsearcher.utils.Mapper


class ObjectToDomainMapper: Mapper<ExampleResponse, ObjectDomain> {

    override fun map(source: ExampleResponse): ObjectDomain {
        return ObjectDomain(
            id = source.id
        )
    }
}