package oop_00000127746_TitoShafy.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}