package kot.equils

class Address(val city: String, val street: String, val buildingNumber: Int) {
    fun copy(
        city: String = this.city,
        street: String = this.street,
        buildingNumber: Int = this.buildingNumber
    ): Address {
        return Address(city, street, buildingNumber)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (buildingNumber != other.buildingNumber) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + buildingNumber
        return result
    }

    override fun toString(): String {
        return super.toString()
    }

    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = buildingNumber
}