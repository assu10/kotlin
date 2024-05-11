package assu.study.kotlinme.chap07.creatingGenerics

fun main() {
    val rabbitList: List<Rabbit> = listOf(Rabbit())

    // 읽기 전용 리스트는 공변이므로 List<Rabbit> 을 List<Pet> 에 대입 가능
    val petList: List<Pet> = rabbitList

    var mutablePetList: MutableList<Pet> = mutableListOf(Rabbit())
    mutablePetList.add(Cat())

    // 가변 리스트는 무공변이므로 같은 타입만 대입 가능
    // Type mismatch.
    // Required: MutableList<Pet>
    // Found: MutableList<Cat>

    // mutablePetList = mutableListOf<Cat>(Cat())
}
