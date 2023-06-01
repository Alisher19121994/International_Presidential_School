package com.international_presidential_school.models.ratings

data class RatingDataItem(
    val createdAt: String,
    val description: String,
    val id: Int,
    val rating: Int,
    val teacher: String,
    val updatedAt: String
)