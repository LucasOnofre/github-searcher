package com.onoffrice.githubsearcher.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.onoffrice.githubsearcher.domain.usecase.GetUsersUseCase
import com.onoffrice.githubsearcher.presentation.model.UserPresentation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchGithubUsersViewModel(
    private val useCase: GetUsersUseCase
) : ViewModel() {

    private val _resultSuccess = MutableLiveData<Result<UserPresentation>>()

    val resultSuccess: LiveData<Result<UserPresentation>>
        get() = _resultSuccess

    fun getRepositories(search: String) {

        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                useCase(search)
            }.onSuccess {

                // Do something case successful
                _resultSuccess.postValue(it)

            }.onFailure {

                // Do something case failure
                _resultSuccess.postValue(Result.failure(it))

            }
        }
    }
}