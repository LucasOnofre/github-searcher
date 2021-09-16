package com.onoffrice.githubsearcher.domain.mapper

import com.onoffrice.githubsearcher.domain.model.RepositoryDomain
import com.onoffrice.githubsearcher.domain.model.RepositoryItemDomain
import com.onoffrice.githubsearcher.presentation.model.RepositoryItemPresentation
import com.onoffrice.githubsearcher.presentation.model.RepositoryPresentation
import com.onoffrice.githubsearcher.utils.Mapper

class RepositoryToPresentationMapper : Mapper<RepositoryDomain, RepositoryPresentation> {

    override fun map(source: RepositoryDomain): RepositoryPresentation {
        return RepositoryPresentation(
            count = source.count,
            incompleteResults = source.incompleteResults,
            items = mapItems(source.items)
        )
    }

    private fun mapItems(items: List<RepositoryItemDomain>): List<RepositoryItemPresentation> {
        return items.map {
            RepositoryItemPresentation(
                name = it.name,
                owner = it.owner
            )
        }
    }
}