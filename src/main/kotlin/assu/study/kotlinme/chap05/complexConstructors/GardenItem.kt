package assu.study.kotlinme.chap05.complexConstructors

enum class Material {
    Ceramic,
    Metal,
    Plastic,
}

class GardenItem(val name: String) {
    var material: Material = Material.Plastic

    // 부생성자
    constructor(name: String, material: Material) : // 주생성자의 파라메터만 val, var 를 덧붙여서 프로퍼티로 선언 가능
        this(name) { // 부생성자에는 반환 타입 지정 불가
        this.material = material
    }

    // 부생성자
    // 부생성자의 본문을 적지 않아도 되지만, `this()` 호출은 반드시 포함해야 함
    constructor(material: Material) : this("Things", material)

    override fun toString() = "$material $name"
}

fun main() {
    val result1 = GardenItem("AAA").material
    println(result1) // Plastic

    val result2 = GardenItem("AAA").name
    println(result2) // AAA

    // 첫 번째 부생성자를 호출할 때 _material_ 프로퍼티가 두 번 대입됨
    // this(name) 에서 주생성자를 호출하고 모든 클래스 프로퍼티값을 초기화할 때 Plastic 값이 할당됨
    // 이 후 this.material = material 에서 Metal 로 할당됨
    val result3 = GardenItem("Assu", Material.Metal)
    println(result3) // Metal Assu

    val result4 = GardenItem(Material.Ceramic)
    val result5 = GardenItem(material = Material.Ceramic)
    println(result4) // Ceramic Things
    println(result5) // Ceramic Things
}
