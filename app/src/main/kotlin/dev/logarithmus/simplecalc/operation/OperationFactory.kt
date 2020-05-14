package dev.logarithmus.simplecalc.operation

import dev.logarithmus.simplecalc.helpers.*
import dev.logarithmus.simplecalc.operation.base.Operation

object OperationFactory {

    fun forId(id: String, baseValue: Double, secondValue: Double): Operation? {
        return when (id) {
            PLUS -> PlusOperation(baseValue, secondValue)
            MINUS -> MinusOperation(baseValue, secondValue)
            DIVIDE -> DivideOperation(baseValue, secondValue)
            MULTIPLY -> MultiplyOperation(baseValue, secondValue)
            else -> null
        }
    }
}
