fun main(args: Array<String>) {

    val demo = DemoClass()
    println(demo.calcSquare())

    val std = Student("Nan",36)
    val mandar = Student()
    val newStd = Student("Chris")
    println("Student Name: ${std.name} and Age is ${std.age}")
    println("Student Name: ${mandar.name} and Student Age: ${mandar.age}")
    println("Student Name: ${newStd.name} and Student Age: ${newStd.age}")

    //Secondary Constructor object
    val sco = SecondaryContructor("Walmart","walmart.com")

    //data class
    val dcObj = StudentDataCLass("Kiran", 42)
    println("Student Name: ${dcObj.name} and Student Age: ${dcObj.age}")

    //Object for college
    val clg= College("Salman","01SK13")
    clg.getMessage("I am an Actor")
    clg.demo()

    //Interface
    println("Interface Example")
    val inf = InterfaceDemo()
    inf.dsiplayMessage()
    inf.getUserData()
}