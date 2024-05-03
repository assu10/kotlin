package assu.study.kotlinme.chap06.resourceCleanup

fun main() {
    val result1 =
        DataFile("result.txt")
            .useLines {
                it.joinToString()
            }

    val result2 =
        DataFile("result.txt")
            .useLines { it ->
                // 왼쪽의 it 은 파일에서 읽은 줄을 모아둔 컬렉션을 가리키고,
                // 오른쪽의 it 은 개별적인 줄을 뜻함
                it.filter { "#" in it }.first()
            }

    val result3 =
        DataFile("result.txt")
            .useLines { lines -> // 이렇게 람다에 이름을 붙이면 it 이 많아서 생기는 혼동을 줄일 수 있음
                lines.filter { line ->
                    "#" in line
                }.first()
            }

    println(result1) // result, #ok, ddd
    println(result2) // #ok
    println(result3) // #ok
}
