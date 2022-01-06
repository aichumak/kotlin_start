package kot.methods

fun main() {
    val worker1 = Worker("Bob", "Manager", 2010)
    worker1.Work()
    worker1.printInfo()
}

fun Worker.printInfo() {
    println(name)
    println(position)
    println(employmentYear)
    println(experience)
}