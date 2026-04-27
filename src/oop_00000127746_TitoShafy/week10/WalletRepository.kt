package oop_00000127746_TitoShafy.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(query: (T) -> Boolean, list: List<T>): List<T> {
        return items.filter(query)
    }
}