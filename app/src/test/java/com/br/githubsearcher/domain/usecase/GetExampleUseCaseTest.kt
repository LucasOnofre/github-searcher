package com.br.githubsearcher.domain.usecase

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import com.onoffrice.githubsearcher.domain.repository.YourRepository
import com.onoffrice.githubsearcher.domain.usecase.GetExampleUseCase
import com.onoffrice.githubsearcher.presentation.model.ObjectPresentation
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test
import kotlin.Result.Companion.success
import kotlin.test.assertEquals

@ExperimentalCoroutinesApi
class GetExampleUseCaseTest {
    private val repository: YourRepository = mock()
    private val useCase: GetExampleUseCase = GetExampleUseCase(repository)

    @Test
    fun `when invoke should return success`() = runBlockingTest {
        // Given
        whenever(repository.getExample()).thenAnswer { success(ObjectPresentation(id = "123")) }

        // When
        val result = useCase.invoke()

        val resultExpected = success(ObjectPresentation(id = "123"))

        // Then
        assertEquals(result, resultExpected)
    }
}