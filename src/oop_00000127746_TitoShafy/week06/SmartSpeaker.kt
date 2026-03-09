package oop_00000127746_TitoShafy.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name Speaker aktif, menunggu perintah suara.")
    }

    override fun turnOff() {
        println("$name Speaker nonaktif.")
    }

    fun playMusic(song: String) {
        println("$name Memutar lagu $song dari Spotify.")
    }
}