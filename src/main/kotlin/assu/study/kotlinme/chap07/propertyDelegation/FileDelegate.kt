package assu.study.kotlinme.chap07.propertyDelegation

import java.io.File
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

var targetDir = File("DataFiles")

class DataFile(val fileName: String) : File(targetDir, fileName) {
    init {
        if (!targetDir.exists()) {
            targetDir.mkdir()
        }
    }

    fun erase() {
        if (exists()) {
            delete()
        }
    }

    fun reset(): File {
        erase()
        createNewFile()
        return this
    }
}

// 위임받는 클래스
class FileDelegate : ReadWriteProperty<Any?, String> {
    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>,
    ): String {
        println("getValue(): ${property.name}")
        val file = DataFile(property.name + ".txt")
        return if (file.exists()) file.readText() else ""
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String,
    ) {
        println("setValue(): ${property.name}, $value")
        DataFile(property.name + ".txt").writeText(value)
    }
}

// 위임자 클래스
class Configuration {
    var user by FileDelegate()
    var id by FileDelegate()
    var project by FileDelegate()
}

fun main() {
    val config = Configuration()

    // 여기서 setValue() 호출
    config.user = "Assu" // setValue(): user, Assu
    config.id = "test_11" // setValue(): id, test_11
    config.project = "KotlinProject" // setValue(): project, KotlinProject

    val result1 = DataFile("user.txt").readText()
    val result2 = DataFile("id.txt").readText()
    val result3 = DataFile("project.txt").readText()

    println(config.user) // getValue(): user   ASSU
    println(config.id) // getValue(): id   test_11
    println(config.project) // getValue(): project   KotlinProject

    println(result1) // Assu
    println(result2) // test_11
    println(result3) // KotlinProject
}
