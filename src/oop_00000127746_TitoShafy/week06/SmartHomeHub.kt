package oop_00000127746_TitoShafy.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Seluruh Perangkat ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}