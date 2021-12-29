package kot.constructors

class Book(val name: String, var year: Int? = null, var price: Long? = null) {
    override fun toString(): String {
        return "Book(name='$name', year=$year, price=$price)"
    }
}