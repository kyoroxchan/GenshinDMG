package app.nakamura.kyoro.genshindm

data class Skill(
    var name: String = "",


    var normalAttack1: MutableList<Double>? = null,
    var normalAttack2: MutableList<Double>? = null,
    var normalAttack3: MutableList<Double>? = null,
    var normalAttack4: MutableList<Double>? = null,
    var normalAttack5: MutableList<Double>? = null,
    var normalAttack6: MutableList<Double>? = null,

    var normalAttackName1: String? = null,
    var normalAttackName2: String? = null,
    var normalAttackName3: String? = null,
    var normalAttackName4: String? = null,
    var normalAttackName5: String? = null,
    var normalAttackName6: String? = null,


    var heavyAttack1: MutableList<Double>? = null,
    var heavyAttack2: MutableList<Double>? = null,

    var heavyAttackName1: String? = null,
    var heavyAttackName2: String? = null,


    var fallAttack: MutableList<Double>? = null,
    var lowFallAttack: MutableList<Double>? = null,
    var highFallAttack: MutableList<Double>? = null,

    var fallAttackName: String? = null,
    var lowFallAttackName: String? = null,
    var highFallAttackName: String? = null,


    var specialAttackRate1: MutableList<Double>? = null,
    var specialAttackRate2: MutableList<Double>? = null,
    var specialAttackRate3: MutableList<Double>? = null,
    var specialAttackRate4: MutableList<Double>? = null,

    var specialAttackName1: String? = null,
    var specialAttackName2: String? = null,
    var specialAttackName3: String? = null,
    var specialAttackName4: String? = null,


    var elementalBurst1: MutableList<Double>? = null,
    var elementalBurst2: MutableList<Double>? = null,
    var elementalBurst3: MutableList<Double>? = null,

    var elementalBurstName1: String? = null,
    var elementalBurstName2: String? = null,
    var elementalBurstName3: String? = null,
)