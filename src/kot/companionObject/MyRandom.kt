package kot.companionObject

class MyRandom {
    companion object{

        private const val monday: String = "Monday"
        private const val tuesday = "Tuesday"
        private const val wednesday = "Wednesday"
        private const val thursday = "Thursday"
        private const val friday = "Friday"
        private const val saturday = "Saturday"
        private const val sunday = "Sunday"

        fun random(a: Int, b: Int) = (a until b).random()

        fun randomBoolean() = (0 until 1).random() > 0

        fun randomWeekDay(): String {


        return when ((1 until 7).random()){
            1 -> monday
            2 -> tuesday
            3 -> wednesday
            4 -> thursday
            5 -> friday
            6 -> saturday
            else -> sunday
        }
        }
    }

}