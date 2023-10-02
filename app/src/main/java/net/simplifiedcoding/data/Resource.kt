package net.simplifiedcoding.data

import java.lang.Exception

sealed class Resource<out R> {
    data class Success<out R>(val result: R) : Resource<R>() //holds data returned if successful
    data class Failure(val exception: Exception): Resource<Nothing>()
    object Loading: Resource<Nothing>() //holds the loading state
}