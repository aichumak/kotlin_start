package kot.equils

fun main() {
    val address1 = Address("Minsk", "Petrov", 33)
    val address2 = address1.copy()
    println(address1.toString())
    println(address2.toString())
    println(address1.hashCode())
    println(address2.hashCode())
    val (city: String, street: String, buildingNumber: Int) = address2
    println(city)
    println(street)
    println(buildingNumber)
    println(address1==address2)
}