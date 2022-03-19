package ru.netology

import org.junit.Test

import org.junit.Assert.*

class Kt_hw_4_1KtTest {

    @Test
    fun getComission_VKPayMonthLimitOff() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 40_000_00
        val daySum: Int = 0
        val cardType: String = "vkPay"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_VKPayTransferLimitOff() {
        val transferValue: Int = 15_000_01
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "vkPay"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_VKPayTransferGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "vkPay"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(0, result)
    }

    @Test
    fun getComission_MirMonthLimitOff() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 600_000_01
        val daySum: Int = 0
        val cardType: String = "Mir"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_VisaMonthLimitOff() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 750_000_00
        val daySum: Int = 0
        val cardType: String = "Visa"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_MasterMonthLimitOff() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 750_000_00
        val daySum: Int = 0
        val cardType: String = "Master"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_MaestroMonthLimitOff() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 750_000_00
        val daySum: Int = 0
        val cardType: String = "Maestro"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_MirMonthLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Mir"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_VisaMonthLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Visa"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_MasterMonthLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Master"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_MaestroMonthLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Maestro"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_MirDayLimitOff() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 150_000_00
        val cardType: String = "Mir"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_VisaDayLimitOff() {
        val transferValue: Int = 20_000_00
        val monthSum: Int = 75_000_00
        val daySum: Int = 150_000_00
        val cardType: String = "Visa"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_MasterDayLimitOff() {
        val transferValue: Int = 20_000_00
        val monthSum: Int = 75_000_00
        val daySum: Int = 150_000_00
        val cardType: String = "Master"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_MaestroDayLimitOff() {
        val transferValue: Int = 20_000_00
        val monthSum: Int = 75_000_00
        val daySum: Int = 150_000_00
        val cardType: String = "Maestro"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_MirDayLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Mir"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_VisaDayLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Visa"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_MasterDayLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Master"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_MaestroDayLimitGood() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 0
        val daySum: Int = 0
        val cardType: String = "Maestro"

        val result=getComission(
            cardType=cardType,
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertNotEquals(-1, result)
    }

    @Test
    fun getComission_DefaultMonthLimitOff() {
        val transferValue: Int = 1_000_00
        val monthSum: Int = 40_000_00
        val daySum: Int = 0

        val result=getComission(
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_DefaultTransferLimitOff() {
        val transferValue: Int = 15_000_01
        val monthSum: Int = 0
        val daySum: Int = 0

        val result=getComission(
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }

    @Test
    fun getComission_DefaultTransferLimitGood() {
        val transferValue: Int = 10_000_00
        val monthSum: Int = 0
        val daySum: Int = 0

        val result=getComission(
            monthSum=monthSum,
            daySum=daySum,
            transfer =  transferValue
        )

        assertEquals(-1, result)
    }
}