import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
    //ordenarSelectionSort()

    var name = "Matt"
    val surname = "Greencorft"

    var nullTeste:String? = null

    name = "Orestes"

    //surname = "Oliveira"



    name = surname

    println(" name : "+name+surname)
    System.out.println(" size${name.length} : $name$surname")

    println(" this cost 10\$")

    val myDouble = 21.6
    println("is myDouble a Double? ${myDouble is Double}")
    println("myDouble is ? ${myDouble::class.qualifiedName}")

    val myInteger = myDouble.roundToInt()

    println("myInteger ? ${myInteger::class.qualifiedName}")

    //willnot work because Integer is from java
    //val anotherInteger:Integer = 17

    val anotherInteger:Int = 17
    println("anotherInteger ? ${anotherInteger::class.qualifiedName}")

    val myFloat : Float = 1.1f

    println(anotherInteger+myFloat)
//dont use new
    val bd: BigDecimal = BigDecimal(17)
    val bd2: BigDecimal
    //val is immutable
    bd2 = bd.add(BigDecimal(30))
    println("bd2 "+bd2)

}




