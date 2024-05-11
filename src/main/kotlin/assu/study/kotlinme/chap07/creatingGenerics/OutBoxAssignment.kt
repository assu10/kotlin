package assu.study.kotlinme.chap07.creatingGenerics

val outRabbitBox: OutBox<Rabbit> = OutBox(Rabbit())

// OutBox<Rabbit> 의 객체를 상위 타입에 대입 가능
val outPetBox: OutBox<Pet> = outRabbitBox
val outAnyBox: OutBox<Any> = outRabbitBox

// 같은 타입으로는 대입 불가
// val outCatBox: OutBox<Cat> = outRabbitBox

fun main() {
    val rabbit: Rabbit = outRabbitBox.get()
    val pet: Pet = outPetBox.get()
    val any: Any = outAnyBox.get()

    println(rabbit) // assu.study.kotlinme.chap07.creatingGenerics.Rabbit@7ef20235
    println(pet) // assu.study.kotlinme.chap07.creatingGenerics.Rabbit@7ef20235
    println(any) // assu.study.kotlinme.chap07.creatingGenerics.Rabbit@7ef20235
}
