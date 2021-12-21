package kot

fun main() {
    val sortedArray = getSortedArray(4, 2, 6, 7, 8, 3, 5, 6, 6, 7, 8, 9, 0)
    println(sortedArray)
}

fun getSortedArray(vararg params: Int): ArrayList<List<Int>> {
    val listNumbers: MutableList<Int> = arrayListOf()
    var bufferForInt: Int
    for (param in params) {
        listNumbers.add(param)
    }

    for ((firstIndex) in listNumbers.withIndex()) {
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

    return arrayListOf(listNumbers)
}
