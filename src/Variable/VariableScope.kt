package Variable

/**
 * variable sscope adalah cakupan sebuah variable akses
 * cakupan variable dibagi menjadi 2 yaitu global dan local
 * */

//deklarasi variable vertable.getName type Global
var Nama :String? = null

fun main(){
    var Ayam = "uhu dfaka"
    myName() //memanggil fungsi Variable.myName
}

fun myName(){
    Nama = "Salim Maula" //memberi nilai pada variable Variale.getNama
    print("Variable.getNama : $Nama") //cetak variable variable.get.Nama
}