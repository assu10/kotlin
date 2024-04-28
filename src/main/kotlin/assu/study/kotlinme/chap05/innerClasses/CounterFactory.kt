package assu.study.kotlinme.chap05.innerClasses

// 단일 추상 메서드 (fun interface)
fun interface Counter {
    fun next(): Int
}

object CounterFactory {
    private var count = 0

    // Counter interface 구현
    // 이름이 붙은 inner 클래스의 인스턴스 반환
    fun new(name: String): Counter {
        // Local inner 클래스
        class Local : Counter {
            // 주생성자
            init {
                println("Local()~")
            }

            override fun next(): Int {
                // 함수의 지역 변수나 외부 객체 프로퍼티에 접근 가능
                println("$name, $count~")
                return count++
            }
        }
        return Local()
    }

    // 익명 inner 클래스 반환
    fun new2(name: String): Counter {
        // 익명 inner 클래스 인스턴스
        return object : Counter {
            init {
                println("Counter()~")
            }

            override fun next(): Int {
                println("$name, $count~~")
                return count++
            }
        }
    }

    // SAM 변환을 사용하여 익명 객체 반환
    fun new3(name: String): Counter {
        println("Counter()~~")
        // SAM 변환
        return Counter {
            println("$name, $count~~~")
            count++
        }
    }
}

fun main() {
    fun aaa(counter: Counter) {
        (0..3).forEach { _ -> counter.next() }
    }

    // Local()~
    // Local inner class, 0~
    // Local inner class, 1~
    // Local inner class, 2~
    // Local inner class, 3~
    val result1 = aaa(CounterFactory.new("Local inner class"))

    // Counter()~
    // Anonymous inner class, 4~~
    // Anonymous inner class, 5~~
    // Anonymous inner class, 6~~
    // Anonymous inner class, 7~~
    val result2 = aaa(CounterFactory.new2("Anonymous inner class"))

    // Counter()~~
    // SAM, 8~~~
    // SAM, 9~~~
    // SAM, 10~~~
    // SAM, 11~~~
    val result3 = aaa(CounterFactory.new3("SAM"))
}
