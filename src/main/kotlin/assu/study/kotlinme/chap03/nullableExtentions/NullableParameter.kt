package assu.study.kotlinme.chap03.nullableExtentions

// s 가 null 이 될 수 있는 타입이므로 명시적으로 null 여부 확인과 빈 문자열 검사 가능
// || 는 쇼트 쇼킷을 이용한 것으로, 첫 번째 식이 true 이면 전체 식이 true 로 결정되므로 두 번째 식은 아예 검사하지 않음
// 따라서 s 가 null 이어도 NPE 가 발생하지 않음
fun isNullOrEmpty(s: String?): Boolean = s == null || s.isEmpty()

fun main() {
    println(isNullOrEmpty(null)) // true
    println(isNullOrEmpty("")) // true
}
