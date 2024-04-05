class User(val name: String, val age: Int?, val email: String?, val address: String?)
{
    fun displayUserInfo() {
        println("Name: $name")
        age?.let { println("Age: $it") }
        email?.let { println("Email: $it") }
        address?.let { println("Address: $it") }
    }
}

fun main() {
    val user = User("Gurgen", 40, null, "st. Kolotuskina, 121")
    user.displayUserInfo()
}
