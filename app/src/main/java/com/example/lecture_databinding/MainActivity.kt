package com.example.lecture_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lecture_databinding.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    //databinding 위해 필요한 것
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //findViewById 방식과 DataBinding 방식의 차이점

        // 1번 방식 - findViewById
        // 버튼을 클릭하면 toast message가 뜨도록 한다.
//        val btn = findViewById<Button>(R.id.testBtnId)
//        btn.setOnClickListener{
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
//        }

        // 2번 방식 - DataBinding

        // 2-1. dataBinding 추가
        // 아래 문장을 build.gradle에 추가한다.
        //     dataBinding{
        //        enabled true
        //    }

        // 2-2. activity_main.xml
        // xml 파일에 있는 걸 <layout></layout>으로 감싸준다.

        //그리고 아래 문장들 작성
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //binding.dice1을 통해 dice1 이미지 찾아옴. 그걸 diceImage1에 저장
        val diceImage1 = binding.dice1

        val diceImage2 = binding.dice2


        binding.DiceStartBtn.setOnClickListener{
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
            Toast.makeText(this, "주사위 GO!", Toast.LENGTH_LONG).show()

            // 1부터 6까지의 정수를 랜덤으로 뽑아서 string형으로 바꿔라
            Log.d("MainActivity", Random.nextInt(1, 6).toString())
            Log.d("MainActivity", Random.nextInt(1, 6).toString())


            val number1 = Random.nextInt(1, 6)
            val number2 = Random.nextInt(1, 6)


            if (number1 == 1){
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else {
                diceImage1.setImageResource(R.drawable.dice_6)
            }


            if (number2 == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if(number2 == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if(number2 == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if(number2 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if(number2 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else {
                diceImage2.setImageResource(R.drawable.dice_6)
            }







        }


    }
}