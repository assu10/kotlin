package assu.study.kotlinme.chap04.memberReference

data class Message(
    val sender: String,
    val text: String,
    val isRead: Boolean,
)

fun main() {
    val message =
        listOf(
            Message("Assu", "Hello", true),
            Message("Silby", "Bow!", false),
        )

    val unread = message.filterNot(Message::isRead)
    println(unread) // [Message(sender=Silby, text=Bow!, isRead=false)]
    println(unread.size) // 1
    println(unread.single().text) // Bow!
}
