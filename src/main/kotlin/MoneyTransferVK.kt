package ru.netology

fun main() {
    val amount: Int = 500000
    val commissionPercent: Double = 0.75
    val minCommision: Int = 3500

    val commision = amount / 100 * commissionPercent
    val finalCommission =
        if (commision < minCommision) {
            minCommision
        } else {
            commision
        }
    println("Итоговая комиссия $finalCommission копеек")
}