package dev.logarithmus.simplecalc.operation

import dev.logarithmus.simplecalc.operation.base.BinaryOperation
import dev.logarithmus.simplecalc.operation.base.Operation

class DivideOperation(baseValue: Double, secondValue: Double) : BinaryOperation(baseValue, secondValue), Operation {

    override fun getResult(): Double {
        var result = 0.0
        if (secondValue != 0.0) {
            result = baseValue / secondValue
        }
        return result
    }
}
