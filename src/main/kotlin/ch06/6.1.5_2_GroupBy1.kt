package ch06.ex1_5_2_GroupBy1

fun main(args: Array<String>) {
    val list = listOf("apple", "apricot", "banana", "cantaloupe")
    println(list.groupBy(String::first))
}
