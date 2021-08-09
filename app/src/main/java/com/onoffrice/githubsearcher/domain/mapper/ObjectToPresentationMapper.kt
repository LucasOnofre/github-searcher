package com.onoffrice.githubsearcher.domain.mapper

import com.onoffrice.githubsearcher.domain.model.ObjectDomain
import com.onoffrice.githubsearcher.presentation.model.ObjectPresentation
import com.onoffrice.githubsearcher.utils.Mapper

class ObjectToPresentationMapper: Mapper<ObjectDomain, ObjectPresentation> {

    override fun map(source: ObjectDomain): ObjectPresentation {
        return ObjectPresentation(
            id = source.id
        )
    }
}