package oop_00000127746_TitoShafy.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name Lampu menyala terang.")
    }

    override fun turnOff() {
        println("$name Lampu dimatikan.")
    }
}