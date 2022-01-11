package kot.extends2

class CleanerWorker(name: String, age: Int): Cleaner {
    override fun clean() {
        println("Cleaner is cleaning")
    }
}