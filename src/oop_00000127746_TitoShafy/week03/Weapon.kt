package oop_00000127746_TitoShafy.week03

class Weapon(val name: String, damage: Int) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Damage value tidak boleh negatif! Nilai tidak akan diubah.")
            } else if (value > 1000) {
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }

    init {
        this.damage = damage
    }
}