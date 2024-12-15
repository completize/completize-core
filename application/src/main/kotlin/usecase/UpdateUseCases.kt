package com.completize.core.application.usecase

import com.completize.core.application.UseCase

/*
    Update Use Case Interface
    T: type | R: return
*/
interface UpdateUseCase<T, R>: UseCase {
    fun update(value: T): R
}

/*
    Update For Use Case Interface
    K: key | T: type | R: return
*/
interface UpdateForUseCase<K, T, R>: UseCase {
    fun update(key: K, value: T): R
}