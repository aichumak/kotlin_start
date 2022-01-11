package kot.anonymous_classes

class Vehicle(override var name: String = "Vehicle"): Transport(name) {
    override fun drive() {
        println("Car is driving")
    }

    fun startEngine(): Boolean {
        println("Start engine")
        return true
    }
}