package admin.tupcel.firsttest.sintaxis

fun main() {

    val name = "Juan Antonio"
    val role = "admin"
    val age = 20

    if (age > 18) {
        println("$name es mayor de edad.")
    } else if (age > 50) {
        println("eres un abuelo.")
    } else {
        println("lo siento eres un nene")
    }

    if (role == "user") {
        println("tienes acceso a tu perfil")
    }

    if (role == "admin") {
        println("Tienes acceso a todos los contenidos")
    }
    if (role == "guest") {
        println("solo esta de visita")
    }

}