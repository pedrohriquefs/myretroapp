package com.apress.myretroapp.persistence

interface Repository<D, ID> {
    fun save(domain: D): D

    fun findByID(id: ID): D

    fun findAll(): Iterable<D>

    fun delete(id: ID)
}
