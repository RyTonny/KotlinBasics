package admin.tupcel.firsttest.sintaxis

fun main() {

    val mapOfPokemons = mutableMapOf("Pikachu" to "electric", "Charmander" to "Fire")

    println(mapOfPokemons["Pikachu"])//aqui mostramos un elemento en base a su llave

    mapOfPokemons.put("Squirtle", "Water")//al agregar no usamos el to
    mapOfPokemons["Mew"] = "Psychic"//otra forma de agregar datos al mapa

    println(mapOfPokemons)

}