package oop_00000127746_TitoShafy.week03

fun main() {
    val user = Player("Kirito")
    println("INFO: Akses langsung ke XP tidak bisa dilakukan karena bersifat private.")

    println("\nMenambah 50 XP")
    user.addXp(50)
    println("Level saat ini: ${user.level}")

    println("\nMenambah 60 XP lagi")
    user.addXp(60)
    println("Level akhir: ${user.level}")
}