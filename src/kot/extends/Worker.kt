package kot.extends

open class Worker (val name: String, val age: Int) {
    open fun work() {
        println("Working...")
    }
}