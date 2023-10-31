
interface MyInterface{

    fun dsiplayMessage()
    fun getUserData()
}


class InterfaceDemo : MyInterface{
    override fun dsiplayMessage() {

        println("I am overriden Method of Interface")
    }

    override fun getUserData() {
        println("I am overriden Method of Interface")
    }


}