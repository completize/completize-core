package com.completize.core.application.usecase

import com.completize.core.application.UseCase

/*
    Delete Use Case Interface
    T: type
*/
interface DeleteUseCase<T>: UseCase {
    fun delete(value: T)
}

/*
    Delete For Use Case Interface
    K: key | T: type
*/
interface DeleteForUseCase<K, T>: UseCase {
    fun delete(key: K, value: T)
}

/*
    Delete All Use Case Interface
    T: type
*/
interface DeleteAllUseCase<T>: UseCase {
    fun deleteAll(value: T)
}

/*
    Delete All For Use Case Interface
    K: key | T: type
*/
interface DeleteAllForUseCase<K, T>: UseCase {
    fun deleteAll(key: K, value: T)
}