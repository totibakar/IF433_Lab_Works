package oop_00000127746_TitoShafy.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { writer.println(it.toCsv()) }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File trades tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 50.0, 12.5),
        TradeRecord(2, "ETHUSDT", "Short", 30.0, -5.2)
    )
    saveTrades(mockTrades, "crypto_trades.csv")
    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")
    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== LOADED TRADES RECORDS ===")
    loadedData.forEach { println(it) }
    println("==== TOTAL PnL BERSIH: $totalPnl ====")
}