package kot.methods

class Cat(val catsName: String, val age: Int, val weight: Float) {
    fun printInfo() {
        println("Cat $catsName is old $age years, and he is weight $weight")
    }

    fun catIsOld() = age > 12
}
