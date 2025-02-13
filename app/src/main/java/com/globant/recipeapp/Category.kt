package com.globant.recipeapp

data class Category(
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CategoryResponse(val categories: List<Category>)