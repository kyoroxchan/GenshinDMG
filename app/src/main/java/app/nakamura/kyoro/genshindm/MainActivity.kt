package app.nakamura.kyoro.genshindm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    var charaSpinnerItem: String = ""
    var skillSpinnerItem1: String = ""
    var skillSpinnerItem2: String = ""
    var skillSpinnerItem3: String = ""

    var characterIndex:Int = 0

    val characterList:List<Character> = listOf(
        Character(name = "ディルック",skillList = mutableListOf(
            Skill(name = "通常攻撃・百煉の剣",
                normalAttack1 = mutableListOf(0.87,0.97,1.043,1.1473,1.2203,1.3038,1.4185,1.5332,1.6479,1.7731,1.9165,2.0852,2.2538,2.4225,2.6065),
                normalAttack2 = mutableListOf(0.8763,0.977,1.019,1.1209,1.1922,1.2738,1.3858,1.4979,1.61,1.7323,1.8724,2.0372,2.202,2.3667,2.5465),
                normalAttack3 = mutableListOf(0.9881,1.0686,1.149,1.2639,1.3443,1.4363,1.5626,1.689,1.8154,1.9533,2.113,2.2971,2.4829,2.6687,2.8714),
                normalAttack4 = mutableListOf(1.3399,1.4489,1.558,1.7138,1.8229,1.9475,2.1189,2.2903,2.4616,2.6486,2.8628,3.1148,3.3667,3.6186,3.8934),
                normalAttack5 = null,
                normalAttack6 = null,
                normalAttackName1 = "一段ダメージ",
                normalAttackName2 = "二段ダメージ",
                normalAttackName3 = "三段ダメージ",
                normalAttackName4 = "四段ダメージ",
                normalAttackName5 = null,
                normalAttackName6 = null,
                heavyAttack1 = mutableListOf(0.688,0.744,0.8,0.88,0.936,1.0,1.088,1.176,1.264,1.36,1.47,1.5994,1.7287,1.8581,1.9992),
                heavyAttack2 = mutableListOf(1.247,1.3485,1.45,1.595,1.6965,1.8125,1.972,2.1315,2.291,2.465,2.6644,2.8988,3.1333,3.3678,3.6236),
                heavyAttackName1 = "連続重撃ダメージ",
                heavyAttackName2 = "重撃終了ダメージ",
                fallAttack = mutableListOf(0.8951,0.9679,1.0408,1.1448,1.2177,1.301,1.4154,1.5299,1.6444,1.7693,1.8942,2.0191,2.144,2.2689,2.3937),
                lowFallAttack = mutableListOf(1.7897,1.9354,2.0811,2.2892,2.4349,2.6013,2.8303,3.0592,3.2881,3.5378,3.7876,4.0373,4.287,4.5368,4.7865),
                highFallAttack = mutableListOf(2.2355,2.4174,2.5994,2.8593,3.0413,3.2492,3.5352,3.8211,4.107,4.4189,4.7309,5.0428,5.3547,5.6666,5.9786),
                fallAttackName = "落下期間のダメージ",
                lowFallAttackName = "低空落下攻撃ダメージ",
                highFallAttackName = "高空落下攻撃ダメージ"
            )
            ,
            Skill(name = "逆焔の刃",
                specialAttackRate1 = mutableListOf(0.944,1.0148,1.0856,1.18,1.2508,1.3216,1.416,1.5104,1.6048,1.6992,1.7936,1.888,2.006,2.124,2.242),
                specialAttackRate2 = mutableListOf(0.976,1.0492,1.1224,1.22,1.2932,1.3664,1.464,1.5616,1.6592,1.7568,1.8544,1.952,2.074,2.196,2.318),
                specialAttackRate3 = mutableListOf(1.288,1.3846,1.4812,1.61,1.7066,1.8032,1.932,2.0608,2.1896,2.3184,2.4472,2.576,2.737,2.898,3.059),
                specialAttackRate4 = null,
                specialAttackName1 = "一段ダメージ",
                specialAttackName2 = "二段ダメージ",
                specialAttackName3 = "三段ダメージ",
                specialAttackName4 = null
            )
            ,
            Skill(name = "黎明",
                elementalBurst1 = mutableListOf(2.04,2.193,2.346,2.55,2.703,2.856,3.06,3.264,3.468,3.672,3.876,4.08,4.335,4.59,4.845),
                elementalBurst2 = mutableListOf(0.6,0.645,0.69,0.75,0.795,0.84,0.9,0.96,1.02,1.08,1.14,1.2,1.275,1.35,1.425),
                elementalBurst3 = mutableListOf(2.04,2.193,2.346,2.55,2.703,2.856,3.06,3.264,3.468,3.672,3.876,4.08,4.335,4.59,4.845),
                elementalBurstName1 = "斬撃ダメージ",
                elementalBurstName2 = "継続ダメージ",
                elementalBurstName3 = "爆発ダメージ"
            )
        )),
        Character(name = "ジン",skillList = mutableListOf(
            Skill(name = "通常攻撃・西風剣術",
                normalAttack1 = mutableListOf(0.4833,0.5227,0.562,0.6182,0.6575,0.7025,0.7643,0.8261,0.9554,1.0327,1.1236,1.2144,1.3053,1.4044),
                normalAttack2 = mutableListOf(0.4558,0.4929,0.53,0.583,0.6201,0.6625,0.7208,0.7791,0.8374,0.901,0.9739,1.0596,1.1453,1.231,1.3245),
                normalAttack3 = mutableListOf(0.6029,0.6519,0.701,0.7711,0.8202,0.8763,0.9534,1.0305,1.1076,1.1917,1.2881,1.4014,1.5148,1.6281,1.7518),
                normalAttack4 = mutableListOf(0.6588,0.7124,0.766,0.8426,0.8962,0.9575,1.0418,1.126,1.2103,1.3022,1.4075,1.5314,1.6552,1.7791,1.9142),
                normalAttack5 = mutableListOf(0.7921,0.8565,0.921,1.0131,1.0131,1.0776,1.1513,1.2526,1.3539,1.4552,1.5657,1.6923,1.8413,1.9902,2.1391,2.3016),
                normalAttack6 = null,
                normalAttackName1 = "一段ダメージ",
                normalAttackName2 = "二段ダメージ",
                normalAttackName3 = "三段ダメージ",
                normalAttackName4 = "四段ダメージ",
                normalAttackName5 = "五段ダメージ",
                normalAttackName6 = null,
                heavyAttack1 = mutableListOf(1.6202,1.7521,1.884,2.0724,2.2043,2.355,2.5622,2.7695,2.9767,3.2028,3.4619,3.7665,4.0711,4.3758,4.7081),
                heavyAttack2 = null,
                heavyAttackName1 = "重撃ダメージ",
                heavyAttackName2 = null,
                fallAttack = mutableListOf(0.6393,0.6914,0.7434,0.8177,0.8698,0.9293,1.011,1.0928,1.1746,1.2638,1.353,1.4422,1.5314,1.6206,1.7098),
                lowFallAttack = mutableListOf(1.2784,1.3824,1.4865,1.6351,1.7392,1.8581,2.0216,2.1851,2.3486,2.527,2.7054,2.8838,3.0622,3.2405,3.4189),
                highFallAttack = mutableListOf(1.5968,1.7267,1.8567,2.0424,2.1723,2.3209,2.5251,2.7293,2.9336,3.1564,3.3792,3.602,382.48,4.0476,4.2704),
                fallAttackName = "落下期間のダメージ",
                lowFallAttackName = "低空落下攻撃ダメージ",
                highFallAttackName = "高空落下攻撃ダメージ"
            )
            ,
            Skill(name = "風圧剣",
                specialAttackRate1 = mutableListOf(2.92,3.139,3.358,3.65,3.869,4.088,4.38,4.672,4.964,5.256,5.548,5.84,6.205,6.57,6.935),
                specialAttackRate2 = null,
                specialAttackRate3 = null,
                specialAttackRate4 = null,
                specialAttackName1 = "スキルダメージ",
                specialAttackName2 = null,
                specialAttackName3 = null,
                specialAttackName4 = null
            )
            ,
            Skill(name = "蒲公英の風",
                elementalBurst1 = mutableListOf(4.248,4.5666,4.8852,5.31,5.6286,5.9472,6.372,6.7968,7.2216,7.6464,8.0712,8.496,9.027,9.558,10.089),
                elementalBurst2 = mutableListOf(0.784,0.8428,0.9016,0.98,1.0388,1.0976,1.176,1.2544,1.3328,1.4112,1.4896,1.568,1.666,1.764,1.862),
                elementalBurst3 = null,
                elementalBurstName1 = "爆発ダメージ",
                elementalBurstName2 = "エリア出入りダメージ",
                elementalBurstName3 = null
            )
        ))
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val power = findViewById<EditText>(R.id.editTextPower)
        val buff = findViewById<EditText>(R.id.editTextBuff)
        val rate = findViewById<EditText>(R.id.editTextConsensusR)
        val critical = findViewById<EditText>(R.id.editTextCriticalD)
        val talents = findViewById<EditText>(R.id.editTextTalents)

        val resultB = findViewById<Button>(R.id.resultButton)

        val charaSpinner = findViewById<Spinner>(R.id.characterSpinner)

        val skillSpinner1 = findViewById<Spinner>(R.id.skillSpinner1)
        val skillSpinner2 = findViewById<Spinner>(R.id.skillSpinner2)
        val skillSpinner3 = findViewById<Spinner>(R.id.skillSpinner3)

        val skillName1 = findViewById<TextView>(R.id.skillName1)

        val charaNameList = mutableListOf<String>()
        for (chara in characterList) {
            charaNameList.add(chara.name)
        }

        val charaAdapter = ArrayAdapter(
            applicationContext,
            R.layout.chara_spinner_item,
            charaNameList
        )

        charaSpinner.adapter = charaAdapter
        // リスナーを登録
        charaSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            //　アイテムが選択された時
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?, position: Int, id: Long
            ) {
                val spinnerParent = parent as Spinner
                val item = spinnerParent.selectedItem as String
                charaSpinnerItem = item
                //textView.text = item
                characterIndex = position
            }

            //　アイテムが選択されなかった
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }
        }
        val skill1Adapter = ArrayAdapter(
            applicationContext,
            R.layout.skill_spinner_item,
            arrayOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15")
        )
        skillSpinner1.adapter = skill1Adapter
        // リスナーを登録
        skillSpinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            //　アイテムが選択された時
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?, position: Int, id: Long
            ) {
                val spinnerParent = parent as Spinner
                val item = spinnerParent.selectedItem as String
                skillSpinnerItem1 = item
                //textView.text = item

            }

            //　アイテムが選択されなかった
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }
        }
        skillSpinner2.adapter = skill1Adapter
        // リスナーを登録
        skillSpinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            //　アイテムが選択された時
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?, position: Int, id: Long
            ) {
                val spinnerParent = parent as Spinner
                val item = spinnerParent.selectedItem as String
                skillSpinnerItem2 = item
                //textView.text = item
            }

            //　アイテムが選択されなかった
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }
        }
        skillSpinner3.adapter = skill1Adapter
        // リスナーを登録
        skillSpinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            //　アイテムが選択された時
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?, position: Int, id: Long
            ) {
                val spinnerParent = parent as Spinner
                val item = spinnerParent.selectedItem as String
                skillSpinnerItem3 = item
                //textView.text = item
            }

            //　アイテムが選択されなかった
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }
        }

        resultB.setOnClickListener {
//            val powerNumber = power.text.toString().toDoubleOrNull()
//            val buffNumber = buff.text.toString().toDoubleOrNull()
//            val rateNumber = rate.text.toString().toDoubleOrNull()
//            val criticalNumber = critical.text.toString().toDoubleOrNull()
//            val TalentsNumber = talents.text.toString().toDoubleOrNull()
//            if (powerNumber == null || buffNumber == null || rateNumber == null || criticalNumber == null || TalentsNumber == null) {
//                AlertDialog.Builder(this).setTitle(R.string.dialog_title_invalid_input)
//                    .setPositiveButton(android.R.string.ok, null).show()
//                return@setOnClickListener
//            }


//            val data =
//                PersonalData(powerNumber, buffNumber, rateNumber, criticalNumber, TalentsNumber)

            val resultDmgDataArrayList = arrayListOf<ResultDmgData>(ResultDmgData("攻撃1","100"),ResultDmgData("攻撃2","120"))

            val intent = Intent(this, ResultActivity::class.java)
            val bundle: Bundle = Bundle()

            bundle.putParcelableArrayList("resultDmgData", resultDmgDataArrayList)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}

