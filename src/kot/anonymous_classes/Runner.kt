package kot.anonymous_classes

fun main() {
    val transport: Transport = Vehicle()
    val bicycle: Transport = Bicycle()

    if(transport is Vehicle){
    transport.startEngine()
    transport.drive()
        transport.name = "New vehicle"
    }

    bicycle.drive()
}