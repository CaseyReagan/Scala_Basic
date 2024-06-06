import scala.collection.mutable.ArrayBuffer

object Scala_Array {
  /* scala下的数组是传统数组，只能存同一类型的数据 */

  def arrayTestOne(args: Array[String]):Unit ={
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

  def arrayTestTwo(args: Array[String]):Unit ={
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
  def arrayTestThree(args: Array[String]):Unit ={
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

  def arrayTestFour(args: Array[String]):Unit ={
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = Array.concat( myList1, myList2)

    // 输出所有数组元素
    for (x <- myList3){
      println(x)
    }
  }

  def arrayTestFive(args: Array[String]):Unit ={
    val arr1 = new Array[Int](8)

    //这是个好东西，toBuffer可以将数组转换为数组缓冲，就可以直接打印了
    println(arr1.toBuffer)

    val arr2 = Array[Int](10)
    // 没有调用new 关键字的话，相当于直接对数组赋值
    println(arr2.toBuffer)

    // 使用变长数组(数据缓冲)
    val ab = ArrayBuffer[Int](1,3,4)
    println("original ab : " + ab)

    // += 可以向数据缓冲的尾部追加一个元素
    ab += 1
    // 追加多个元素
    ab += (2, 3, 4, 5)
    println(ab)

    // 减少元素，从头匹配
    ab -= (3,4)
    println(ab)

    // 用 ++= 追加一个数组，似乎没什么区别
    ab ++= Array(6, 7)
    println(ab)

    // 追加一个数组缓冲
    ab ++= ArrayBuffer(8,9)
    println(ab)

    // 减少一个数组元素
    ab --= Array(6, 7)
    println(ab)

    // 用insert函数向数组某个位置插入元素，第一个参数为元素位置
    ab.insert(0, -1, 0)
    println(ab)

    // 删除数组某个位置的元素用 remove，第一个参数为元素位置，第二个参数为要删几个元素
    ab.remove(8,2)
    println(ab)

    //用clear()函数来清空操作
    ab.clear()
    println(ab)
  }

  /* 变长数组和定长数组之间的转换 */
  def arrayTestSix(args: Array[String]):Unit ={
    /* toArray 将变长数组转换为定长数组
    * toBuffer 将定长数组转换为变长数组
    * yield 关键字 将原始的数组进行转换，并生成一个新的数组，但原始数组不影响
    *  */
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val res = for(e <- arr if e % 2 == 0) yield e * 10
    println(res.toBuffer)

    /* 更高级更舒服的用法
    * filter过滤，接收一个返回值为boolean的函数
    * map
    *  */
    val res2 = arr.filter(x => x % 2 ==0).map(x => x * 10)
    println(res2.toBuffer)
  }



  def main(args: Array[String]):Unit ={
    println("************* 1 *************")
    arrayTestOne(null)
    print("\n")

    println("************* 2 *************")
    arrayTestTwo(null)
    print("\n")

    println("************* 3 *************")
    arrayTestThree(null)
    print("\n")

    println("************* 4 *************")
    arrayTestFour(null)
    print("\n")

    println("************* 5 *************")
    arrayTestFive(null)
    print("\n")

    println("************* 6 *************")
    arrayTestSix(null)
    print("\n")
  }
}
