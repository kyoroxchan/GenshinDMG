package app.nakamura.kyoro.genshindm

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

//        val data = intent.getSerializableExtra("PersonalData") as PersonalData
        val bundle = intent.extras
        val resultDmgData = (bundle?.getParcelableArrayList<ResultDmgData>("resultDmgData") as ArrayList<ResultDmgData>)
        Log.d("DmgData",resultDmgData[0].resultName)


        }
    }

