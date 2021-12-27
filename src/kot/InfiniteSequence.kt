package kot

fun main() {
    val array = generateSequence("Сотрудник №1") {
        val index = it.substring(11).toInt()
        "Сотрудник №${index+1}"
    }

    val listOfFirst100 = array.take(100)
    for (i in listOfFirst100) {
        println(i)
    }
}