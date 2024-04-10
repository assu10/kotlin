package assu.study.kotlinme.chap04.memberReference

data class Message2(
    val sender: String,
    val text: String,
    val isRead: Boolean,
    val attachments: List<Attachment>,
)

data class Attachment(
    val type: String,
    val name: String,
)

// Message2.isImportant() 라는 확장 함수
fun Message2.isImportant(): Boolean =
    text.contains("Money") ||
        attachments.any {
            it.type == "image" && it.name.contains("dog")
        }

fun main() {
    val messages =
        listOf(
            Message2(
                "Assu",
                "gogo",
                false,
                listOf(Attachment("image", "cute dog")),
            ),
        )
    // any() 에 확장 함수에 대한 참조를 전달
    val result = messages.any(Message2::isImportant)
    println(result) // true
}
