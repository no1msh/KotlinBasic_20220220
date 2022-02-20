package com.example.kotlinbasic_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//  Ctrl + / => 현재 줄을 주석으로.
//  btnLog 버튼이 클릭되면 해야할 일을 지정.

    btnLog.setOnClickListener {

//  로그버튼이 눌릴떄 마다 실행될 코드 { }
//  로그를 찍어보자
        Log.d("메인화면","로그 버튼 눌림")
        Log.e("메인화면","e로 로그 버튼 눌림")

    }

    btnToast.setOnClickListener {

//  토스트 띄워보자
        Toast.makeText(this, "토스트 버튼 눌림", Toast.LENGTH_SHORT).show()

    }

    btnVariablePractice.setOnClickListener {

//        var / val 에 대한 연습 / 체험

        var myName : String // 내용 교체가 가능
        val friendName : String // 한번 대입하면 값으로 고정
//        myName - 내이름 , friendName - 친구 이름

        myName = "문상현"

        friendName = "문현상"

//        내이름 / 친구이름 다시 대입 ( 데이터 변경 )

        myName = "문다성"  // 추가로 다시 대입해도 됨.

//        friendName = "문상민"  // 한번 넣은거로 계속 사용. val 이기 때문에
        Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()
    }
        
    btnConditionPractice.setOnClickListener { 
        
        val userAge = 15
        
        if ( userAge >= 20) {

            Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
        }
        else {

            Toast.makeText(this, "미성년자입니다.", Toast.LENGTH_SHORT).show()
        }
    }    
    }
}