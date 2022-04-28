package com.th.nvvm.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class ViewModel(application: Application) : AndroidViewModel(application) {
    // ViewModel()을 상속받는 경우
    // class ViewModel():ViewModel(){}

    // LiveData
    // 값이 변경되는 경우 MutableLiveData로 선언
    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun increase(){
        count.value = count.value?.plus(1)
    }

    fun decrease(){
        count.value = count.value?.minus(1)
    }
}