package com.onoffrice.githubsearcher.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.onoffrice.githubsearcher.domain.usecase.GetUsersUseCase
import com.onoffrice.githubsearcher.presentation.model.UserPresentation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchUsersViewModel(
    private val useCase: GetUsersUseCase
) : ViewModel() {

    private val _resultSuccess = MutableLiveData<UserPresentation?>()
    val resultSuccess: LiveData<UserPresentation?>
        get() = _resultSuccess

    private val _resultError = MutableLiveData<Throwable>()
    val resultError: LiveData<Throwable>
        get() = _resultError

    fun getUser(search: String) {

        viewModelScope.launch(Dispatchers.IO) {
            runCatching {
                useCase(search)
            }.onSuccess {
                _resultSuccess.postValue(it.getOrNull())
            }.onFailure {
                _resultError.postValue(it)

            }
        }
    }
}