object Scala_Method_Function {
  /* Scala里同时具有方法和函数
  * scala中方法是类的一部分，函数是一个对象，可以赋值给一个变量
  * scala中用 def 定义方法，用 val 定义函数
  * */

  /* 定义一个方法举例 */
  def sum(a: Int, b: Int): Int = {
    a + b
  }

  /* 定义一个函数举例 */
  val sum2 = (a:Int, b:Int) => {
    a+b
  }

  /* scala方法不能作为参数进行传递和调用
  * 但是函数，因为是一个对象所以可以作为参数进行传递，相当于scala中函数是一等公民
  * 但是scala可以将方法转换为函数，从而传递
  *  */
  // 下划线可以将方法转化为函数，但是注意中间有空格
  // sum _

  // 定义一个方法，参数是一个函数
  def fn(f: (Int, Int) => Int): Unit = {
    println(f(3, 10))
  }

  // 方法有返回值，如果没有返回值，可以返回unit,相当于void
  def addInt(a:Int, b:Int) : Int = {
    var sum : Int = 0
    sum = a + b

    return sum
  }

  def main(args: Array[String]): Unit={
    println("********* 第一段sum测试 *********")
    fn(sum)       // 虽然sum是一个方法，但是scala会自动将他转化为函数
    fn(sum2)      //
    print("\n")

    println("********* 第二段sum测试 *********")
    println(addInt(3,5))
    print("\n")
  }

}
