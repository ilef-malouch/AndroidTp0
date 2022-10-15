package com.gl4.tp

import java.lang.Math.abs

data class Point(var x:Int, var y:Int){

}

fun distance(p:Point, q:Point):Int{
    return abs(p.x - q.x) + abs(p.y - q.y)
}

class Rectangle(val p:Point=Point(0,0), val q:Point=Point(1,1)){
    override fun toString(): String {
        return "p=$p q=$q"
    }

    fun surface(): Int{
        return (q.x - p.x)*(q.y - p.y)
    }
}
fun main(argv : Array<String>){
    println("Hello")
    var rectangles = arrayOf(Rectangle(), Rectangle(Point(1,0), Point(2,1)), Rectangle(q=Point(2,2)))

    for(i in 0 .. rectangles.size-1){
        println( "la surface de ${rectangles[i].toString()} est ${rectangles[i].surface()} ")
    }
}