package ch08.ex1_4_1_KotlinMakesNumberConversionsExplicit

fun main(args: Array<String>) {
    val x = 1
    println(x.toLong() in listOf(1L, 2L, 3L))
}
