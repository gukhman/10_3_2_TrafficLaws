package com.example.trafficlaws

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var checkBox: CheckBox
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        checkBox = findViewById(R.id.checkBox)
        textView = findViewById(R.id.textView)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) textView.text =
                """11.1. Прежде чем начать обгон, водитель обязан убедиться в том, что полоса движения, на которую он собирается выехать, свободна на достаточном для обгона расстоянии и в процессе обгона он не создаст опасности для движения и помех другим участникам дорожного движения.

11.2. Водителю запрещается выполнять обгон в случаях, если:

транспортное средство, движущееся впереди, производит обгон или объезд препятствия;

транспортное средство, движущееся впереди по той же полосе, подало сигнал поворота налево;

следующее за ним транспортное средство начало обгон;

по завершении обгона он не сможет, не создавая опасности для движения и помех обгоняемому транспортному средству, вернуться на ранее занимаемую полосу.

11.3. Водителю обгоняемого транспортного средства запрещается препятствовать обгону посредством повышения скорости движения или иными действиями."""
            else textView.text = getString(R.string.checkBoxInfo)
        }

    }
}