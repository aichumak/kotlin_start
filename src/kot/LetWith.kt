package kot

val list: MutableList<Int>? = null//mutableListOf()

fun main() {
    val numbersList = mutableListOf<Int>()

    with(numbersList) {
        for (i in 0..100) {
            add((Math.random() * 100).toInt())
        }
        println(first())
        println(last())
        println(average())
        println(maxOf { it })
        println(minOf { it })
        println(sum())
    }

    homerWrk()
}

fun homerWrk() {
    list?.let {
        with(it) {
            var count = 0
            for (i in 0..1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it%2 == 0 }.take(100)
            println(result.toString())
        }
        println(it.toString())
    }

}
