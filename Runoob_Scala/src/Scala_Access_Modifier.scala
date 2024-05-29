object Scala_Access_Modifier {
  /* Scala 访问修饰符基本和Java的一样，分别有：private，protected，public */

  /* Private私有修饰符 用法 */
  class Outer{
    class Inner{
      private def func(): Unit = {
        println("private function!")
      }

      /*
      * 用 private 关键字修饰的func()函数，仅在Inner class之内可以被调用
      * */
      class InnerMost{
        func()
      }
    }

    /* 错误写法
    * 如下写法是错误的，Inner之外不能被调用，但是可以通过调用InnerMost来调用
    * */
    //(new Inner).func()
  }





  def main(args: Array[String]): Unit = {
    /* 测试Private class func() */
    //(new Outer).Inner().InnerMost()

  }

}
