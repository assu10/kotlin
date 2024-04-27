@file:Suppress("ktlint:standard:no-wildcard-imports")

package assu.study.kotlinme.chap05.nastedClasses

import assu.study.kotlinme.chap05.nastedClasses.Ticket.Seat.*

class Ticket(
    val name: String,
    val seat: Seat = Coach,
) {
    // 내포된 enum
    enum class Seat {
        Coach,
        Premium,
        First,
    }

    fun upgrade(): Ticket {
        // 결과값을 values() 인덱스로 사용하여 새로운 Seat enum 타입값을 만듦
        val newSeat =
            Ticket.Seat.values()[
                // 호출된 객체(seat.ordinal + 1)가 특정 객체(First.ordinal)보다 더 작으면 호출된 객체 반환, 아니면 최대 객체 반환
                (seat.ordinal + 1).coerceAtMost(First.ordinal),
            ]
        return Ticket(name, newSeat)
    }

    // when 을 사용하여 모든 Seat 타입 검사
    fun meal() =
        when (seat) {
            Coach -> "coach meal~"
            Premium -> "premium meal~"
            First -> "first meal~"
        }

    override fun toString() = "$seat~"
}

fun main() {
    val tickets =
        listOf(
            Ticket("AAA"),
            Ticket("BBB", Premium),
            Ticket("CCC", First),
        )

    val result1 = tickets.map(Ticket::meal)
    val result2 = tickets.map(Ticket::upgrade)

    println(tickets) // [Coach~, Premium~, First~]
    println(result1) // [coach meal~, premium meal~, first meal~]
    println(result2) // [Premium~, First~, First~]
}
