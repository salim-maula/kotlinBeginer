package Fungsi

/**
 * fungsi dengan parameter dan return type
 * */

fun main() {
    println(Perkalian(3,4)) //memanggil fungsi perkalian dan mencetaknya
    val pembagian = Perkalian (13,2) / angkabagi(4) //memmberikan nilai variable
    println(pembagian)
    HelloWord() //memanggil fungsi helloword
    Nama()//memanggil fungsi nama
}

/*membuat fungsi perkalian dengan return type Integer*/
fun Perkalian(angkaPertama:Int, angkaKedua:Int):Int{
    val hasil = angkaKedua*angkaPertama
    return hasil
}

/*membuat fungsi pembagian dengan return type Integer*/
fun angkabagi(angka_bagi:Int):Int{
    return angka_bagi
}

/*Membuat fungsi helloword tanpa parameterdan tanpa pengembalian */
fun HelloWord(){
    print("bismillah hirahmanirrahim")
}

/*fungsi tanpa parameter dengan pengembalian*/
fun Nama():String{
    val nama = readLine()
    return nama.toString()
}