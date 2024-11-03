package admin.tupcel.firsttest.sintaxis

class Usuario(
    val name: String,
    val age: Int,
    private val email: String,
    private val INE: String,
    private val friends: MutableList<Usuario> = mutableListOf()
) {

    fun getFriends() {
        println("Amigos de $name:")
        friends.forEach { friend -> println(friend.name) }
    }

    fun addFriend(friend: Usuario) {
        friends.add(friend)
    }


    fun getEmail(role: String) {
        if (role == "admin") {
            println(email)
        }
    }

    fun getINE(role: String) {
        if (role == "admin") {
            println(INE)
        }
    }

}