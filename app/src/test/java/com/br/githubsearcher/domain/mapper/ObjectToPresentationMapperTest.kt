package com.br.githubsearcher.domain.mapper

import com.onoffrice.githubsearcher.domain.mapper.ObjectToPresentationMapper
import com.onoffrice.githubsearcher.domain.model.ObjectDomain
import com.onoffrice.githubsearcher.presentation.model.ObjectPresentation
import org.junit.Test
import kotlin.test.assertEquals

class ObjectToPresentationMapperTest {

    private val mapper: ObjectToPresentationMapper = ObjectToPresentationMapper()

    @Test
    fun `when mapper should map to presentation`() {
        // When
        val result = mapper.map(ObjectDomain(id = "123"))

        // Then
        assertEquals(result, ObjectPresentation(id = "123"))
    }
}