package oop_00000127746_TitoShafy.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay Server") }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}