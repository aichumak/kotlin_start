package kot.oop

class Dog {
    var name: String? = null
    get() {
        return if (field == null){
            ""
        } else {
            field?.replaceFirstChar { it.uppercase() }
        }
    }

    var age = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var height = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    override fun toString(): String {
        return "Dog(name=$name, age=$age, height=$height)"
    }


}