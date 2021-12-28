package kot

fun main() {
    val numbersList = mutableListOf<Int>()
    with(numbersList) {
        for (i in 0 until 100){
            add((Math.random()*1000).toInt())
        }
    }
    val sum = listModify(numbersList) {it.sum()}
    println(sum)

    printListSum(numbersList) {
        println(it.sum())
    }
}

fun listModify(list: List<Int>, func: (List<Int>) -> Int) : Int {
    return func(list)
}

inline fun printListSum(list: List<Int>, func: (List<Int>) -> Unit) {
    func(list)
}