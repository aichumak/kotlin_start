package kot

fun main() {
    val namesList = mutableListOf<String>("Ivan", "Alexander" , "Alex", "Mike", "Bob")
    val sortedNamesList = namesList.filter {it.startsWith("A")}

    println(sortedNamesList)
}