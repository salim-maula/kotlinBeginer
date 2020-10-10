fun main() {
    /**
     * Logika operator
     * And Or Not
     * &&  ||  !
     * || Itu bernilai salah jika keduanya bernilai salah , jika tidak ia bernilai benar
     * && (And) itu terjadi benar apabila kedua kondisi itu benar
     * ! kebalikan dari hasil kondisi
     * */

    var nomorpertama = 2
    val nomorkedua =3
    val nomorketiga = 5

//    if ((nomorkedua < nomorketiga) && (nomorpertama < nomorketiga )) {
//                     B                           B
//        print("kondisi bernilai benar")
//    }else (print("kondisi bernilai salah"))


    if ((nomorkedua > nomorketiga) || (nomorpertama > nomorketiga )) {
//            B                                    B
        print("kondisi bernilai benar")
    }else (print("kondisi bernilai salah"))
}