package admin.tupcel.firsttest.sintaxis

fun main() {

    var friends = listOf("José", "María", "Peter")
    var ages = listOf<Int>(20, 23, 30)

    /*
    println(friends)
    println(friends[1])
    println(ages)
    println(ages[1])
     */

    println(friends.first())
    println(friends.last())
    println(friends.size)

    //GET
    println(friends[0])
    println(friends.get(0))
    //SET
    // friends.set(0, "Juan") // no se puede editar esta lista

    var newFriends = mutableListOf("José", "María", "Peter")

    newFriends.set(0, "Erick")

    println(newFriends[0])

    newFriends.add("Mariela")

    println(newFriends)


}