package assu.study.kotlin_me.chap02

fun main() {
    // 중복이 제거됨
    val set1 = setOf(1, 1, 2, 2, 3, 3)
    println(set1)   // [1,2,3]

    var set2 = setOf(2, 2, 1, 1, 3, 3)
    println(set2)   // [2,3,1]

    // 원소의 순서는 중요하지 않음
    val setEq = set1 == set2
    println(setEq)  // true

    // 원소인지 검사
    val containsSet1 = 1 in set1
    val containsSet2 = 7 in set1

    println(containsSet1)   // true
    println(containsSet2)   // false

    // 한 집합이 다른 집합을 포함하는지 여부 확인
    val containsSet3 = set1.containsAll(setOf(1, 3))
    println(containsSet3)   // true

    // 합집합
    val unionSet = set1.union(setOf(3, 4))
    println(unionSet)   // [1,2,3,4]

    // 교집합
    val intersectSet = set1.intersect(setOf(3, 4))
    println(intersectSet)   // [3]

    // 차집합
    val subtractSet = set1.subtract(setOf(3, 4))
    println(subtractSet)    // [1,2]

    val subtractSet2 = set1 - setOf(3, 4)
    println(subtractSet2)   // [1,2]
}