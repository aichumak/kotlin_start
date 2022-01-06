package kot.methods

import java.time.LocalDate

class Worker(val name: String, val position: String, val employmentYear: Int) {
    val experience = LocalDate.now().year-employmentYear

    fun Work() {
        println("Work")
    }

}

