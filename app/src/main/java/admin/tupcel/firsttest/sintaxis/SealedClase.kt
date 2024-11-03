package admin.tupcel.firsttest.sintaxis

fun main(){

    val jose = Person("JOSE","Sabeque",CivilStatus.Single)
    val yenifer = Person("Yeni","Hernandez",CivilStatus.Comprometido)
    val pedro = Person("Pedro","López",CivilStatus.Single)

    if (jose.civilStatus== pedro.civilStatus){
        println("tienen el mismo estado")
    }else{
        println("No tienen el mismo estado civil")
    }
}