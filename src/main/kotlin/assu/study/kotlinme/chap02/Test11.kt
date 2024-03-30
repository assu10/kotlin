package assu.study.kotlinme.chap02

// 다른 패키지에서는 임포트해서 사용함
import assu.study.kotlinme.chap03.singleQuota

fun main() {
    val result = "Single".singleQuota()
    println(result) // 'Single'
}
