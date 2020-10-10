package IO_Kotlin

import java.io.FileReader
import java.io.FileWriter

fun main() {
    menu()
}

fun menu() {
    println("Enter: ")
    println("1- Write")
    println("2- Write")
    println("3- Write")

    var choice = readLine()!!.toInt()
    var message: String?

    when(choice) {
        1 -> {
            println("Enter message")
            message = readLine().toString()
            writerToFile(message)
        }

        2 -> {
            println("reading...")
            readfromFile()

        }

        3 -> println("Exiting...")
    }
}

fun writeTo

fun readfromFile() {
    val reader = FileReader("Appreader.txt")
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())

        } while (char != -1)

    }catch (ex:Exception){
        print(ex.message)
    }
}