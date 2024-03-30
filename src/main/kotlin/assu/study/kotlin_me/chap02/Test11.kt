package assu.study.kotlin_me.chap02

// 다른 패키지에서는 임포트해서 사용함
import assu.study.kotlin_me.chap03.singleQuota

fun main() {
    val result = "Single".singleQuota()
    println(result) // 'Single'
}