sealed class Color {

    class Red : Color()
    class Green : Color()
    class Blue : Color()

    class Alpha : Color()
}

fun eval(c: Color) =
    when (c) {
        is Color.Red -> println("Red Color")
        is Color.Green -> println("Green Color")
        is Color.Blue -> println("Blue Color")
        is Color.Alpha -> println("Alpha Color")
        //else -> println("Your Color")
    }


fun main(){

    val r = Color.Alpha()
    eval(r)
}