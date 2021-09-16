package com.onoffrice.githubsearcher.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.onoffrice.githubsearcher.domain.usecase.GetReposUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GithubViewModel(
    private val useCase: GetReposUseCase
) : ViewModel() {

    private val _resultSuccess =
        MutableLiveData<Result<Boolean>>().apply { value = Result.success(false) }

    val resultSuccess: LiveData<Result<Boolean>>
        get() = _resultSuccess

    fun getRepositories(page: Int = 0) {

        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                useCase(page = page)
            }.onSuccess {

                // Do something case successful
                _resultSuccess.postValue(Result.success(true))

            }.onFailure {

                // Do something case failure
                _resultSuccess.postValue(Result.failure(it))

            }
        }
    }
}