object Scala_If_Else {
  /*Scala's logical judgment function, the if...else.. */

  /* 普通判断 */
  def testFuncOne(args: Array[String]): Unit={
    var x = 10
    println("x = " + x)

    if( x < 20 ) {
      println("x < 20")
    }
  }

  /* if...else 语句 */
  def testFuncTwo(args: Array[String]): Unit={
    var x = 30
    println("x = " + x)

    if( x < 20 ){
      println("x 小于 20")
    }else{
      println("x 大于等于 20")
    }
  }

  /* if...else 多项判断语句 */
  def testFuncThree(args: Array[String]): Unit={
    var x = 30
    println("x = " + x)

    if( x == 10 ){
      println("X 的值为 10")
    }else if( x == 20 ){
      println("X 的值为 20")
    }else if( x == 30 ){
      println("X 的值为 30")
    }else{
      println("无法判断 X 的值")
    }
  }

  /* if...else 嵌套语句 */
  def testFuncFour(args: Array[String]): Unit={
    var x = 30
    var y = 10
    println("x = " + x + ", y = " + y)

    if( x == 30 ){
      if( y == 10 ){
        println("X = 30 , Y = 10")
      }
    }

  }

  def main(args: Array[String]): Unit={

    testFuncOne(null)
    print("\n")

    testFuncTwo(null)
    print("\n")

    testFuncThree(null)
    print("\n")

    testFuncFour(null)
  }
}
