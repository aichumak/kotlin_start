package kot

import kotlin.random.Random

fun main() {
    val numbersList = List<Int>(1000) { Random.nextInt(0, 1000) }
    val newNumberList = ((numbersList.filter { it % 3 == 0 || it % 5 == 0 }).map { it * it }).sortedDescending().map { "$it" }
    println(newNumberList.toString())
}