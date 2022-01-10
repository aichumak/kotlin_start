package kot.extends

fun main() {
    val workersList: MutableList<Worker> = mutableListOf()

    for (i in 0..50) {
        if (i % 2 == 0) {
            workersList.add(Programmer("Kotlin", "Programmer #$i", 20))
        } else {
            workersList.add(Worker("Driver #$i", 25))
        }
    }

    workersList.forEach { it.work() }
}