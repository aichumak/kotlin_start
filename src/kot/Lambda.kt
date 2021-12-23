package kot

import kotlin.math.pow

fun main() {
    val sumSquared: (Double) -> Double = { it.pow(2) }
    println(sumSquared(10.0))

    val perimeter: (Int, Int) -> Int = { a, b -> 2 * (a + b) }
    println(perimeter(10, 20))

    val printName: (String) -> Unit = { println("Hello $it") }
    printName("Mike")

    val arrayNumbers: (kotlin.Array<Int>) -> Unit = { it.sort() }
    val testArray = arrayOf(4, 6, 2, 3, 8, 9, 7, 6, 5, 0, 3)
    arrayNumbers(testArray)
    println(testArray.contentToString())
}