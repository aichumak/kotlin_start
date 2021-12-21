package kot

fun main() {
    println(maxInt(5, 10))
    println(returnFive("Merc"))
}

fun returnFive(text: String) = text.substring(0, 5.coerceAtMost(text.length))

fun maxInt(a: Int, b: Int) = if (a>b) a else b

