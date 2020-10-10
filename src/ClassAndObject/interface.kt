package ClassAndObject

//Interface classes = classes that have methode without bodies
interface  InputHandler{

    fun clicked()
    fun doublClick()
    fun singleCliick()

}

class Phone: InputHandler {


    override fun singleCliick() {

    }

    override fun clicked() {
        println("Phone Clicked")
    }

    override fun doublClick() {
        TODO("Not yet implemented")
    }
}



class Button: InputHandler {
    override fun doublClick() {
        println("double click")
    }

    override fun singleCliick() {
        println("single Click")
    }

    override fun clicked() {
        println("Button Clicked")
    }
}

class text: InputHandler{
    override fun clicked() {
        TODO("Not yet implemented")
    }

    override fun doublClick() {
        TODO("Not yet implemented")
    }

    override fun singleCliick() {
        TODO("Not yet implemented")
    }

}

fun main(args: Array<String>) {
    var myButton = Button()
    myButton.clicked()
    myButton.doublClick()

    var phone = Phone()
    phone.clicked()
}