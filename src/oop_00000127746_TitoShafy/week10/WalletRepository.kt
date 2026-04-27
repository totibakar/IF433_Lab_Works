package oop_00000127746_TitoShafy.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {}

    fun getAll(): List<T> {}
}