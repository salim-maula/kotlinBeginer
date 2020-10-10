package ClassAndObject

/**
 * pembuatan class and object dengan overloading konstruktor pada klass kendaraan
 * */

class Kendaraaan (){
//    set properties
    var nama :String?= null
    var roda :String?= null
    var sayap :Int?= null
    var warna :String?= null

    /*
    * membuat constructor dengan 4 parameter
    * */
    constructor(nama:String, roda:String, sayap:Int, warna:String):this(){
        this.nama = nama
        this.roda = roda
        this.sayap = sayap
        this.warna = warna

        println("object : "+ this.nama)
        println("object : "+ this.roda)
        println("object : "+ this.sayap)
        println("object : "+ this.warna)
    }

    /*
    * membuat constructur ke 3 dengan 3  parameter
    * */

    constructor (nama:String, warna:String, roda:String):this(){
        this.nama = nama
        this.roda = warna
        this.warna = roda

        println("object : "+ this.nama)
        println("object : "+ this.roda)
        println("object : "+ this.warna)
    }

    constructor (nama:String, warna:String, sayap:Int):this(){
        this.nama = nama
        this.warna = warna
        this.sayap = sayap

        println("object : "+ this.nama)
        println("object : "+ this.warna)
        println("object : "+ this.sayap)
    }

    /*
    * membuat konstruktur 5 dengan 2 parameter
    * */

    constructor (nama:String, warna:String):this(){
        this.nama = nama
        this.warna = warna

        println("object : "+ this.nama)
        println("object : "+ this.warna)
    }
}

fun main() {
    var becak = Kendaraaan("becak","hitam")

    var garudaAir = Kendaraaan("Becak", "hitam", "tiga")

    var roket = Kendaraaan ("roket", "putih", 2)


}