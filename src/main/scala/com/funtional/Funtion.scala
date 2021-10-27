package com.funtional

object Function extends App {


  //val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
  val add: Function2[Int,Int,Int] = new Function2[Int,Int,Int] {
    def apply(x:Int,y:Int): Int = x + y
  }
  println(add(2,2))


  //  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  val sumOfList: Function1[List[Int],Int] = new Function[List[Int],Int] {
    override def apply(list: List[Int]): Int = list.sum
  }
  println(sumOfList(List(1,2,3,4)))


  // val higherOrderFunction: Function1[Function1[Int,Function1[Int,Int]],Int] = new Function[Function1[Int,Function1[Int,Int]],Int] {
  //  override def apply(num: Int): Function1[Int,Function1[Int,Int]] = new Function[Int,Function1[Int,Int]] {
  //    override def apply(num: Int): Function1[Int,Int] = new Function[Int,Int] {
  //      override def apply(num: Int): Int = num
  //    }
  //  }

  //  val higherOrderFunction: (Int => Int, Int) => Int = (f: (Int => Int), num : Int) => f(num)
  def higherOrderFunction (f: Int => Int, b: Int): Int = {
    def apply(b: Int) = f(b)
    apply(b)
  }
  println(higherOrderFunction(num => num , 3))

}
