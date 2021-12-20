package kot

private var name: String? = null
private var soname: String? = null
private var age: String? = null
private var result: Int = 0

fun main() {
    name = "Mike"
    age = ""
    println("$name $soname age $age")

    result = (name?.length?:0) + (soname?.length?:0) + (age?.length?:0)
    println(result)
}