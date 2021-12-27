package kot

fun main() {
    val listOfList = mapOf (
        "FirstFile" to listOf(3, 6, 2, 1, 7, 9, 0, 2, 4, 3),
        "SecondFile" to listOf(5, 4, 8, 8, 51, 2, 6),
        "ThirdFile" to listOf(2, 4, 6, 8, 7, 1, 4, 6)
        )

    println(listOfList.filter { it -> it.value.all { it >= 0 } }.flatMap { it.value }.average())

}

