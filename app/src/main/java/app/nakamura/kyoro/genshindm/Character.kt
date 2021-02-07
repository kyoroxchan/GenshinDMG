package app.nakamura.kyoro.genshindm

data class Character(
    var name: String = "",
    var skillList: MutableList<Skill>
)
