package app.nakamura.kyoro.genshindm

import java.io.Serializable

data class PersonalData(
    var powerNumber: Double,
    var buffNumber: Double,
    var rateNumber: Double,
    var criticalNumber: Double,
    var TalentsNumber: Double
) : Serializable {
    val buffNumber2 = buffNumber / 100
    val TalentsNumber2 = TalentsNumber / 100
    val criticalNumber2 = criticalNumber / 100
    val rateNumber2 = rateNumber / 100
    val criticalNumber3 = 1 + criticalNumber2
    val criticalNumber4 = 1 + criticalNumber2 * rateNumber2

    val NonCriticalDamage: Double by lazy {
        powerNumber * buffNumber2 * TalentsNumber2
    }
    val CriticalDamage: Double by lazy {
        NonCriticalDamage * criticalNumber3
    }
    val CriticalDamageEx: Double by lazy{
        NonCriticalDamage * criticalNumber4
    }
}
