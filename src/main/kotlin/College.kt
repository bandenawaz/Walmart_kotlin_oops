class College(name: String, id: String): StudentAbstractClass(name, id) {
    override fun getMessage(message: String) {

        println("The message is ${message}")
    }
}