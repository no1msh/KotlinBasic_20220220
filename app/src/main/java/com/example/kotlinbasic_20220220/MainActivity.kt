package com.example.kotlinbasic_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    }
}