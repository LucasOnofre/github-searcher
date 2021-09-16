package com.onoffrice.githubsearcher.data.mapper

import com.onoffrice.githubsearcher.data.model.RepositoryItemResponse
import com.onoffrice.githubsearcher.data.model.RepositoryResponse
import com.onoffrice.githubsearcher.domain.model.RepositoryDomain
import com.onoffrice.githubsearcher.domain.model.RepositoryItemDomain
import com.onoffrice.githubsearcher.utils.Mapper


class RepositoryToDomainMapper : Mapper<RepositoryResponse, RepositoryDomain> {

    override fun map(source: RepositoryResponse): RepositoryDomain {
        return RepositoryDomain(
            count = source.count,
            incompleteResults = source.incompleteResults,
            items = mapItems(source.items)
        )
    }

    private fun mapItems(items: List<RepositoryItemResponse>): List<RepositoryItemDomain> {
        return items.map {
            RepositoryItemDomain(
                name = it.name,
                owner = it.owner
            )
        }
    }
}