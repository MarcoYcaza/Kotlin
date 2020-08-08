open class Principal(private val myWord : String){

   open fun communicate () {
        println(myWord)
    }

}

class Secondary(myWord2: String) : Principal (myWord2){

    override fun communicate() {
       super.communicate()
       println("Doing something else")
    }

}

fun main(){
   // val x : PRINCIPAL
    val obj1 = Principal("Hello World")
    obj1.communicate()

    val obj2 = Secondary("Hello Secondary")
    obj2.communicate()

}


