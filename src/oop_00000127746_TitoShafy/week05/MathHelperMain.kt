package oop_00000127746_TitoShafy.week05

fun main() {
    println("=== TES OVERLOADING MATHHELPER ===")
    val mathHelper = MathHelper()

    println("Luas Persegi (sisi 5): ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang (5x10): ${mathHelper.hitungLuas(5, 10)}")
    println("Luas Lingkaran (jari-jari 7.0): ${mathHelper.hitungLuas(7.0)}")
}