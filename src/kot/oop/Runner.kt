package kot.oop

fun main() {
    val dog1 = Dog()
    with(dog1) {
        name = "Bob"
        height = 15
        age = 5
    }
    println(dog1.toString())
}