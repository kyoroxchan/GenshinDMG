package app.nakamura.kyoro.genshindm

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultNCDData = findViewById<TextView>(R.id.nonCriticalDmgNumber)
        val resultCDData = findViewById<TextView>(R.id.criticalDmgNumber)
        val resultECDData = findViewById<TextView>(R.id.exCriticalDmgNumber)
        val data = intent.getSerializableExtra("PersonalData") as PersonalData

        val nonCriDame = data.NonCriticalDamage
        val criDame = data.CriticalDamage
        val exCriDame = data.CriticalDamageEx

        val resultNonCriDame: String = java.lang.String.valueOf(nonCriDame)
        resultNCDData.setText(resultNonCriDame);

        val resultCriDame: String = java.lang.String.valueOf(criDame)
        resultCDData.setText(resultCriDame);

        val resultExCriDame: String = java.lang.String.valueOf(exCriDame)
        resultECDData.setText(resultExCriDame);

        }
    }

