package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv_result:TextView
    lateinit var tv_cal:TextView
    var arg1 = 0
    var arg2 = 0
    private var Result = 0
    var preCal = 5
    var curCal = 5
    var error = false
    var isResult = false
    private fun reset(){
        arg1 = 0
        arg2 = 0
        Result = 0
        preCal = 5
        curCal = 5
        error = false
        isResult = false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_result = findViewById<TextView>(R.id.tv_result)
        tv_cal = findViewById<TextView>(R.id.tv_cal)

        findViewById<Button>(R.id.btn_0).setOnClickListener {
            clickDigit("0")
        }
        findViewById<Button>(R.id.btn_1).setOnClickListener {
            clickDigit("1")
        }
        findViewById<Button>(R.id.btn_2).setOnClickListener {
            clickDigit("2")
        }
        findViewById<Button>(R.id.btn_3).setOnClickListener {
            clickDigit("3")
        }
        findViewById<Button>(R.id.btn_4).setOnClickListener {
            clickDigit("4")
        }
        findViewById<Button>(R.id.btn_5).setOnClickListener {
            clickDigit("5")
        }
        findViewById<Button>(R.id.btn_6).setOnClickListener {
            clickDigit("6")
        }
        findViewById<Button>(R.id.btn_7).setOnClickListener {
            clickDigit("7")
        }
        findViewById<Button>(R.id.btn_8).setOnClickListener {
            clickDigit("8")
        }
        findViewById<Button>(R.id.btn_9).setOnClickListener {
            clickDigit("9")
        }
        findViewById<Button>(R.id.btn_ce).setOnClickListener {
            if (error){
                reset()
                tv_cal.text = ""
                tv_result.text = "0"
            }
            tv_result.text = "0"
        }
        findViewById<Button>(R.id.btn_c).setOnClickListener {
            tv_cal.text = ""
            tv_result.text = "0"
            reset();
        }
        findViewById<Button>(R.id.btn_bs).setOnClickListener {
            if (error){
                reset()
                tv_cal.text = ""
                tv_result.text = "0"
            }
            isResult = false
            tv_result.text = (tv_result.text.toString().toInt() / 10).toString();
        }
        findViewById<Button>(R.id.btn_add).setOnClickListener {
            calExec(1, " + ")
        }
        findViewById<Button>(R.id.btn_sub).setOnClickListener {
            calExec(2, " - ")
        }
        findViewById<Button>(R.id.btn_X).setOnClickListener {
            calExec(3, " x ")
        }
        findViewById<Button>(R.id.btn_devide).setOnClickListener {
            calExec(4, " / ")
        }
        findViewById<Button>(R.id.btn_result).setOnClickListener {
            preCal = curCal
            curCal = 5
            if (error){
                reset()
                tv_cal.text = ""
                tv_result.text = "0"
            }
            if(preCal == 5){
                Result = tv_result.text.toString().toInt()
                tv_cal.text = Result.toString() +" = "
                tv_result.text = Result.toString()
            }else if(preCal == 1){
                arg2 = tv_result.text.toString().toInt()
                Result = arg1 + arg2
                tv_cal.text = arg1.toString() + " + " + arg2.toString() + " = "
                tv_result.text = Result.toString()
            }else if(preCal == 2){
                arg2 = tv_result.text.toString().toInt()
                Result = arg1 - arg2
                tv_cal.text = arg1.toString() + " - " + arg2.toString() + " = "
                tv_result.text = Result.toString()
            }else if(preCal == 3){
                arg2 = tv_result.text.toString().toInt()
                Result = arg1 * arg2
                tv_cal.text = arg1.toString() + " x " + arg2.toString() + " = "
                tv_result.text = Result.toString()
            }else{
                arg2 = tv_result.text.toString().toInt()
                if (arg2 == 0){
                    tv_result.text = "Can't not devide by 0"
                    error = true
                    tv_cal.text = arg1.toString() + " / " + arg2.toString() + " = "
                }else{
                    Result = arg1 / arg2
                    tv_cal.text = arg1.toString() + " / " + arg2.toString() + " = "
                    tv_result.text = Result.toString()
                }
            }
            arg1 = Result
        }
    }
    fun calExec(cal: Int, calSymbol: String ){
        preCal = curCal
        curCal = cal
        if (error){
            reset()
            tv_cal.text = ""
            tv_result.text = "0"
        }
        if(preCal == 5){
            Result = tv_result.text.toString().toInt()
            tv_cal.text = Result.toString() +calSymbol
            tv_result.text = Result.toString()
        }else if(preCal == 1){
            arg2 = tv_result.text.toString().toInt()
            Result = arg1 + arg2
            tv_cal.text = Result.toString() +calSymbol
            tv_result.text = Result.toString()
        }else if(preCal == 2){
            arg2 = tv_result.text.toString().toInt()
            Result = arg1 - arg2
            tv_cal.text = Result.toString() +calSymbol
            tv_result.text = Result.toString()
        }else if(preCal == 3){
            arg2 = tv_result.text.toString().toInt()
            Result = arg1 * arg2
            tv_cal.text = Result.toString() +calSymbol
            tv_result.text = Result.toString()
        }else{
            arg2 = tv_result.text.toString().toInt()
            if (arg2 == 0){
                tv_result.text = "Can't not devide by 0"
                error = true
                tv_cal.text = arg1.toString() + " / " + arg2.toString() +calSymbol
            }else{
                Result = arg1 / arg2
                tv_cal.text = Result.toString() +calSymbol
                tv_result.text = Result.toString()
            }
        }
        arg1 = Result
        isResult = true
    }
    fun clickDigit(digit:String){
        if (error){
            reset()
            tv_cal.text = ""
            tv_result.text = "0"
        }else{
            if (tv_result.text.toString().toInt() == 0){
                tv_result.text = digit
            }else if(isResult){
                tv_result.text = digit
                isResult = false
            }
            else{
                tv_result.text = tv_result.text.toString() + digit
            }
        }
    }
}