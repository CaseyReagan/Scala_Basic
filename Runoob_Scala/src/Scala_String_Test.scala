object Scala_String_Test {

  def  stringTestOne(args: Array[String]): Unit={
    val greeting: String = "Hello, Scala!"

    println(greeting)

    val buf = new StringBuilder;
    buf += 'a'
    buf ++= "bcdef"

    println("buf is : " + buf.toString)
  }

  def stringTestTwo(args: Array[String]): Unit={
    var buf2 = "Hello"
    buf2 = "Hello Scala"

    var len = buf2.length()

    println(buf2)
    println("String Length is : " + len)

    var str1 = "Hello "
    var str2 = "Scala!"
    var str3 = "Next, Hello "
    var str4 = "Spark!"

    println( str1 + str2)
    println(str3.concat(str4))

    //格式化输出
    printf("String format output: %s%s%s",str1,str2,str3)

  }

  def main(args: Array[String]): Unit={

    println("************* 1 *************")
    stringTestOne(null)
    print("\n")

    println("************* 2 *************")
    stringTestTwo(null)
    print("\n")


  }

}
