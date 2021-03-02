package com.example.adopt_a_pup

import java.util.*

data class Puppy(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val age: Int,
    val gender: Gender,
    val breed: String,
    val imageUrl: String,
)

enum class Gender { Male, Female }