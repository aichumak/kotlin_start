package kot

fun main() {
    val time = 13
    val goodWeather = false
    val action = when {
        time in 10..22 && goodWeather -> "Гулять"
        time in 10..22 && !goodWeather -> "Читать книгу"
        else -> "Спать"
    }
    println(action)
}