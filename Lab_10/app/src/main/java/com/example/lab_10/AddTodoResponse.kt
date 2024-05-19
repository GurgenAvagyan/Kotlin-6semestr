package com.example.lab_10

import com.google.gson.annotations.SerializedName

data class AddTodoResponse (
    @SerializedName("id")
    var id: Int,
)