package admin.tupcel.firsttest.sintaxis

fun main() {

    var name = "José"
    var course: String? = null

    course = "Kotlin"

    if (course == null) {
        println("$name is not studyng")
    } else {
        println("$name is studyng $course")
    }

    var num1: Int? = 10//puede ser null y me puede dar error por eso el ?

    var result = num1!! + 5//con los signos de admiración estamos seguros que tendrá valor

    println(result)


}