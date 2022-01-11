package kot.extends2

fun main() {
    val workersList: MutableList<Worker> = mutableListOf()

    for (i in 0..50) {
        if (i % 2 == 0) {
            workersList.add(Programmer("Programmer", 30, "Kotlin"))
        } else {
            workersList.add(Director("Director", 25))
        }
    }

    workersList.forEach {
        it.work()
        if (it is Cleaner){
            it.clean()
        }
    }

    val cleanerList = workersList.filter { it is Cleaner }.map { it as Cleaner }

    for (cleanerWorker in cleanerList) {
        cleanerWorker.clean()

    }
}