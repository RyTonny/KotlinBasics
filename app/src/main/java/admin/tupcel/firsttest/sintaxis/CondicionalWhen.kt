package admin.tupcel.firsttest.sintaxis

fun main() {
    val name = "Juan Antonio"
    val age = 17
    val role = "guest"

    when {
        age > 60 -> println("$name es un abuelo")
        age > 30 -> println("$name es un adulto")
        age > 18 -> println("$name es un adulto joven")
        else -> println("$name es menor de edad")
    }

    when (role) {
        "admin" -> println("Acceso total")
        "user" -> println("Acceso Limitado")
        else -> println("Acceso denegado")
    }
}