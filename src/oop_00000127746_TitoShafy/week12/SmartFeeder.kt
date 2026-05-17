package oop_00000127746_TitoShafy.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean) : Int {
    require(requestedGram > 0) {"Porsi kibble harus lebih dari 0 gr"}

    if(isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1: EKSEKUSI DENGAN MULTIPLE CATCH ===")
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Caught Hardware Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Stock Error: ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n=== JADWAL MAKAN 2: EKSEKUSI DENGAN RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }
}