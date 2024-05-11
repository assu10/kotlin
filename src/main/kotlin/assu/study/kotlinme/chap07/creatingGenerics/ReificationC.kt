package assu.study.kotlinme.chap07.creatingGenerics

import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

// 제네릭 함수
fun <T : Any> a1(kClass: KClass<T>): T {
    // KClass<T>를 사용함
    return kClass.createInstance()
}

fun <T : Any> c1(kClass: KClass<T>) = a1(kClass)

class A

// 명시적으로 타입 정보 전달
val kc = c1(A::class)
