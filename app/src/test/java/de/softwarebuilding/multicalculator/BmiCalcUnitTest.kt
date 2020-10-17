package de.softwarebuilding.multicalculator

import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

class BmiCalcUnitTest{
    @Test
    fun simpleBmiCalc_isCorrect() {
        val weightInKg = 100
        val heightInCm = 200
        val scrollingActivity = ScrollingActivity()
        val bmiResult = scrollingActivity.calculateBmi(weightInKg,heightInCm)
        assertEquals(25.0, bmiResult)
    }

}