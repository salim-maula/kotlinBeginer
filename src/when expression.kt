fun main() {
    /**
     * adalah salah satu percabangan dalam pemrograman kotlin
     * mirip dengan svich case
     * When Expression (svich case) + Readline*/

    /*aplikasi tebak tebakan umur*/

    println("saya sekolah di sd negri indonesia kelas 5 tebak umur saya 10 tahun kedepan")
    val jawaban = readLine()!!.toInt()

//  umur 23

    when(jawaban){
        18 -> print("anda salah menebak umur")
        19 -> print("waduh kelebihan kangg")
        20 -> print("kurang sangat amat dikit kang")
        22 -> print("kurang sangat amat dikit sekali kang")
        23 -> print("yupp horee anda benar")

        else -> {
            print("jauh banget kang tebakannya")
        }
    }
}