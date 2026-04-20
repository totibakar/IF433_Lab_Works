package oop_00000127746_TitoShafy.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, 30.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, -12.4, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 5.0, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 20, -2.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}