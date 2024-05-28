object Scala_Variable {
  def main(args: Array[String])={
    /* 在 Scala 中，使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。 */

    var myFirstVar : String = "Hello"
    var myIntVar : Int = 1111

    val myFirstVal : String = "Scala!"
    val myIntVal : Int = 2222;

    /* 不管是println(), 还是print()语句, 都可以同时打印多个值
    * println() 是换行输出， print()是不换行输出
    *  */
    println(myFirstVar)
    print(myIntVar + "\n")

    println(myFirstVal)
    print(myIntVal)

    println(myFirstVal)
    println("************* 1 *************")
    /* printf():文字格式化输出，同其他语言printf() */
    printf("myFirstVar: %s\n myFirstVal: %s\n",myFirstVar,myFirstVal)
    printf("myIntVar in decimal: %d\n myIntVar in Hex: %X\n myIntVar in hex: %x\n",myIntVar,myIntVar,myIntVar)
    printf("myIntVar in string: %s\n",myIntVar)

    var myInt2: Int = 999888
    printf("myInt2 in Hex: %Xh\n myInt2 in hex: 0x%x\n",myInt2,myInt2)
    println("************* 2 *************")

    /* 在 Scala 中声明变量和常量不一定要指明数据类型，在没有指明数据类型的情况下，其数据类型是通过变量或常量的初始值推断出来的。
    * 所以，如果在没有指明数据类型的情况下声明变量或常量必须要给出其初始值，否则将会报错。
    */
    var my_var_2 = 10
    var my_var_string_2 = "String Test!"
    val my_val_3 = "Test val !"

    println(my_var_2)
    println(my_var_string_2)
    println(my_val_3)
    println("************* 3 *************")

    /* Scala 支持多个变量的声明
    * aint, bint都声明为100
    */
    val aint,bint = 100
    println(aint,bint)
    println(aint+"\t"+bint)
    println("************* 4 *************")

    /* 我们可以使用 val 来声明一个元组： */
    val tup_1 : (Int,String) = (200,"Spark!")
    println(tup_1)
  }
}
