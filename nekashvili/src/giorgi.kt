fun main() {
    val z = Transport.MARSHUTKA.moculoba
    val y = Transport.MARSHUTKA.fasi
    val x = Transport.MARSHUTKA.modzraoba
    print("ამ ტრანსპორტში ეტევა $z ადამიანი, ფასია $y ლარი და მოძრაობს $x")
}
enum class Transport(val fasi: Float,val modzraoba:String,val moculoba: Int) {
    

    AVTOBUSI(0.20F,"ნელა",52),
    MARSHUTKA(0.8F,"საშუალო",25),
    METRO(0.2F,"ძალიან სწრაფი",300),
    SHMAXI(5F,"სწრაფი",4),
    SABAGIRO(3F,"საშუალო",7)
}


