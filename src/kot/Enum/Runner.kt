package kot.Enum

import kot.Enum.Month.*
import kot.Enum.Season.*

fun main() {
    val month = June
    val season = when (month) {
        January, February, December -> Winter
        March, April, May -> Spring
        June, July, August -> Summer
        September, October, November -> Autumn
        else -> "not found"
    }
    println(season)
}