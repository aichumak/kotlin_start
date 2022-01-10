package kot.equils

fun main() {
    val student1 = Student("Ivan", "Petrov", 30)
    val student2 = Student("Ivan", "Petrov", 30)
    val student3 = student1.copy(id = 1511515)
    val (name: String, lastName: String, id: Int) = student1
    println(name)
    println(lastName)
    println(id)

    println(student1.toString())
    println(student2.toString())
    println(student3.toString())
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)
}