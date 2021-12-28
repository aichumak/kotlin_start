package kot

fun main() {
    val number = 29
    println(number.isSimple())

}

inline fun Int.isSimple() = this % 2 != 0