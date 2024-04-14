package assu.study.kotlinme.chap05.baseClassInit

open class House(
    val addr: String,
    val state: String,
    val zip: String,
) {
    constructor(fullAddr: String) :
        this(
            fullAddr.substringBefore(", "),
            fullAddr.substringAfter(", ").substringBefore(" "),
            fullAddr.substringAfterLast(" "),
        )

    val fullAddr: String
        get() = "$addr,, $state $zip"
}

class VacationHouse(
    addr: String,
    state: String,
    zip: String,
    val startMonth: String, // VacationHouse 만의 파라메터
    val endMonth: String, // VacationHouse 만의 파라메터
) : House(addr, state, zip) { // 기반 클래스의 주생성자 호출
    override fun toString() = "Vacation house at $fullAddr from $startMonth to $endMonth"
}

class TreeHouse(
    val name: String,
) : House("Tree Street, TR 11111") { // 기반 클래스의 부생성자 호출
    override fun toString() = "$name tree house at $fullAddr"
}

fun main() {
    val vacationHouse =
        VacationHouse(
            addr = "Korea Suwon.",
            state = "KS",
            zip = "12345",
            startMonth = "May",
            endMonth = "September",
        )

    // Vacation house at Korea Suwon.,, KS 12345 from May to September
    println(vacationHouse)

    val treeHouse = TreeHouse("ASSU")

    // ASSU tree house at Tree Street,, TR 11111
    println(treeHouse)
}
