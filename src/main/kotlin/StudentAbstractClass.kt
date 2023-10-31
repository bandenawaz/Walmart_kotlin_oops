abstract class StudentAbstractClass(name: String, id: String) {

    init {
        println("Student Name : $name")
        println("Student ID : $id")
    }

    //non-abstract method
    fun demo() {
        println("I am an non abstract method")
    }

    //abstract method
    abstract fun getMessage(message: String)
}