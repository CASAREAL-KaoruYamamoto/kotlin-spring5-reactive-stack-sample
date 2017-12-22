package com.example.demo.entity

import java.time.LocalDate

/**
 * TODO項目の値を格納するためのクラス
 */
data class TodoItem(

        /**
         * ID
         */
        val id: String? = null,

        /**
         * 完了状態
         */
        val done: Boolean = false,

        /**
         * 表題
         */
        val subject: String = "無題",

        /**
         * 期日
         */
        val deadline: LocalDate? = null

)