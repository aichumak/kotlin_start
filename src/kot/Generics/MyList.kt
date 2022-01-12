package kot.Generics

interface MyList<T> {
    fun get(index: Int): T
    fun add(str: T)
    fun remove(element: T)
    fun removeAt(index: Int)
    fun size(): Int
}