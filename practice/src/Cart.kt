fun main() {
    val productType = readLine()!!
    val price = readLine()!!
    val product = Product(price.toInt(), productType)
    println(totalPrice(product))
}

fun totalPrice(product: Product) = product.price + product.price * getTax(product.productType)/100
enum class ProdType(val typeName: String, val tax: Int){
    Headphones("headphones", 11)
    ,Smartphone("smartphone", 15)
    ,Tv ("tv", 17)
    ,Laptop("laptop",19);

}
fun getTax(type: String): Int{
    for (enum in ProdType.values())
        if (type == enum.typeName) return enum.tax
    return 1
}


class Product(val price: Int, val productType: String )