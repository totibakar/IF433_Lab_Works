package oop_00000127746_TitoShafy.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name Power ON: Kamera aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("$name Power OFF: Kamera mati.")
        stopRecord()
    }

    override fun startRecord() {
        println("$name Memulai perekaman video...")
    }
}