object Scala_Array {
  /* scala下的数组是传统数组，只能存同一类型的数据 */

  def stringTestOne(args: Array[String]):Unit ={
    /* 标准格式两种 */
    var z:Array[String] = new Array[String](3)

    var z2 = new Array[String](3)

    z(0) = "Runoob"; z(1) = "Baidu"; z(4/2) = "Google"

    z2 = Array("Runoob", "Baidu", "Google")

    var z3 = Array("Runoob", "Baidu", "Google")

    for( x <- z){
      print(x)
      print(" ")
    }
    println("")
    for( x <- z2){
      print(x)
      print(" ")
    }
    println("")
    for( x <- z3){
      print(x)
      print(" ")
    }
    println("")
    //下面这种写法是不行的
    //println("%s",z)
  }

  def stringTestTwo(args: Array[String]):Unit ={
    var myList = Array(3.9, 2.9, 3.4, 3.5)

    var total = 0.0

    /* Sum the Array */
    for (i <- 0 to (myList.length - 1)){
      total += myList(i)
    }

    println("总和为：" + total)

    var max = myList(0);

    for ( i <- 1 to (myList.length - 1)){
      if (myList(i) > max){
        max = myList(i)
      }
    }

    println("最大值为： " + max)
  }

  /* 定义二维数组 */
  def stringTestThree(args: Array[String]):Unit ={
    val myMatrix = Array.ofDim[Int](3,3)

    // 赋值
    for (i <- 0 to 2){
      for (j <- 0 to 2){
        myMatrix(i)(j) = i+j;
      }
    }

    // 打印二维矩阵
    for (i <- 0 to 2){
      for(j <- 0 to 2){
        print(" " + myMatrix(i)(j))
      }
      println()
    }
  }

  def stringTestFour(args: Array[String]):Unit ={
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = Array.concat( myList1, myList2)

    // 输出所有数组元素
    for (x <- myList3){
      println(x)
    }
  }



  def main(args: Array[String]):Unit ={
    println("************* 1 *************")
    stringTestOne(null)
    print("\n")

    println("************* 2 *************")
    stringTestTwo(null)
    print("\n")

    println("************* 3 *************")
    stringTestThree(null)
    print("\n")

    println("************* 4 *************")
    stringTestFour(null)
    print("\n")

  }
}
