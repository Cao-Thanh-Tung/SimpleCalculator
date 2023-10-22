package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv_result: TextView = findViewById<TextView>(R.id.tv_result)
        val tv_cal: TextView = findViewById<TextView>(R.id.tv_cal)
        var preResult = 0;
        var cal = -1;
        findViewById<Button>(R.id.btn_0).setOnClickListener {
            if (tv_result.text.toString().toInt() != 0)
            tv_result.text = tv_result.text.toString() + "0"
        }
        findViewById<Button>(R.id.btn_1).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "1";
            }else{
                tv_result.text = tv_result.text.toString() + "1";
            }

        }
        findViewById<Button>(R.id.btn_2).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "2";
            }else{
                tv_result.text = tv_result.text.toString() + "2";
            }
        }
        findViewById<Button>(R.id.btn_3).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "3";
            }else{
                tv_result.text = tv_result.text.toString() + "3";
            }
        }
        findViewById<Button>(R.id.btn_4).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "4";
            }else{
                tv_result.text = tv_result.text.toString() + "4";
            }
        }
        findViewById<Button>(R.id.btn_5).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "5";
            }else{
                tv_result.text = tv_result.text.toString() + "5";
            }
        }
        findViewById<Button>(R.id.btn_6).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "6";
            }else{
                tv_result.text = tv_result.text.toString() + "6";
            }
        }
        findViewById<Button>(R.id.btn_7).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "7";
            }else{
                tv_result.text = tv_result.text.toString() + "7";
            }
        }
        findViewById<Button>(R.id.btn_8).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "8";
            }else{
                tv_result.text = tv_result.text.toString() + "8";
            }
        }
        findViewById<Button>(R.id.btn_9).setOnClickListener {
            if(tv_result.text.toString().toInt() == 0){
                tv_result.text =  "9";
            }else{
                tv_result.text = tv_result.text.toString() + "9";
            }
        }
        findViewById<Button>(R.id.btn_ce).setOnClickListener {
            tv_result.text = "0";
        }
        findViewById<Button>(R.id.btn_c).setOnClickListener {
            tv_cal.text = "";
            tv_result.text = "0";
        }
        findViewById<Button>(R.id.btn_bs).setOnClickListener {
            if (tv_result.text.length == 1){
                tv_result.text = "0";
            }else{
                tv_result.text = tv_result.text.subSequence(0,tv_result.text.length-1).toString();
            }

        }
        findViewById<Button>(R.id.btn_add).setOnClickListener {
            if (tv_cal.text.toString().compareTo("") == 0){
                tv_cal.text = tv_result.text.toString() + " + ";
            }else{
                if (cal == 5) {
                    tv_cal.text = tv_result.text.toString() + " + ";
                    tv_result.text = "0";
                }else if (cal == 1){
                    preResult = preResult + tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " + ";
                }else if (cal == 2){
                    preResult = preResult - tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " + ";
                }else if (cal == 3){
                    preResult = preResult * tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " + ";
                }else if (cal == 4){
                    preResult = preResult / tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " + ";
                }
            }
            tv_result.text = "0";
            cal = 1;
        }
        findViewById<Button>(R.id.btn_sub).setOnClickListener {
            if (tv_cal.text.toString().compareTo("") == 0){
                tv_cal.text = tv_result.text.toString() + " - ";
                tv_result.text = "0";
            }else{
                if (cal == 5) {
                    tv_cal.text = tv_result.text.toString() + " - ";
                    tv_result.text = "0";
                }else if (cal == 1){
                    preResult = preResult + tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " - ";
                }else if (cal == 2){
                    preResult = preResult - tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " - ";
                }else if (cal == 3){
                    preResult = preResult * tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " - ";
                }else if (cal == 4){
                    preResult = preResult / tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " - ";
                }
            }
            tv_result.text = "0";
            cal = 2;
        }
        findViewById<Button>(R.id.btn_X).setOnClickListener {
            if (tv_cal.text.toString().compareTo("") == 0){
                tv_cal.text = tv_result.text.toString() + " x ";
            }else{
                if (cal == 5) {
                    tv_cal.text = tv_result.text.toString() + " x ";
                    tv_result.text = "0";
                }else if (cal == 1){
                    preResult = preResult + tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " x ";
                }else if (cal == 2){
                    preResult = preResult - tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " x ";
                }else if (cal == 3){
                    preResult = preResult * tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " x ";
                }else if (cal == 4){
                    preResult = preResult / tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " x ";
                }
            }
            tv_result.text = "0";
            cal = 3;
        }
        findViewById<Button>(R.id.btn_devide).setOnClickListener {
            if (tv_cal.text.toString().compareTo("") == 0){
                tv_cal.text = tv_result.text.toString() + " / ";
            }else{
                if (cal == 5) {
                    tv_cal.text = tv_result.text.toString() + " / ";
                    tv_result.text = "0";
                }else if (cal == 1){
                    preResult = preResult + tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " / ";
                }else if (cal == 2){
                    preResult = preResult - tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " / ";
                }else if (cal == 3){
                    preResult = preResult * tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " / ";
                }else if (cal == 4){
                    preResult = preResult / tv_result.text.toString().toInt();
                    tv_cal.text = preResult.toString() + " / ";
                }
            }
            tv_result.text = "0";
            cal = 4;
        }
        findViewById<Button>(R.id.btn_result).setOnClickListener {
            if (tv_cal.text.toString().compareTo("") == 0){
                tv_cal.text = tv_result.text.toString();
            }else{
                if (cal == 5) {
                    tv_cal.text = tv_result.text.toString();
                    tv_result.text = "0";
                }else if (cal == 1){
                    tv_cal.text = preResult.toString() + " + " + tv_result.text.toString() +" = ";
                    preResult = preResult + tv_result.text.toString().toInt();
                }else if (cal == 2){
                    tv_cal.text = preResult.toString() + " - " + tv_result.text.toString() +" = ";
                    preResult = preResult - tv_result.text.toString().toInt();
                }else if (cal == 3){
                    tv_cal.text = preResult.toString() + " x " + tv_result.text.toString() +" = ";
                    preResult = preResult * tv_result.text.toString().toInt();
                }else if (cal == 4){
                    tv_cal.text = preResult.toString() + " / " + tv_result.text.toString() +" = ";
                    preResult = preResult / tv_result.text.toString().toInt();
                }
            }
            tv_result.text = preResult.toString();
            cal = 5;
        }
    }
}