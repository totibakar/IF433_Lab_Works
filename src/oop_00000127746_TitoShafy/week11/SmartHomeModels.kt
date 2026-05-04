package oop_00000127746_TitoShafy.week11

data class SmartDevice(var name: String, var category: String, var isOnline: Boolean = false, var powerLoad: Int = 0)
fun SmartDevice.diagnose(): String{
    return "[DIAGNOSTIKE] $name | Kategori: $category | Status: ${if (isOnline) "Online" else "Offline"} | Daya: $powerLoad Watt"
}
