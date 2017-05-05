import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond constructor(ageWithTime: LocalDateTime){

    val date:LocalDateTime = ageWithTime.plusSeconds(1000000000)

    constructor(age: LocalDate) : this(age.atStartOfDay())
}