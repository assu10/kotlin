package assu.study.kotlinme.chap07.scopeFunctions

data class Toy(var id: Int)

fun display(iMap: Map<String, Toy>) {
    println("display: $iMap")

    val toy1: Toy =
        iMap["main"]?.let {
            it.id += 10
            it
        } ?: return // map 의 key 에 main 이 없으면 display() 함수를 종료시키므로 아래 로직을 실행되지 않음
    println("toy1: $toy1")

    val toy2: Toy? =
        iMap["main"]?.run {
            id += 10
            this
        }
    println("toy2: $toy2")

    val toy3: Toy? =
        iMap["main"]?.apply {
            id += 10
            this // 변경된 객체를 다시 반환하므로 의미없는 구문
        }
    println("toy3: $toy3")

    val toy4: Toy? =
        iMap["main"]?.apply {
            id += 10
        }
    println("toy4: $toy4")

    val toy5: Toy? =
        iMap["main"]?.also {
            it.id += 10
        }
    println("toy5: $toy5")
}

fun main() {
    // display: {main=Toy(id=1)}
    // toy1: Toy(id=11)
    // toy2: Toy(id=21)
    // toy3: Toy(id=31)
    // toy4: Toy(id=41)
    // toy5: Toy(id=51)
    display(mapOf("main" to Toy(1)))

    // display: {none=Toy(id=1)}
    display(mapOf("none" to Toy(1)))
}
