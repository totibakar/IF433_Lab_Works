package oop_00000127746_TitoShafy.week02

class Hero(val name: String, var hp: Int = 100, var baseDamage: Int) {
    fun attack(targetName: String){
        println("$name is attacking $targetName")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive(): Boolean = hp > 0
}