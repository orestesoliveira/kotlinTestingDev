fun main() {

    val customer = Customer()
    println(customer.name)
}

class Customer {
    val name:String = "Orestes"
    var age:Int = 21

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }
}

private class Customer2(val name:String, var age:Int){

}