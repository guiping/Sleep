package com.anshui.sleep.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anshui.sleep.R
import com.anshui.sleep.ui.home.entity.TagModel
import com.anshui.sleep.ui.home.entity.Tags
import java.lang.reflect.Field


class HomeViewModel : ViewModel() {

    private val tagListEntity = MutableLiveData<List<TagModel>>()

    fun geTagList() {
        tagListEntity.postValue(Tags.TAG_LIST)
    }

    //获取音频数据并且组装起来
    fun getMp3Data() {


    }

}