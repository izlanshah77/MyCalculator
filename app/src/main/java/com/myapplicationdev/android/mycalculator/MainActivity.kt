package com.myapplicationdev.android.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1 = ""
    var operation = ""
    var number2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAC.setOnClickListener{
            tv.text = "0"
        }
    }

    fun btnOnClick(view: View){
        val btnSelected = view as Button
        when(btnSelected.id){
            btn1.id ->{
                tv.append(btn1.text)
            }
            btn2.id ->{
                tv.append(btn2.text)
            }
            btn3.id ->{
                tv.append(btn3.text)
            }
            btn4.id ->{
                tv.append(btn4.text)
            }
            btn5.id ->{
                tv.append(btn5.text)
            }
            btn6.id ->{
                tv.append(btn6.text)
            }
            btn7.id ->{
                tv.append(btn7.text)
            }
            btn8.id ->{
                tv.append(btn8.text)
            }
            btn9.id ->{
                tv.append(btn9.text)
            }
            btn0.id ->{
                tv.append(btn0.text)
            }

        }
    }

    fun btnOnClickOp(view: View){
        val btnSelected = view as Button
        when(btnSelected.id){
            btnPlus.id ->{
                number1 = tv.text.toString()
                tv.text = "0"
                operation = "+"
            }
            btnDivide.id ->{
                number1 = tv.text.toString()
                tv.text = "0"
                operation = "/"
            }
            btnSubtract.id ->{
                number1 = tv.text.toString()
                tv.text = "0"
                operation = "-"
            }
            btnMultiply.id ->{
                number1 = tv.text.toString()
                tv.text = "0"
                operation = "*"
            }
        }
    }

    fun btnOnClickEqual(view: View){
        val btnSelected = view as Button
        when(btnSelected.id){
            btnEqual.id ->{
                var num1 = number1.toInt()
                var num2 = tv.text.toString().toInt()
                var ans = 0
                if(operation == "*"){
                    ans = num1 * num2
                }else if(operation == "+"){
                    ans = num1 + num2
                }else if(operation == "/"){
                    ans = num1 / num2
                }else if(operation == "-"){
                    ans = num1 - num2
                }
                tv.text = ans.toString()
            }
        }
    }
}
