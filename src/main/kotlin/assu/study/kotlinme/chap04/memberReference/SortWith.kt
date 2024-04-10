package assu.study.kotlinme.chap04.memberReference

data class Message1(
    val sender: String,
    val text: String,
    val isRead: Boolean,
)

fun main() {
    val messages =
        listOf(
            Message1("Assu", "AAA", true),
            Message1("Assu", "CCC", false),
            Message1("Silby", "BBB", false),
        )

    // isRead 가 false 순으로 정렬 후 text 순으로 정렬
    val result1 =
        messages.sortedWith(
            compareBy(
                Message1::isRead,
                Message1::text,
            ),
        )

    // [Message1(sender=Silby, text=BBB, isRead=false), Message1(sender=Assu, text=CCC, isRead=false), Message1(sender=Assu, text=AAA, isRead=true)]
    println(result1)
}
