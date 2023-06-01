package com.international_presidential_school.models.rating

data class RatingResponse(
    val createdAt: String,
    val description: String,
    val id: Int,
    val rating: Int,
    val teacher: String,
    val updatedAt: String
)