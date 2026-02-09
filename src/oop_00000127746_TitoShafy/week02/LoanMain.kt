package oop_00000127746_TitoShafy.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- Library Input System ---")

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()
    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()
    print("Masukkan lama peminjaman: ")
    var loanDuration = scanner.nextInt()
    scanner.nextLine()

    if (loanDuration < 0) {
        println("Durasi tidak valid, set ke default")
        loanDuration = 1
    }

    val currentLoan = Loan(bookTitle, borrower, loanDuration)

    println("\n--- Detail Peminjaman ---")
    println("Judul buku: ${currentLoan.bookTitle}")
    println("Nama peminjam: ${currentLoan.borrower}")
    println("Durasi pemenjaman: ${currentLoan.loanDuration} Hari")

    val fine = currentLoan.calculateFine()
    println("Total denda: Rp. $fine")

    if (fine > 0) {
        println("Harap segera mengembalikan buku")
    } else {
        println("Terima kasih telah mengembalikan buku tepat waktu")
    }
}