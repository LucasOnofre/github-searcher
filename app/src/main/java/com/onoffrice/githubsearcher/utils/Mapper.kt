package com.onoffrice.githubsearcher.utils

interface Mapper<S, T> {
    fun map(source: S): T
}