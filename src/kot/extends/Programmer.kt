package kot.extends

class Programmer(val programmingLanguage: String, name: String, age: Int): Worker(name, age)  {
    override fun work() {
        println("Im writing code on $programmingLanguage")
    }
}