package com.example.kotlinbasic_20220220

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
            Log.d("메인화면", "로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 버튼 눌림")

        }

        btnToast.setOnClickListener {

//  토스트 띄워보자
            Toast.makeText(this, "토스트 버튼 눌림", Toast.LENGTH_SHORT).show()

        }

        btnVariablePractice.setOnClickListener {

//        var / val 에 대한 연습 / 체험

            var myName: String // 내용 교체가 가능
            val friendName: String // 한번 대입하면 값으로 고정
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

            if (userAge >= 20) {

                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()
            } else if (userAge >= 17) {
//            위의 질문이 틀렸을 때의 보완 질문 추가 -> 고등학생인가?
                Toast.makeText(this, "고등학생입니다.", Toast.LENGTH_SHORT).show()
            } else if (userAge >= 14) {
//            위의 질문이 틀렸을 때 보완 질문 추가
                Toast.makeText(this, "중학생입니다.", Toast.LENGTH_SHORT).show()
            } else {

                Toast.makeText(this, "초등학생 혹은 그 이하 입니다.", Toast.LENGTH_SHORT).show()
            }
        }

        btnConditionPractice2.setOnClickListener {

            val salary = 4000
            val minutes = 50
            val overWork = false

//        기준 1. 연봉 5000 이상이면 ok

            if (salary >= 5000) {
                Toast.makeText(this, "연봉 5천 이상", Toast.LENGTH_SHORT).show()
            }

//        기준 2. 야근만 안하면 ok

            if (!overWork) { // overWork 변수에 , true가 있을때만 실행.
                Toast.makeText(this, "야근을 안함", Toast.LENGTH_SHORT).show()
            }

//        기준 3. 연봉 4000 이상 and 거리는 30분 이내면 ok

            if (salary >= 4000 && minutes < 30) {
                Toast.makeText(this, "연봉 AND 출퇴근 시간 OK", Toast.LENGTH_SHORT).show()
            }

//        기준 4. 연봉 5000 이상 or 거리 1시간 이내
            if (salary >= 5000 || minutes < 60) {
                Toast.makeText(this, "연봉 OR 출퇴근 OK", Toast.LENGTH_SHORT).show()
            }
        }

        btnCalculateAge.setOnClickListener {

//            1. edtBirthYear에 입력된 값을 받아오기 => 변수에 저장하기

            val inputBirthYear = edtBirthYear.text.toString()

            Log.d("입력된 년도", inputBirthYear)
        }
    }
}