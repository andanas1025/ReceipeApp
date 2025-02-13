package com.globant.recipeapp

data class Category(
    val strCategory: String,
    val strCategoryThmb: String,
    val strCategoryDescription: String
)

data class CategoryResponse(val categories: List<Category>)