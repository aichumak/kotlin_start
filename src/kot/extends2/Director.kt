package kot.extends2

class Director(name: String, age: Int): Worker(name, age) {
    override fun work() {
        println("Working")
    }
}