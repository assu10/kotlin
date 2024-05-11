package assu.study.kotlinme.chap07.creatingGenerics

import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

// 제네릭 함수
fun <T : Any> a2(kClass: KClass<T>): T {
    // KClass<T>를 사용함
    return kClass.createInstance()
}

// reified 키워드 사용
// 클래스 참조를 인자로 요구하지 않음
inline fun <reified T : Any> d() = a2(T::class)

class A1

val kd = d<A1>()
