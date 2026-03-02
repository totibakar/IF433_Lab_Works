package oop_00000127746_TitoShafy.week05

fun main() {
    println("=== TES PEMBAYARAN ===")
    val dompetVerstappen = EWallet("Max Verstappen", 50000.0)
    val kartuVerstappen = CreditCard("Max Verstappen", 100000.0)

    val paymentMethods: Array<PaymentMethod> = arrayOf(dompetVerstappen, kartuVerstappen)

    for (method in paymentMethods) {
        println("\nMemproses pembayaran untuk akun: ${method.accountName}")
        method.processPayment(75000.0)

    }
}