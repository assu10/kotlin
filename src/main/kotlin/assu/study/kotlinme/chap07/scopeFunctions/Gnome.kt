package assu.study.kotlinme.chap07.scopeFunctions

class Gnome(val name: String) {
    fun who() = "Gnome $name"
}

fun whatGnome(gnome: Gnome?) {
    gnome?.let { it.who() }
    gnome.let { it?.who() } // 영역 함수 안에서 개별적으로 null 검사

    gnome?.run { this.who() }
    gnome.run { this?.who() } // 영역 함수 안에서 개별적으로 null 검사

    gnome?.apply { who() }
    gnome.apply { this?.who() } // 영역 함수 안에서 개별적으로 null 검사

    gnome?.also { it.who() }
    gnome.also { it?.who() } // 영역 함수 안에서 개별적으로 null 검사

    // 문맥 객체인 gnome 이 null 인지 검사할 방법이 없음
    with(gnome) { this?.who() } // 영역 함수 안에서 개별적으로 null 검사
}
