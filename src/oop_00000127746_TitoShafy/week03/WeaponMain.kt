package oop_00000127746_TitoShafy.week03

fun main() {
    val myWeapon = Weapon("Excalibur", 500)
    println("--- Toko Senjata ---")

    println("Mencoba set damage ke -50")
    myWeapon.damage = -50

    println("Mencoba set damage ke 9999")
    myWeapon.damage = 9999

    println("Damage akhir: ${myWeapon.damage}")
    println("Tier Senjata: ${myWeapon.tier}")
}