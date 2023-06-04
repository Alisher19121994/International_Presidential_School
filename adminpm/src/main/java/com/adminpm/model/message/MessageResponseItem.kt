package com.adminpm.model.message

data class MessageResponseItem(
    val createdAt: String,
    val id: Int,
    val message_description: String,
    val message_title: String,
    val updatedAt: String
)
