package com.example.testklotin

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_add__card.*;
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Calendar;

class Add_Card : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add__card)

        CreateTask.setBackgroundColor(Color.parseColor("#76dc58"));



        val cal = Calendar.getInstance();
        var ye: String = " ";
        var mo: String = " ";
        var day: String = " ";

        Calend.setOnClickListener {

            val y = cal.get(Calendar.YEAR);
            val m = cal.get(Calendar.MONTH);
            val d = cal.get(Calendar.DAY_OF_MONTH);

            val datepicker: DatePickerDialog = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                Dateshow.setText(""+dayOfMonth + "/ " + month + "/ " + year);
                ye = year.toString();
                mo = month.toString();
                day = dayOfMonth.toString();

            }, y,m,d);

            datepicker.show();

        }





        CreateTask.setOnClickListener {
            val text_Tit: String = TaskInputName?.text.toString();
            val text_Des: String = InputDesc?.text.toString();
            var card : ArrayListCard<Any?> = ArrayListCard(CardInfo(text_Tit,text_Des,LocalDateTime.now().toString(),"$day/$mo/$ye"));

            /*
            println("-> $ye");
            println("-> $mo");
            println("-> $day");
            println("text");
            println(text_Tit);

            println(text_Des);
            */

            card.add(CardInfo("teste1","teste testando oq e pra testar", LocalDateTime.now().toString(),LocalDate.now().toString() ) );

            println("entrou" + card.size());


        }


    }
}
