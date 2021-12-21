package kot

fun main() {
    val numbers: MutableList<Int> = mutableListOf()
    for (i in 0..100){
        numbers.add(i)
    }

    for (number in numbers) {
        println(number)
    }
    println(numbers.toString())
    nextMethod()
}

fun nextMethod() {
    val numbersArray = arrayOfNulls<Int>(101)
    for ((index, i) in numbersArray.withIndex()){
        numbersArray[index] = index
    }
    println(numbersArray.toString())
}
