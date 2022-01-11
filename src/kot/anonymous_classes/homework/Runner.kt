package kot.anonymous_classes.homework

fun main() {
    val sportsman = Sportsman()

    sportsman.callWaterCarrier(object: WaterCarrier{
        override fun bringWater() {
            println("Bring the water")
        }
    })
}