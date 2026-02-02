package oop_00000127746_TitoShafy.week01

fun main() {
    val gameTitle = "Microsoft Flight Simulator (2020) Premium Deluxe 40th"
    val price = 900000
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.2).toInt()
} else {
    (price * 0.1).toInt()
}