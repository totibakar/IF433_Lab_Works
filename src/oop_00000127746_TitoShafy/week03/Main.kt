package oop_00000127746_TitoShafy.week03

fun main() {
    val e = Employee("Budi")

    // 1. test validasi salary
    e.salary = -1000 // harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. test encapsulation
    e.increasePerfomance()
    // e.perfomanceRating = 5

    // 3. test computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}