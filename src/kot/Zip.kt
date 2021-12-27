package kot

fun main() {
    val arrayOfNames = generateSequence("Name1") {
        val index = it.substring(4).toInt()
        "Name${index + 1}"
    }

    val arrayOfPhoneNumbers = generateSequence(79110000000) { it + 1 }

    val namesList = arrayOfNames.take(1000)
    val phoneNumbersList = arrayOfPhoneNumbers.take(1000)

    val users = namesList.zip(phoneNumbersList)

    for (user in users) {
        println("Name: ${user.first}, phone number: ${user.second}")
    }

    homeWork()
}

fun homeWork() {
    val arrayOfStrings = arrayOfNulls<String>(101)

    for (i in 0..100) {
        arrayOfStrings[i] = "Name$i soName$i"
    }

    val listOfNames = arrayOfStrings.map { it?.substringBefore(" ") }
    val listOfSoNames = arrayOfStrings.map { it?.substringAfter(" ") }

    val finalList = listOfNames.zip(listOfSoNames)

    println(finalList.toString())

    for (pair in finalList) {
        println(pair.first)
        println(pair.second)
    }

}
