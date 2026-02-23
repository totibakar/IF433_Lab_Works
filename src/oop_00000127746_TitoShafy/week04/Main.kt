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

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Verstapped", baseSalary = 8000000)
    val developer = Developer(name = "Tsunoda", baseSalary = 6000000, programmingLanguage = "Java")
    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")
    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}