package com.cemalettinaltintas.kotlinlearning

fun main(){
    val ogrenciler = arrayOf("Ali", "Ayşe", "Mehmet", "Zeynep")

    println(ogrenciler[0])

    ogrenciler[0]="Cemal"

    ogrenciler.set(3,"Hasan")
    println(ogrenciler[3])

    val numberArray=arrayOf(5,10,15,20)
    println(numberArray[0])

    val benimYeniDizim=doubleArrayOf(2.1,5.4,6.7,1.0)
    println(benimYeniDizim[2])

    val karisikDizim=arrayOf("Ali",10,true)
    println(karisikDizim[2])

    //List - ArrayList
    println("------------Lists----------")

    val students=arrayListOf<String>("Yusuf","Beyzanur","Onur")
    //println(students[0])
    students.add("Yalin")
    //println(students[3])
    students.add(0,"Alp")
    println(students[4])
    //Set
    println("-----------Set------------")
    val mySet=setOf<Int>(1,4,2,3)

    //println(mySet.size)

    //println(mySet.elementAt(0))
    //println(mySet.elementAtOrNull(5))

    //For Each
    mySet.forEach { println(it*10) }

    //Hash Map

    println("-----------Map---------------")

    //Key - Value

    val fruitCaloriMap=hashMapOf<String, Int>()
    fruitCaloriMap.put("apple",100)
    fruitCaloriMap.put("banana",150)
    println(fruitCaloriMap["banana"])

}