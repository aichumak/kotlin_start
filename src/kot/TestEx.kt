package kot

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val stringBuffer = StringBuffer()
    addToStringBuffer(stringBuffer, "Средняя выручка в неделю: ",
        data.filter { it -> it.value.all { it >= 0 } }.flatMap { it.value }.average().toString()
    )

    addToStringBuffer(stringBuffer, "Средняя выручка в месяц: ",
        data.filter { it -> it.value.all { it >= 0 } }.map { it.value.sum() }.average().toString()
    )

    addToStringBuffer(stringBuffer, "Максимальная выручка в месяц: ",
        data.filter { it -> it.value.all { it >= 0 } }.map { it.value.sum() }.maxOf { it }.toString()
    )

    addToStringBuffer(stringBuffer, "Была в следующих месяцах: ",
        getMaxMonth(
            data.filter { it -> it.value.all { it >= 0 } }.keys.toList()
                .zip(data.filter { it -> it.value.all { it >= 0 } }.map { it.value.average() })
        )
    )

    addToStringBuffer(stringBuffer, "Минимальная выручка в месяц: ",
        data.filter { it -> it.value.all { it >= 0 } }.map { it.value.sum() }.minOf { it }.toString()
    )

    addToStringBuffer(stringBuffer, "Была в следующих месяцах: ", getMaxMonth(
        data.filter { it -> it.value.all { it >= 0 } }.keys.toList()
            .zip(data.filter { it -> it.value.all { it >= 0 } }.map { it.value.average() }), false)
    )

    addToStringBuffer(stringBuffer, "Ошибки произошли в следующих месяцах ",
        data.filter { it -> it.value.any { it < 0 } }.map { it.key }.toString()
        )

    println(stringBuffer)
}

fun getMaxMonth(newList: List<Pair<String, Double>>, maxMonth: Boolean = true): String {
    var month = newList[0].first
    var bufferSum = newList[0].second

    for (pair in newList) {
        if (maxMonth) {
            if (pair.second > bufferSum) {
                bufferSum = pair.second
                month = pair.first
            }
        } else {
            if (pair.second < bufferSum) {
                bufferSum = pair.second
                month = pair.first
            }
        }
    }
    return month
}

fun addToStringBuffer(stringBuffer: StringBuffer, message: String, value: String) {
    stringBuffer.append(message)
    stringBuffer.append(value)
    stringBuffer.append("\n")
}
