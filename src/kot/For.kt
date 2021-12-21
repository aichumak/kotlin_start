package kot

fun main() {
    val numbers = arrayOfNulls<Int?>(301)
    for ((index, number) in (300..600).withIndex()) {
        numbers[index] = number
    }

    for (i in numbers.size-1 downTo 0 step 5) {
        println(numbers[i])
    }

}