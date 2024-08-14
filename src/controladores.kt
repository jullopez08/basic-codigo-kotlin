fun main() {
    identificaObjeto("pelota")
    identificaObjeto("34")
    val pelota =Juguete("pelota")
    val manzana = Fruta("manzana")
    val libro = "Libro"
    identificaObjeto(manzana)
    identificaObjeto(libro)
    identificaObjeto(pelota)
println(obtenerDescent("Hello"))
    println(obtenerDescent("Fruta"))
    println(obtenerDescent("verdura"))
    val papas = Comestibles("papas")
    val nevera = ProductElectric("nevera")
    println(obtenerDescent(papas))
    println(obtenerDescent(nevera))
//bucle
//for
    val cakes = listOf("carrot", "cheese","chocolate")

    for (cake in cakes) {
        println("yummy, it´s a $cake cake")
    }
//while y do-while
    var cakesEaten = 0
    var cakesBaked = 0
while (cakesEaten <5 ){
    eatACake()
    cakesEaten ++
}
    do {
        bakeACake()
        cakesBaked ++
    } while (cakesBaked < cakesEaten)
val zoo = Zoo(listOf(Animal("zebra"),Animal("lion")))
    for (animal in zoo) {
        println(" out, it´s a ${animal.name}")
    }
// El operador .. crea un rango que incluye el número en el que empieza hasta el que termina
    for (i in 1..5) {
        print(i)
    }
for (i in 7..9){
    print(i)
}
//el operador until crea un rango que va desde el que empieza hasta el que
// va
// sin incluir el que termina
    for (i in 0..<7){
        print("$i \n")
    }
    for (i in 5..<10){
        print(i)
    }
//el operador step recorre el rango de del número
// que empieza hasta que termina, pero este indica que se debe incrementar
// el valor en el que incrementa es decir, que esta 2 hasta 8, se incrementa en 2
    for (i in 2..8 step 2){
        print("$i \n")
    }
    for(i in 3..27 step 3){
        print(i)
    }
}
//switch --> when declarado a qui no se devuelve o almacena
// el resultado
fun identificaObjeto(obj: Any) {
    when (obj) {
        "pelota"  -> println("Esto es un juguete.jugar")
        34 -> println("Esto no es una fruta. guardar")
        is Juguete -> println("Esto es un juguete. jugar")
        !is Fruta -> println("Esto no es una fruta. guardar")
        else -> println("Unknown")
    }
}
 class Juguete(val name: String)
class Fruta(val name: String)
//when La expression -->Se utiliza para evaluar y devolver
// un valor.
fun obtenerDescent(item: Any): String {
    return when(item){
        "Fruta"-> "Descuento del 10% en fruta"
        "verdura" -> "Descuento del 5% en verdura"
        is ProductElectric -> "Descuento del 15% en productos electrics"
        !is Comestibles -> " No hay descuentos en los comestibles"
        else -> "Descuento general 5%"
    }
}
class ProductElectric(val name:  String)
class Comestibles(val name:  String)

fun eatACake() = println("Eat a cake")
fun bakeACake() = println("Bake a cake")

class Animal(val name: String)
class Zoo(private val animals: List<Animal>){
//iterator funciona como un for, mientras haya animales en el Zoo
    // sacar animales
    operator fun iterator(): Iterator<Animal> {
      return animals.iterator()
    }
}



// hola




























