package kot

fun main() {
    println("V="+getV(10))
}

fun getV(a: Int, b: Int = a, c: Int = a) = a * b * c
