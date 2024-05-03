package assu.study.kotlinme.chap06.logging

import mu.KLogging

private val log = KLogging().logger

fun main() {
    val msg = "hello~"

    log.trace(msg)
    log.debug(msg)
    log.info(msg) // [main] INFO mu.KLogging - hello~
    log.warn { msg } // [main] WARN mu.KLogging - hello~
    log.error { msg } // [main] ERROR mu.KLogging - hello~
}
