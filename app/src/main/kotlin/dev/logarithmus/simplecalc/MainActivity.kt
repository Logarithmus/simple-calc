package dev.logarithmus.simplecalc

import android.app.Activity
import android.content.Context
import android.os.Bundle
import dev.logarithmus.simplecalc.helpers.*
import kotlinx.android.synthetic.main.activity_main.*
import org.logarithmus.simplecalc.R

class MainActivity: Activity(), Calculator {
    lateinit var calc: CalculatorImpl

    private fun getButtonIds() = arrayOf(btn_dot, btn_0,
        btn_1, btn_2, btn_3,
        btn_4, btn_5, btn_6,
        btn_7, btn_8, btn_9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calc = CalculatorImpl(this, applicationContext)

        btn_plus.setOnClickListener { calc.handleOperation(PLUS) }
        btn_minus.setOnClickListener { calc.handleOperation(MINUS) }
        btn_mult.setOnClickListener { calc.handleOperation(MULTIPLY) }
        btn_divide.setOnClickListener { calc.handleOperation(DIVIDE) }
        btn_clear.setOnClickListener { calc.handleOperation(CLEAR) }
        btn_reset.setOnClickListener { calc.handleReset() }

        btn_clear.setOnClickListener { calc.handleClear() }
        btn_clear.setOnLongClickListener { calc.handleReset(); true }

        getButtonIds().forEach { it.setOnClickListener { calc.numpadClicked(it.id) }
        }

        btn_equals.setOnClickListener { calc.handleEquals() }
    }

    override fun setValue(value: String, context: Context) {
        result.text = value
    }

    override fun setValueDouble(d: Double) {
        calc.setValue(Formatter.doubleToString(d))
        calc.lastKey = DIGIT
    }

    override fun setFormula(value: String, context: Context) {
        formula.text = value
    }
}
