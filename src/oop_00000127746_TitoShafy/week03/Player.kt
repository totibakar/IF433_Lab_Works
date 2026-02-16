package oop_00000127746_TitoShafy.week03

class Player(val username: String) {
    private var xp: Int = 0
    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if(amount > 0) {
            val previousLevel = level
            xp += amount

            if(level > previousLevel) {
                println("Level up! Selamat $username naik ke level $level")
            }
        } else{
            println("Jumlah XP harus positif!")
        }
    }
}

