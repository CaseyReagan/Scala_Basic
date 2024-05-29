object Scala_operators {
  /* Scala有如下的运算符：算术运算符、关系运算符、逻辑运算符、位运算符、赋值运算符 */

  /* 算术运算符 */
  def Arithmetic_operations(args: Array[String]): Unit ={
    var a = 10
    var b = 20
    var c = 25
    var d = 25
    printf("a=%d, b=%d, c=%d, d=%d\n",a,b,c,d)
    println("a + b = " + (a + b) )
    println("a - b = " + (a - b) )
    println("a * b = " + (a * b) )
    println("b / a = " + (b / a) )
    println("b % a = " + (b % a) )
    println("c % a = " + (c % a) )
  }

  /* 关系运算符 */
  def Relational_operators(args: Array[String]): Unit ={
    var a = 10;
    var b = 20;
    printf("a=%d, b=%d\n",a,b)
    println("a == b = " + (a == b) );
    println("a != b = " + (a != b) );
    println("a > b = " + (a > b) );
    println("a < b = " + (a < b) );
    println("b >= a = " + (b >= a) );
    println("b <= a = " + (b <= a) );
  }

  /* 逻辑运算符 */
  def Logical_Operators(args: Array[String]): Unit = {
    var a = true;
    var b = false;
    printf("a=%s, b=%s\n",a,b)
    println("a && b = " + (a&&b) );
    println("a || b = " + (a||b) );
    println("!(a && b) = " + !(a && b) );
  }

  /* 位运算符 */
  /* 先定义一个整型转8位二进制函数 */
  def to8BitBinary(n: Int): String = {
    val binaryString = Integer.toBinaryString(n)
    val paddingLength = 8 - binaryString.length % 8
    val paddedString = "0" * paddingLength + binaryString
    paddedString.takeRight(8)
  }

  def Bit_operators(args: Array[String]): Unit = {
    var a = 60;           /* 60 = 0011 1100 */
    var b = 13;           /* 13 = 0000 1101 */
    var c = 0;

    printf("a=%s, b=%s, c=%s\n",to8BitBinary(a),to8BitBinary(b),to8BitBinary(c))

    c = a & b;            /* 12 = 0000 1100 */
    println("a & b = " + to8BitBinary(c) + " = " + c);

    c = a | b;            /* 61 = 0011 1101 */
    println("a | b = " + to8BitBinary(c) + " = " + c);

    c = a ^ b;            /* 49 = 0011 0001 */
    println("a ^ b = " + to8BitBinary(c) + " = " + c);

    c = ~a;               /* -61 = 1100 0011 */
    println("~a = " + to8BitBinary(c) + " = " + c);

    c = a << 2;           /* 240 = 1111 0000 */
    println("a << 2 = " + to8BitBinary(c) + " = " + c);

    c = a >> 2;           /* 15 = 1111 */
    println("a >> 2  = " + to8BitBinary(c) + " = " + c);

    /* 无符号右移 */
    c = a >>> 2;          /* 15 = 0000 1111 */
    println("a >>> 2 = " + to8BitBinary(c) + " = " + c);
  }

  /* 赋值运算符 */
  def Assignment_operator(args: Array[String]): Unit = {
    var a = 10;
    var b = 20;
    var c = 0;

    printf("a=%d, b=%d, c=%d\n",a,b,c)
    c = a + b;
    println("c = a + b  = " + c );

    c += a ;
    println("c += a  = " + c );

    c -= a ;
    println("c -= a = " + c );

    c *= a ;
    println("c *= a = " + c );

    a = 10;
    c = 15;
    c /= a ;
    println("c /= a  = " + c );

    a = 10;
    c = 15;
    c %= a ;
    println("c %= a  = " + c );

    c <<= 2 ;
    println("c <<= 2  = " + c );

    c >>= 2 ;
    println("c >>= 2  = " + c );

    c >>= a ;
    println("c >>= a  = " + c );

    c &= a ;
    println("c &= 2  = " + c );

    c ^= a ;
    println("c ^= a  = " + c );

    c |= a ;
    println("c |= a  = " + c );
  }





  def main(args: Array[String]): Unit = {

    println("This is Arithmetic Operators in Scala:")
    Arithmetic_operations(null);
    print("\n")

    println("This is Relational Operators in Scala:")
    Relational_operators(null);
    print("\n")

    println("This is Logical Operators in Scala:")
    Logical_Operators(null);
    print("\n")

    println("This is Bit Operators in Scala:")
    Bit_operators(null);
    print("\n")

    println("This is Assignment Operators in Scala:")
    Assignment_operator(null);
  }
}
