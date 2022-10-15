package com.gl4.tp

fun main(argv : Array<String>) {
    //Premiere Application:
    println("Hello")
    var message : String?="My message can possibly be null !"
    message!!.uppercase()
    println(message)

    //Les variables:
    var hello = "Hello"
    hello = "Hello world!"
    println(hello)
    var toto:String = "Toto"
    println(toto)

    var message1: String? = "I’m learning Kotlin!"
    message1 = null
    println(message1.toString())

    //Les fonctions:
    fun sum(a:Int,b:Int):Int {
        return a + b
    }

    fun sayMyName(name:String) { println(" $name ") }

    fun sayHello() = "Hello"

    //Les listes:
    fun showList(list: List<String>){
        // Complétez la fonction pour afficher les éléments de la liste
        for (i in 0 .. list.size-1){
            println(list[i])
        }
    }

    fun oddNumbersTo10(){
        // Complétez la fonction pour afficher les nombres impairs jusqu'à 10
        for(i in 0 .. 10) {
            if(i%2 == 0){
                println(i)
            }
        }
    }

    val languages =  listOf("Java", "Python", "Javascript", "Kotlin", "C++")// Créez une liste ordonnée de plusieurs languages de programation

    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()

    //Les choix et les conditions:
    var a = 10
    var b = 12

    val result = if (a > b){
        a++
        a
    } else {
        b++
        b
    }
    print("Result is : $result")


    val number  = 15
    when(number){
        1 -> print("Un")
        2 -> print("Deux")
        3 -> print("Trois")
        else -> print("Inconnu")
    }

    fun calculatrice(n1:Int, n2:Int, op:String):Int{
        when(op){
            "+" -> return a + b
            "-" -> return a - b
            "*" -> return a * b
            else -> return 0
        }
    }







}