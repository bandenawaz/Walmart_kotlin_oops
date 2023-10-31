data class StudentDataCLass(val name: String, val age: Int)

/*
Task:
1. Check whether two students are equal or not
2. Generate HashCode for 3 students
 */

fun main() {

    val std1 = StudentDataCLass("Mandar", 29)
    val std2 = StudentDataCLass("MandaR", 29)
    val std3 = StudentDataCLass("Chris", 38)

    //1.
    if (std1.equals(std2)){

        println("Both students are equal")
    } else{
        println("These are different students")
    }

    //2.
    println("Hashcode of STD1: ${std1.hashCode()}")
    println("Hashcode of STD2: ${std2.hashCode()}")
    println("Hashcode of STD3: ${std3.hashCode()}")

}