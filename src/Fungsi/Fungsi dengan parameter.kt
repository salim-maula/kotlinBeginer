package Fungsi
/**
 * fungsi dibagi mejadi 3 yang pertama adaklah sebuah fungsi tanpa para meter, prosedur
 * */
fun main() {
    tambah( 3, 6)
    LuasSegitiga(5, 2)
}

fun tambah(nomor1:Int, nomor2:Int){
    val sum = nomor1 + nomor2
    println(sum)
}

//challenge membuat sebuah kode program menggunakan fungsi dengan parameter menghitung luas segitiga
fun LuasSegitiga(tinggi:Int, alas:Int){
    val hitungluas = tinggi*alas/2
    println("Luas Segitiga adalah alas $tinggi dikali $alas dibagi dua hasilnya $hitungluas")
}