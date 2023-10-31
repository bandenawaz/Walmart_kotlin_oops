class DemoClass {

    //data members
    private var number: Int = 8

    //member function
    fun calcSquare(): Int {
        return number*number
    }
}

fun main(args: Array<String>) {

    val demo = DemoClass()
    println(demo.calcSquare())
}

