package com.example.lab_10

import com.google.gson.annotations.SerializedName

data class Todo (
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("id")
    var id: Int,
    @SerializedName("title")
    var title: String,
    @SerializedName("completed")
    var completed: Boolean,
)