package dev.logarithmus.simplecalc.operation

import dev.logarithmus.simplecalc.operation.base.BinaryOperation
import dev.logarithmus.simplecalc.operation.base.Operation

class MultiplyOperation(baseValue: Double, secondValue: Double) : BinaryOperation(baseValue, secondValue), Operation {

    override fun getResult() = baseValue * secondValue
}
