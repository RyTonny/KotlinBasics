package admin.tupcel.firsttest.sintaxis

sealed class CivilStatus {
    object Single : CivilStatus()
    object Comprometido : CivilStatus()
    object divorciada : CivilStatus()
}