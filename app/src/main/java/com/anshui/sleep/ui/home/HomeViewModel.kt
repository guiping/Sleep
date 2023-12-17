package com.anshui.sleep.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anshui.sleep.ui.home.entity.TagModel
import com.anshui.sleep.ui.home.entity.Tags
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val tagListEntity = MutableLiveData<List<TagModel>>()

    fun geTagList() {
        tagListEntity.postValue(Tags.TAG_LIST)
    }

}