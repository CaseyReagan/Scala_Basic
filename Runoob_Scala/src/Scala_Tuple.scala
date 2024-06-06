object Scala_Tuple {

  /* 元组 Tuple
  * 元组可以容纳不同类型的对象，但它们也是不可变的
  * 元组是不同类型元素的集合
  *  */
  def tupleTestOne(args: Array[String]): Unit = {
    val tup = (12.3, 1000, "spark")
    val tup1 = new Tuple1(1)    // 必须1个元素
    val tup4 = new Tuple4(1, 2.0, "", 3)    // 必须4个元素

    println(tup)
    println(tup1)
    println(tup4)
  }

  /* 一定记住元组的取数下标是从1开始 */
  def tupleTestTwo(args: Array[String]): Unit = {
    val t,(a,b,c) = ("hadoop", 3.14, 65535)

    println(t)

    val r1 = t._1
    val r2 = t._2

    println(r1)
    println(r2)
  }

  /* zip命令可以将多个值绑定在一起 */
  def tupleTestThree(args: Array[String]): Unit = {
    val name = Array("xx1","xx2","xx3","xx4")
    val values = Array(1, 2, 3, 4)

    println(name.zip(values))
  }

  /* 迭代元组,输出 */
  def tupleTestFour(args: Array[String]): Unit = {
    val tup = (4, 3, 2, 1)

    tup.productIterator.foreach{ i => println("Value = " + i)}

    val tup2 = new Tuple3(1, "hello", Console)
    // 转字符串
    println("连接后的字符串为：" + tup2.toString())
  }

  /* 交换元组元素 */
  def tupleTestFive(args: Array[String]): Unit = {
    val tup = new Tuple2("Hello Scala!01", "Hello World!02")

    println("交换后的元组： " + tup.swap)
  }


  def main(args: Array[String]): Unit = {
    println("************* 1 *************")
    tupleTestOne(null)
    print("\n")

    println("************* 2 *************")
    tupleTestTwo(null)
    print("\n")

    println("************* 3 *************")
    tupleTestThree(null)
    print("\n")

    println("************* 4 *************")
    tupleTestFour(null)
    print("\n")

    println("************* 5 *************")
    tupleTestFive(null)
    print("\n")
  }
}
