package assu.study.kotlinme.chap07.creatingGenerics

// InBox<Any> 의 객체를 하위 타입에 대입 가능
val inBoxAny: InBox<Any> = InBox(Any())
val inBoxPet: InBox<Pet> = inBoxAny
val inBoxCat: InBox<Cat> = inBoxAny
val inBoxRabbit: InBox<Rabbit> = inBoxAny

// 같은 수준의 타입으로는 대입 불가
// val inBoxRabbit2: InBox<Rabbit> = inBoxCat

fun main() {
    inBoxAny.put(Any())
    inBoxAny.put(Pet())
    inBoxAny.put(Cat())
    inBoxAny.put(Rabbit())

    // inBoxPet.put(Any())
    inBoxPet.put(Pet())
    inBoxPet.put(Cat())
    inBoxPet.put(Rabbit())

//    inBoxRabbit.put(Any())
//    inBoxRabbit.put(Pet())
//    inBoxRabbit.put(Cat())
    inBoxRabbit.put(Rabbit())

    inBoxCat.put(Cat())
}
