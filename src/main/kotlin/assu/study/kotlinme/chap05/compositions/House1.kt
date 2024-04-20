package assu.study.kotlinme.chap05.compositions

interface Building

interface Kitchen

interface House : Building { // 상속
    val kitchen1: Kitchen // 합성
    val kitchen2: Kitchen
    val kitchens: List<Kitchen> // 합성
}
