package com.cemalettinaltintas.kotlinlearning

fun main(){
    val not=40
    if (not>=85)
        println("Harika takdir aldin.")
    else if (not>=50)
        println("Gectin, tebrikler!")
    else
        println("Maalesef kaldin.")


    // Koşullu ifadenin sonucunu expression olarak kullanma

    val sayi1=10
    val sayi2=20
    val enBuyuk=if (sayi1>sayi2){
        sayi1
    }
    else{
        sayi2
    } //ternary

    println("En buyuk sayi: $enBuyuk")


    //Switch - When

    val day=3
    var dayString=""

    when(day){
        1->dayString="Monday"
        2->dayString="Tuesday"
        3->dayString="Wednesday"
        else -> dayString=""
    }
    println(dayString)

}