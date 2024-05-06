package assu.study.kotlinme.chap07.scopeFunctions

import kotlin.random.Random

fun gets(): String? = if (Random.nextBoolean()) "str!" else null

fun main() {
    val result =
        gets()?.let { // gets() 의 반환값이 null 이 아닐 때만 let 이 호출됨
            // let 에서 null 이 될 수 없는 수신 객체는 람다 내부에서 null 이 될 수 없는 it 이 됨
            it.removeSuffix("!") + it.length
        }

    println(result) // str4 or null
}
