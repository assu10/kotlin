package assu.study.kotlinme.chap05.complexConstructors

enum class Material1 {
    Ceramic,
    Metal,
    Plastic,
}

class GardenItem1(
    val name: String = "Things",
    val material: Material1 = Material1.Plastic,
) {
    override fun toString() = "$material $name"
}

fun main() {
    val result1 = GardenItem1("AAA").material
    println(result1) // Plastic

    val result2 = GardenItem1("AAA").name
    println(result2) // AAA

    val result3 = GardenItem1("Assu", Material1.Metal)
    println(result3) // Metal Assu

    // 컴파일 오류
    // val result4 = GardenItem1(Material1.Ceramic)
    val result5 = GardenItem1(material = Material1.Ceramic)
    println(result5) // Ceramic Things
}
