
//top level functions are static can not be different from that.
//top level functions are private by default but can be cahanged
fun printAString(value:String):Unit{
    println(value)
}

fun main(args: Array<String>): Unit {
    printAString("HelloWorld")
    printSomeMaths(14.9,87.45)

    println(addTwoNumbers(65.98))

    //named parameter
    printSomeMaths(two=14.9,one=87.45)
}

//single expression function, can only contain one line
fun addTwoNumbers(one:Double, two:Double=3.9):Double = one+two

fun addTwoNumbers2(one:Double, two:Double) = one+two

//this one is also returning, but returning Unit
fun printAString2(value:String):Unit =println(value)

fun printSomeMaths(one:Double,two:Double){
    println(" one + two is ${one+two}")
    println(" one - two is ${one-two}")
}

//java like solution
fun functionTakesLambda(input:String,action:java.util.function.Function<String,Int>){
    println(action.apply(input))
}

//how would be in kotlin
fun functionTakesLambdaKotlin(input:String,action:(String) -> Int){
    println(action(input))
}