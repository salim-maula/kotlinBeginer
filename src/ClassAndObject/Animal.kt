package ClassAndObject

/**
 * membuat animal class dan class kucing yang merupakan inheritance dari animal,
 * membuat object dari kelas yang telah dibuat
 * */

/**
 * membuat class animal dengan hak akses open
 * */
open class Animal(){
//    deklarasi variable
    var name:String? = null
    var color:String? = null
    var jumlahKaki:Int? = null

//    membuat konsstruktur
    constructor(name:String, color:String, jumlahKaki:Int):this(){
    this.color = color
    this.name = name
    this.jumlahKaki = jumlahKaki

    //hanya print object saja
    println("object"+ this.jumlahKaki)
    println("object"+ this.color)
    println("object"+ this.name)
}

}

/**
 * melakukan inheritance atau pewarisan sifat animal kepada kucing
 * */

class Kucing():Animal() {

}

fun main() {
    var animal = Animal("ayam", "ijo", 20)// pembuatan object
    println("${animal.jumlahKaki}")
    var kucing = Kucing() // pembuatan object kucing dari klass kucing
    kucing.jumlahKaki= 7
    print("${kucing.jumlahKaki}")
}