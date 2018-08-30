object Demo {



  def main(args: Array[String]) {



     println( "Returned Value : " + addInt(30,10) );

println( "Returned Value : " + multiplyint(30,10) );

println( "Returned Value : " + devideint(30,10) );


  } ;



  def addInt( a:Int, b:Int ) : Int = {



     var sum:Int = 0



     sum = a + b  ;    return sum



  }





  def devideint( a:Int, b:Int ) : Int = {



     var div:Int = 0



     div = a / b  ;    return div



  }







  def multiplyint( a:Int, b:Int ) : Int = {



     var mul:Int = 0



     mul = a * b  ;    return mul



  }





}
