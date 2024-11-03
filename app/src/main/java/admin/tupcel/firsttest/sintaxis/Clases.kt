package admin.tupcel.firsttest.sintaxis

fun main() {

    val jose = Usuario(
        "jose",
        32,
        "Jose@hotmail.com",
        "131313131314"
    )

    val Erick = Usuario(
        "Erick",
        32,
        "Erick@hotmail.com",
        "1316673131314"
    )
    val Yenifer = Usuario(
        "Yenifer",
        32,
        "Yeni@hotmail.com",
        "898913131314"
    )

    jose.addFriend(Yenifer)
    Yenifer.addFriend(Erick)
    Erick.addFriend(Yenifer)
    jose.addFriend(Erick)
    Yenifer.addFriend(jose)

    jose.getFriends()
    Yenifer.getFriends()
    Erick.getFriends()

}