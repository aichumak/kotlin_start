package kot.extends2

class Programmer (name: String, age: Int, private val programmingLanguage: String): Worker(name, age), Cleaner {
    override fun work() {
        println("programming on $programmingLanguage")
    }

    override fun clean() {
        println("Cleaning")
    }
}