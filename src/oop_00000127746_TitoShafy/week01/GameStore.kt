package oop_00000127746_TitoShafy.week01

fun main() {
    val gameTitle = "Elden Ring: Shadow of the Erdtree"
    val price = 599000
    val userNote: String? = null
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.2).toInt()
} else {
    (price * 0.1).toInt()
}

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Struk Pembelian SteamKW")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}