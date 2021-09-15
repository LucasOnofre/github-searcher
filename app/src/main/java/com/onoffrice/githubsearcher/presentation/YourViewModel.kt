package com.onoffrice.githubsearcher.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.onoffrice.githubsearcher.domain.usecase.GetExampleUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class YourViewModel(
    private val useCase: GetExampleUseCase
) : ViewModel() {

    private val _resultSuccess = MutableLiveData<Result<Boolean>>().apply { value = Result.success(false) }

    val resultSuccess : LiveData<Result<Boolean>>
        get() = _resultSuccess

    fun exampleCallCoroutines() {

        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                useCase()
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