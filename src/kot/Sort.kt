package kot

fun main() {
    val array = mutableListOf(4, 2, 6, 7, 8, 3, 5, 6, 6, 7, 8, 9, 0)
    println(sort(array))
    println(sort(4,6,7,4,3,4343,5,6,7,89,2,4))
}

fun sort(listNumbers: MutableList<Int>): List<Int> {
    var bufferForInt: Int

    for (firstIndex in 0 until listNumbers.size) {
        for (secondIndex in listNumbers.size - 1 downTo firstIndex) {
            if (secondIndex == firstIndex) {
                break
            } else if (listNumbers[secondIndex] < listNumbers[secondIndex - 1]) {
                bufferForInt = listNumbers[secondIndex]
                listNumbers[secondIndex] = listNumbers[secondIndex - 1]
                listNumbers[secondIndex - 1] = bufferForInt
            }
        }
    }

    return listNumbers
}

fun sort(array: Array<Int>) = sort(array.toMutableList())
fun sort(vararg params: Int) = sort(params.toMutableList())
