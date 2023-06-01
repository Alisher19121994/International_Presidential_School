package com.international_presidential_school.models.rating

class RatingRequest{
    var teacher: String?=null
    val createdAt: String?=null
    var description: String?=null
    var id: Int?=null
    var rating: String?=null
    val updatedAt: String?=null

    constructor(id: Int?) {
        this.id = id
    }

    constructor( teacher: String?,description: String?, rating: String?) {
        this.teacher = teacher
        this.description = description
        this.rating = rating
    }
}