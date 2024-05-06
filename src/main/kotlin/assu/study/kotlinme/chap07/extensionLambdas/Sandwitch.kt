package assu.study.kotlinme.chap07.extensionLambdas

// ArrayList<RecipeUnit> 을 상속
open class Recipe : ArrayList<RecipeUnit>()

open class RecipeUnit {
    override fun toString() = "${this::class.simpleName}"
}

open class Operation : RecipeUnit()

class Toast : Operation()

class Grill : Operation()

class Cut : Operation()

open class Ingredient : RecipeUnit()

class Bread : Ingredient()

class Ham : Ingredient()

class Swiss : Ingredient()

class PeanutButter : Ingredient()

class Mustard : Ingredient()

open class Sandwich : Recipe() {
    fun action(op: Operation): Sandwich {
        add(op)
        return this
    }

    fun grill() = action(Grill())

    fun toast() = action(Toast())

    fun cut() = action(Cut())
}

// fillings 확장 람다는 호출자가 Sandwich 를 여러 가지 설정으로 준비할 수 있도록 해줌
fun sandwich(fillings: Sandwich.() -> Unit): Sandwich {
    val sandwich = Sandwich()
    sandwich.add(Bread())
    sandwich.toast()
    sandwich.fillings()
    sandwich.cut()
    return sandwich
}

fun main() {
    val result1 =
        sandwich {
            add(Ham())
            add(Mustard())
        }

    val result2 =
        sandwich {
            add(Swiss())
            add(PeanutButter())
            grill()
        }

    println(result1)
    println(result2)
}
