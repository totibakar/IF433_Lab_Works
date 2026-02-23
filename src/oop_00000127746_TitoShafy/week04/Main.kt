package oop_00000127746_TitoShafy.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Porsche", 4, 100)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()
}