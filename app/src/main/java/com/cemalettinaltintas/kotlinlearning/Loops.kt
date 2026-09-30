package com.cemalettinaltintas.kotlinlearning

fun main(){
    println("----------For Loop----------")

    val myNumbers=arrayOf(12,15,18,21,24,27,30,33)

    for(number in myNumbers){
        val z=number/3*5
        //println(z)
    }

    for (b in 1..9){
        println(b)
    }

    val myStringArrayList= ArrayList<String>()
    myStringArrayList.add("Mehmet")
    myStringArrayList.add("Alp")
    myStringArrayList.add("Ilker")

    for (isim in myStringArrayList){
        println(isim)
    }

    myStringArrayList.forEach { println(it) }

    //While Loop


    println("-----------While Loop----------")

    var j=0

    while (j<10){
        println(j)
        j++
    }
}