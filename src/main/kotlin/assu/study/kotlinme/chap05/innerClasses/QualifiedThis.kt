package assu.study.kotlinme.chap05.innerClasses

val Any.name
    get() = this::class.simpleName

class Fruit { // @Fruit 라는 레이블이 암시적으로 붙음
    fun changeColor(color: String) = println("Fruit $color~")

    fun absorbWater(amount: Int) {}

    // Fruit 안에 있는 Seed inner class
    inner class Seed { // @Seed 라는 레이블이 암시적으로 붙음
        fun changeColor(color: String) = println("Seed $color~")

        fun germinate() {}

        fun whichThis() {
            // 디폴트로 (가장 안쪽의) 현재 클래스인 Seed 를 가리킴
            println(this.name) // Seed

            // 명확히 하기 위해 디폴트 this 를 한정시킴
            println(this@Seed.name) // Seed

            // name 이 Fruit 와 Seed 에 다 있으므로 Fruit 를 명시하여 접근
            println(this@Fruit.name) // Fruit

            // 현재 클래스의 inner class 에 @레이블 을 사용하여 접근 불가
            // println(this@DNA.name)
        }

        // Seed inner class 안에 있는 DNS inner class
        inner class DNA {
            fun changeColor(color: String) {
                // changeColor(color) // 재귀 호출이 됨

                this@Seed.changeColor(color)
                this@Fruit.changeColor(color)
            }

            fun plant() {
                // 한정시키지 않고 외부 클래스의 함수 호출 가능
                germinate()
                absorbWater(10)
            }

            // 확장 함수
            fun Int.grow() { // @grow 라는 레이블이 암시적으로 붙음
                // 디폴트는 Int.grow() 로, Int 를 수신 객체로 받음
                println(this.name) // Int

                // @grow 한정은 없어도 됨
                println(this@grow.name) // Int

                // 여기서도 여전히 모든 프로퍼티에 접근 가능
                println(this@DNA.name) // DNA
                println(this@Seed.name) // Seed
                println(this@Fruit.name) // Fruit
            }

            // 외부 클래스에 대한 확장 함수들
            fun Seed.plant() {}

            fun Fruit.plant() {}

            fun witchThis() {
                // 디폴트는 현재 클래스
                println(this.name) // DNA

                // @DNA 한정은 없어도 됨
                println(this@DNA.name) // DNA

                // 다른 클래스 한정은 꼭 명시 필요
                println(this@Seed.name) // Seed
                println(this@Fruit.name) // Fruit
            }
        }
    }
}

// 확장 함수
fun Fruit.grow(amount: Int) {
    absorbWater(amount)

    // Fruit 의 changeColor() 호출
    changeColor("Red") // Fruit Red~
}

// inner class 를 확장한 함수
fun Fruit.Seed.grow(amount: Int) {
    germinate()
    // Seed 의 changeColor() 호출
    changeColor("Red") // Seed Red~
}

// inner class 를 확장한 함수
fun Fruit.Seed.DNA.grow(amount: Int) = amount.grow()

fun main() {
    val fruit = Fruit()
    fruit.grow(3) // Fruit Red~

    val seed = fruit.Seed()
    seed.grow(4) // Seed Red~
    seed.whichThis() // Seed  Seed  Fruit

    val dna = seed.DNA()
    dna.plant()
    dna.grow(5) // Int  Int  DNA  Seed  Fruit
    dna.witchThis() // DNA  DNA  Seed  Fruit
    dna.changeColor("Red") // Seed Red~  Fruie Red~
}
