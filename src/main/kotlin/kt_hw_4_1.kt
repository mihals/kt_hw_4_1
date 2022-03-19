package ru.netology

fun main() {
    val transferValue: Int = 20_000_00
    val monthSum: Int = 75_000_00
    val daySum: Int = 110_000_00
    val cardType: String = "Visa"
    val comission: Int = getComission(cardType, monthSum, daySum, transferValue)

    if (comission < 0) {
        println("Перевод невозможен")
    } else {
        println("Размер комиссии $comission копеек")
    }
}


fun getComission(
    cardType: String = "vkPay", monthSum: Int = 0,
    daySum: Int, transfer: Int
): Int {
    when (cardType) {
        "Master", "Maestro" -> {
            if ((transfer + monthSum > 600_000_00) ||
                (transfer + daySum > 150_000_00)
            ) return -1
            return if (transfer + monthSum > 75_000_00) (transfer * 0.006).toInt() + 20_00
            else 0
        }
        "Visa", "Mir" -> {
            if ((transfer + monthSum > 600_000_00) ||
                (transfer + daySum > 150_000_00)
            ) return -1
            return if ((transfer * 0.0075).toInt() > 35_00) (transfer * 0.0075).toInt()
            else 35_00
        }
        else -> {
            if ((transfer > 15_000_00) || (transfer + monthSum > 40_000_00)) return -1
            return 0
        }
    }
}