package assu.study.kotlinme.chap04.memberReference

data class Message3(
    val sender: String,
    val text: String,
    val isRead: Boolean,
    val attachments: List<Attachment3>,
)

data class Attachment3(
    val type: String,
    val name: String,
)

// Message2.isImportant() 라는 확장 함수
fun Message3.isImportant(): Boolean =
    text.contains("Money") ||
        attachments.any {
            it.type == "image" && it.name.contains("dog")
        }

fun ignore(message: Message3): Boolean = !message.isImportant() && message.sender in setOf("Assu", "Silby")

fun main() {
    val message =
        listOf(
            Message3("Assu", "gogo!", false, listOf()),
            Message3("Assu2", "gogo!2", false, listOf()),
            Message3(
                "Assu",
                "gogo!",
                false,
                listOf(
                    Attachment3("image", "cute dog"),
                ),
            ),
        )

    // 최상위 수준 함수에 대한 참조 전달
    val result1 = message.filter(::ignore)

    // `count()` 대신 size 를 사용하는 비효율적인 코드
    val result2 = message.filter(::ignore).size
    val result3 = message.count(::ignore)

    println(result1) // [Message3(sender=Assu, text=gogo!, isRead=false, attachments=[])]
    println(result2) // 1
    println(result3) // 1

    val result4 = message.filterNot(::ignore)
    val result5 = message.filterNot(::ignore).size

    println(result4) // [Message3(sender=Assu, text=gogo!, isRead=false, attachments=[Attachment3(type=image, name=cute dog)])]
    println(result5) // 1
}
