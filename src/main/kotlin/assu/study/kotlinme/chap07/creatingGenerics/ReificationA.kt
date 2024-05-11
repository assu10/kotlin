package assu.study.kotlinme.chap07.creatingGenerics

// 코를린 클래스를 표현하는 클래스
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

// 제네릭 함수
fun <T : Any> a(kClass: KClass<T>): T {
    // KClass<T>를 사용함
    return kClass.createInstance()
}

// 제네릭 함수 b() 에서 a() 호출 시 제네릭 인자의 타입 정보를 전달하려고 시도
// 하지만 타입 소거로 인해 컴파일되지 않음
// 아래와 같은 오류
// Cannot use 'T' as reified type parameter. Use a class instead.

// fun <T:Any> b() = a(T::class)
