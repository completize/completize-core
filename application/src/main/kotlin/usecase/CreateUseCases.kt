package com.completize.core.application.usecase

import com.completize.core.application.UseCase

/*
    Create Use Case Interface
    T: type | R: return
*/
interface CreateUseCase<T, R>: UseCase {
    fun create(value: T): R
}