package kot.Generics

class MyArrayList<T> : MyList<T> {

    private var array = arrayOfNulls<Any>(10)
    private var size = 0

    companion object {
        fun<E> myListOf(vararg elements: E): MyArrayList<E> {
            val myArrayList = MyArrayList<E>()
            for (element in elements) {
                myArrayList.add(element)
            }
            return myArrayList
        }
    }

    override fun get(index: Int): T {
        if (size in 0..array.size) {
            array[index]?.let {
                return it as T
            }
        }
        throw ArrayIndexOutOfBoundsException()
    }

    override fun add(str: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = str
        size++
    }

    override fun remove(element: T) {
        for ((index, str) in array.withIndex()) {
            if (str == element) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }

}