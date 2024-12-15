package com.completize.core.application.usecase

import com.completize.core.application.UseCase
import com.completize.core.application.pagination.Page
import com.completize.core.application.pagination.PageResult

/*
    Fetch Use Case Interface
    T: type | R: return
*/
interface FetchUseCase<T, R>: UseCase {
    fun fetch(value: T): Collection<R>
}

/*
    Fetch Paged Use Case Interface
    R: return
*/
interface FetchPagedUseCase<R>: UseCase {
    fun fetchAll(page: Page): PageResult<R>
}

/*
    Fetch Paged For Use Case Interface
    K: key | R: return
*/
interface FetchPagedForUseCase<K, R>: UseCase {
    fun fetchAll(key: K, page: Page): PageResult<R>
}

/*
    Fetch All Use Case Interface
    R: return
*/
interface FetchAllUseCase<R>: UseCase {
    fun fetchAll(): Collection<R>
}

/*
    Fetch All For Use Case Interface
    K: key | R: return
*/
interface FetchAllForUseCase<K, R>: UseCase {
    fun fetchAll(key: K): Collection<R>
}