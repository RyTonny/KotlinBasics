package admin.tupcel.firsttest.sintaxis

fun main() {

    mayLamda("Juan Antonio",) { fullname ->
        println("Hola $fullname")
    }

}

fun mayLamda(name: String, saludar: (fullname: String) -> Unit) {
    println("Estoy entrando a la función lamda")
    saludar("$name Velázquez")
    println("Estoy saliendo de la función lamda")

}