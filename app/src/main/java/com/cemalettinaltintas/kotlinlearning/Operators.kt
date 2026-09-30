package com.cemalettinaltintas.kotlinlearning

fun main(){

    println("-----------Operator")
    var m=5

    m++
    println(m)
    m=m+1
    m--
    println(m)

    var n=7

    // && - and-ve

    // || - or - veya
    println(n>m)//true
    println(n>m && 1>2)//false
    println(n<m || 3>2)//true

    // Mod - Remainder - Kalan

    println(10%4)
}