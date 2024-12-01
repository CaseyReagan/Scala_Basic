import scala.collection.mutable.ListBuffer

object Scala_List {
  /* Scala List有两种，一种不可变长度，不可变内容的List
  * 另一种是List长度和内容都可以变的 ListBuffer
  *  */

  /* 构造基本的，默认的，不可变List，用Nil和::
  * 注意，:: 操作符是右结合的
  * */
  def listTestOne(args: Array[String]): Unit = {
    val lst1 = List(1,2,3)

    println("List 1 is: " + lst1)

    //将元素0插入list1的前面，生成一个新list
    val lst2 = 0 :: lst1
    val lst4 = 0 +: lst1

    println("List 2 is: " + lst2)
    println("List 4 is: " + lst4)

    // 将一个元素添加到list尾，产生一个新list
    val lst6 = lst1 :+ 3

    println("List 6 is: " + lst6)

    //新建一个list0
    val lst0 = List(4,5,6)

    //两个List的合并操作
    val lst7 = lst1 ++ lst0
    val lst8 = lst1 ++: lst0
    val lst9 = lst1 ::: lst0
    val lst10 = List.concat(lst1,lst0)

    println("List 7 is: " + lst7)
    println("List 8 is: " + lst8)
    println("List 9 is: " + lst9)
    println("List 10 is: " + lst10)

    // 反转列表
    println("************* Reverse *************")
    println(lst1.reverse)
    println(lst1.head)
    println(lst1.tail)
  }

  /* List 和 Array 对比
  * 相同点长度不可变，但Array内容可变，List内容不可变
  *  */

  /* 可变序列 ListBuffer
  * 运用ListBuffer需要 import scala collection.mutable._
  * */
  def listBufferTestOne(args: Array[String]): Unit = {
    val lstbuf0 = ListBuffer[Int](1,2,3)
    val lstbuf1 = new ListBuffer[Int]

    // 向listbuffer中直接追加元素，注意没有生成新的List
    lstbuf1 += (4,6)
    lstbuf1.append(5)
    println("ListBuffer 1 is: " + lstbuf1)

    // 合并两个list并生产一个新list
    val lstbuf2 = lstbuf0 ++ lstbuf1
    println("ListBuffer 2 is: " + lstbuf2)

    // 将list1里的元素追加到list0中，注意： 没有生成新的集合
    lstbuf0 ++= lstbuf1
    println("New ListBuffer 0 is: " + lstbuf0)

    // 将元素追加到lst0后生成一个新集合
    val listBuffer3 = lstbuf0 :+ 5
    println("ListBuffer 3 is: " + listBuffer3)

    // 将元素追加到lst0的前面
    val listBuffer4 = 5 +: lstbuf0
    println("ListBuffer 4 is: " + listBuffer4)

    // 去除元素
    lstbuf2 -= (1,3)
    println("New ListBuffer 2 is: " + lstbuf2)
    lstbuf2 --= List(7,9)
    println("New ListBuffer 2 is: " + lstbuf2)

    // remove用法是，第一个参数是下标，第二个参数是去除个数
    lstbuf2.remove(1,2)
    println("New ListBuffer 2 is: " + lstbuf2)

    // 是否为空判断
    println(lstbuf2.isEmpty)
  }

  /* 可变list可以通过 toList 方法，生成新的List
  * list可以通过 toBuffer，转变成 ArrayBuffer
  *  */
  def main(args: Array[String]): Unit = {
    println("************* 1 *************")
    listTestOne(null)
    print("\n")

    println("************* 2 *************")
    listBufferTestOne(null)
    print("\n")
  }
}
