package kot.Generics

fun main() {
    val list: MyList<String> = MyArrayList()
    val list2: MyList<String> = MyArrayList.myListOf("dfsdfsd", "afdsfdsfsd", "dasfdsfsdf", "dsfdsf")

    println(list2.size())

    for (i in 0..100) {
        list.add("$i")
    }
    println(list.size())
    list.remove("4")
    list.removeAt(15)
    println(list.size())

}