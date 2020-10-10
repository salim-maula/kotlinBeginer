package IO_Kotlin
/*
* import library and write file*/

import java.io.FileReader
import java.io.FileWriter

fun main() {
    println("Enter and message")
    val message = readLine().toString() //input keyboard menggunakan read line

    //memeriksa apakah user memasukan pesan atau tidak
    if (message == ""){
        println("Please enter a message")
    }else{
        writerToFile(message)
    }
    readFile()
}

fun readFile() {
    val reader = FileReader("message.txt")
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex: Exception){
        print(ex.message)
    }
}

/**
 * mebuat fungsi menulis to file dengan FileWriter
 * */

fun writerToFile (message: String) {
    try {
        val writer = FileWriter("message.txt", true)
        writer.write(message + "\n")
        writer.close()

    }catch (ex: Exception){
        println("Exception $ex")
    }
}