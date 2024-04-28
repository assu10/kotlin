package assu.study.kotlinme.chap05.innerClasses

fun interface Pet {
    fun speak(): String
}

object CreatePet {
    fun home() = " home~"

    // dog() 는 Pet 을 상속하면서 speak() 를 오버라이드하는 클래스 반환
    fun dog(): Pet {
        val say = "Bark~"

        // Local inner 클래스
        class Dog : Pet {
            override fun speak() = say + home()
        }
        return Dog()
    }

    fun cat(): Pet {
        val emit = "Meow~"
        // 익명 inner 클래스
        return object : Pet {
            override fun speak() = emit + home()
        }
    }

    fun hamster(): Pet {
        val squeak = "Squeak~"
        // SAM 변환
        return Pet { squeak + home() }
    }
}

fun main() {
    val result1 = CreatePet.dog().speak()
    val result2 = CreatePet.cat().speak()
    val result3 = CreatePet.hamster().speak()

    println(result1) // Bark~ home~
    println(result2) // Meow~ home~
    println(result3) // Squeak~ home~
}
