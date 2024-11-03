package admin.tupcel.firsttest.sintaxis

fun main() {

    val listOfPokemon = mutableListOf<String>("Pikachu", "Charmander", "Squirtle")
    listOfPokemon.add("Bulbasaur")
    listOfPokemon.add("mew")
    listOfPokemon.add("Pikachu")

    println("Listas de Pokemons")
    println(listOfPokemon)//en las listas si se pueden repetir elementos y son valores ordenados

    val setOfPokemon = mutableSetOf("Pikachu", "Charmander", "Squirtle")
    setOfPokemon.add("Bulbasaur")
    setOfPokemon.add("Mew")
    setOfPokemon.add("Pikachu")

    println("Set de Pokemons")//en los set no son valores ordenados no hay un primero y no un ultimo, y no se pueden repetir valores
    println(setOfPokemon)
}