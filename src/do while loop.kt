fun main() {
    /**
     * do while loop
     * akan melakukan minimal 1 kali tindakan walaupun ia tidak masuk kondisi
     * */
    var perhitungan = 4

    do {
        println("perhitungan......$perhitungan")

        perhitungan -- //pengurangan -1 pada value pada variable dalam perhitungan
    } while (perhitungan >= 5)
    println("$perhitungan nilai hitung  out of range")
}