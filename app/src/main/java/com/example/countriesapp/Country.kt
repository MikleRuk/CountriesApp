package com.example.countriesapp

data class Country (
    val name: String,
    val capitals:String,
    val population: Long,
    val area: Long,
    val languages: List<Languages>,
    val flag: String
)

data class Languages(
    val name: String
)
//data class Names(
//    val official: String
//)
//data class Capitals(
//    val capital: String
//)
