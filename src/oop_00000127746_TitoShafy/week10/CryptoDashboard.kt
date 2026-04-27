package oop_00000127746_TitoShafy.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.523))
    coinRepo.add(Coin("ETH", 4.12))
    coinRepo.add(Coin("USDT", 1500.0))
}