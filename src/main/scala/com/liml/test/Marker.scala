package com.liml.test

/**
  * Created by Administrator on 2016/3/16.
  */
class Marker private(val color:String){
  override def toString(): String = "maker color " + color
}

object Marker{
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )
  def primaryColors = "red,green,blue"

  def apply(color:String) = if(markers.contains(color))
    markers(color) else null

  def main(args:Array[String]) ={
      val marker = new Marker("blue")
      println("Primary colors are : "+Marker.primaryColors)
      println(marker)
      println(Marker("red"))
  }
}
