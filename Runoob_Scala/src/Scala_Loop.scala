object Scala_Loop {
  /* Scala的各种循环语法 */

  /* while函数
  * 注意，若第一次判断为false，则整个不会执行
  * */
  def testLoopWhile(args: Array[String]): Unit={
    var i=0
    while (i<5){
      println(i)
      i += 1
    }
  }

  /* do...while函数
  * do while的区别是，先执行一次内容，再执行while里的判断，不论如何都会打印一次
  * */
  def testLoopDoWhile(args: Array[String]): Unit={
    var j = 0
    do{
      println(j)
      j += 1
    }while(j>0 && j<5)
  }

  /* for() 函数
  * for(i=1;i<10;i++) 传统的java中的for循环  for(Int I :arr) 增强for循环
  * Scala的语法结构：for (i <- 表达式/数组/集合)
  * */
  def testLoopFor(args: Array[String]): Unit={

    val arr = Array("a", "b", "c")
    for(i <- arr){
      println(i)
    }

    val index = Array(0,1,2)
    for(i <- index){
      // 获取元素的方式是（），java中是[]
      println(arr(i))
    }

    /* 1 to 10   生成  Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)    左闭右闭区间  [ ] */
    /*
    for (i <- 1 to 6){
      println(i)
      println(arr(i))
    }
    */
    // 这段会报错，超出arr范围

    // 0 until 6 => 会生成一个范围集合Range(0,1,2,3,4,5)
    /*
    for(i <- 1 until 6) {
      println(arr(i))
    }
    */
    // 这段会报错，超出arr范围

    //高级for循环
    //每个生成器都可以带一个条件
    for(i <- 1 to 3; j <- 1 to 3 if i != j){
      print((10 * i + j) + " ")
    }

    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val v = for (i <- 1 to 10) yield i * 10
    println(v)
  }




  def main(args: Array[String]): Unit={
    println("*********** TEST 1 ***********")
    //testLoopWhile(null)
    print("\n")

    println("*********** TEST 2 ***********")
    //testLoopDoWhile(null)
    print("\n")

    println("*********** TEST 3 ***********")
    testLoopFor(null)
  }

}
