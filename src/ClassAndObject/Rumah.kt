package ClassAndObject

/**
 * membuat sebuah klass rumah dengan beberapa parameter*/

class Rumah(var tipe :String, val harga:Double, val tahunPembangunan :Int, var pemilik:String){
    /**
     * melakukan inisialisasi class rumah
     * */
    init {
        this.tipe
        this.harga
        this.tahunPembangunan
        this.pemilik
    }

    /**
     * getters and setters adalah sebuah optional pada kotlin tidak seperti java
     * membuat seters dan getters adalah badd programing pada kotlin
     * kotlin selalu menginginkan kita untuk selalu menggunakan properties untuk mengakses dan set class*/
}

fun main() {
    /**
     * membuat sebuah object Rumah
     * */
    val rumah = Rumah("Mewah", 2000000000.0, 2000, "salim Maula")

    //mencetak sebuah object rumah
    print("rumah ${rumah.pemilik} tahun pembangunan ${rumah.tahunPembangunan} tipe ${rumah.tipe}")
}