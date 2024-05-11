package assu.study.kotlinme.chap07.creatingGenerics

val rabbitBox = Box<Rabbit>(Rabbit())

// 컴파일 오류
// Type mismatch.
// Required: Box<Pet>
// Found: Box<Rabbit>

// val petBox: Box<Pet> = rabbitBox

// 컴파일 오류
// Type mismatch.
// Required: Box<Any>
// Found: Box<Rabbit>

// val anyBox: Box<Any> = rabbitBox
