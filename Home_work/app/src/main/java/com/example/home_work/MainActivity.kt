package com.example.home_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number:Int = 0
    var aa = 0
    var bb = ""
    var cc = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        one.setOnClickListener{
            if (show.text.toString() == "0"){

                show.setText("1")
            }
            else{
                var str = show.text.toString().plus(1)
                show.setText(str)
            }
        }
        two.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("2")
            }
            else{
                var str = show.text.toString().plus(2)
                show.setText(str)
            }
        }
        three.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("3")
            }
            else{
                var str = show.text.toString().plus(3)
                show.setText(str)
            }
        }
        four.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("4")
            }
            else{
                var str = show.text.toString().plus(4)
                show.setText(str)
            }
        }
        five.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("5")
            }
            else{
                var str = show.text.toString().plus(5)
                show.setText(str)
            }
        }
        six.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("6")
            }
            else{
                var str = show.text.toString().plus(6)
                show.setText(str)
            }
        }
        seven.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("7")
            }
            else{
                var str = show.text.toString().plus(7)
                show.setText(str)
            }
        }
        eight.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("8")
            }
            else{
                var str = show.text.toString().plus(8)
                show.setText(str)
            }
        }
        nine.setOnClickListener{
            if (show.text.toString() == "0"){
                show.setText("9")
            }
            else{
                var str = show.text.toString().plus(9)
                show.setText(str)
            }
        }
        zero.setOnClickListener{
            if (show.text.toString() == "0"){

            }
            else {
                var str = show.text.toString().plus(0)
                show.setText(str)
            }
        }

        clear.setOnClickListener{
            show.setText("0")
        }

        del.setOnClickListener{
            if(show.text.toString().length<=1){
                show.setText("0")
            }
            else if(show.text.isNotEmpty()) {
                show.text=show.text.dropLast(1)
            }
        }
        plus.setOnClickListener {
            number = show.text.toString().toInt()
            aa = 1
            bb = "plus"
            cc = number + show.text.toString().toInt()
            show.setText(cc.toString())
        }
        minus.setOnClickListener {
            number = show.text.toString().toInt()
            aa = 1
           bb = "minus"
            cc = number - show.text.toString().toInt()
            show.setText(cc.toString())
        }
        mul.setOnClickListener {
            number = show.text.toString().toInt()
            aa = 1
            bb = "mul"
            cc = number * show.text.toString().toInt()
            show.setText(cc.toString())
        }
        slash.setOnClickListener {
            number = show.text.toString().toInt()
            aa = 1
            bb = "slash"
            cc = number / show.text.toString().toInt()
            show.setText(cc.toString())
        }
        per.setOnClickListener {
            number = show.text.toString().toInt()
            aa = 1
            bb = "per"
            cc = number % show.text.toString().toInt()
            show.setText(cc.toString())
        }
        tt.setOnClickListener {
            if(bb == "plus") {
                cc = number + show.text.toString().toInt()
                show.setText(cc.toString())
            }
            else if (bb == "minus"){
                cc = number - show.text.toString().toInt()
                show.setText(cc.toString())

            }
            else if (bb == "mul"){
                cc = number * show.text.toString().toInt()
                show.setText(cc.toString())
            }
            else if (bb == "slash"){
                cc = number / show.text.toString().toInt()
                show.setText(cc.toString())
            }
            else if (bb == "per"){
                cc = number % show.text.toString().toInt()
                show.setText(cc.toString())
            }

        }
    }
}






