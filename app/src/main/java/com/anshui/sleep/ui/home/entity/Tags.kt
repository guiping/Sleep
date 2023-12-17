package com.anshui.sleep.ui.home.entity

class Tags {
    companion object {
        val TODAY_SLEEP = TagModel(1, "今日安眠")
        val RELAXATION = TagModel(2, "舒眠放松")
        val BEDTIME_STORY = TagModel(3, "睡前故事")
        val WHITE_NOISE = TagModel(4, "白噪音")

        val TAG_LIST = listOf(TODAY_SLEEP, RELAXATION, BEDTIME_STORY, WHITE_NOISE)
    }
}