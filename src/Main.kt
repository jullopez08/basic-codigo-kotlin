

// recibe una cadena de texto como parameter y usa el printIn
// para mostrar en consola y tiene un tipo de retorno unit lo que
// significa que no tiene valor
fun  printMessage(message: String){
    println(message)
}
//las fun pueden tener más de un parameter y asignar su valor po defecto
//y omitir el tipo de retorno y será unit, ya que es una respuesta
// por defecto
fun printMessageWithPrefix(message: String, prefix: String= "info"){
    println("[$prefix] $message")
}
//una fun puede haber operaciones y devolver numerous
// puede ser sin {}, ya que es un code corto
fun multiply(a: Int, b: Int) = a * b
fun sun(a: Int, b: Int) = a + b
// se puede declarar una variable y
// decir que pertenece a una clase y esa clase tiene la fun in fija
// likes para
// que sea clase debacle de iniciar co may's
val sophia = Person("sophia")
val claudia =Person("Claudia")
val merida = Person("Merida")

class Person(val name: String){
    val likenPeople = mutableListOf<Person>()
    infix fun likes(other: Person){likenPeople.add(other)}
}
// lo que hace esta fun es permitir las veces que se debe imprimir el string
infix fun Int.time(str: String) = str.repeat(this)
// esto eleva aún más las posibilidades de usar una function
// in fija, ya que con solo poner un operador hace magia!

operator fun Int.times(str: String)= str.repeat(this)
// permite en la definition de una variable se le puede dar la
// fun in fija y permite que devuelva un objeto
val pair = "Ferrari" to "Katrina"
infix fun String.onto(other: String) = Pair(this, other)
val myPair = "McLauren" onto "Lucas"
//al usar el methods get permite entrar a un
// elemento y buscan entre del rango para obtener un sub objeto
operator fun String.get(range: IntRange) = substring(range)
const val str = "Always forgive your enemies; nothing annoys them so much."
// el methods vararg permite pasar muchos arguments separados por comas
// y el in permite acortar palabras
fun printAll(vararg messages: String){
    for (m in messages) print(m)
}
//permite que tenga una palabra clave anes del mensaje
fun printAllWithPrefix(vararg messages: String, prefix: String){
    for (m in messages) println(prefix + m)
}
 //estos son elementos individuales y lo que hace es agruparlos como array
fun log(vararg entries: String){
    printAll(*entries)
}
// con nulos en ktn sirve cuando estamos interaction con code de java
// externa
fun describeString(maybeString: String?): String {
    return if (!maybeString.isNullOrEmpty()) {
        " String of length %{maybeString.length}"
    }else{
        "Empty or null string"
    }
}
val prueba = describeString("hola")
val prueba2 = describeString(null)
val prueba3 = describeString("")
// clases
// VAL ==> CONST VAR ==>LET
class Contact(val id: Int, val name: String, var email: String){
    //se pueden agregar methods que serían fun
    //methods que actualiza el email
    fun updateEmail(newEmail: String){
        email = newEmail
    }
    // methods que imprime la información de contacto
    fun printContact(){
        println("contacto id: $id, email: $email")
    }
}
val contact= Contact(1, "juan", "j@gm.j")
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    printMessage("Hello")
    //se puede reasignar un valor después de declarer por defecto
    // en cuanto sea del mismo tipo
    printMessageWithPrefix("Hello" )
    println(multiply(1, 2))
    println(sun(5,5))
    println(2 time "bye")
    println(3* " bye")
    println(pair)
    println(myPair)
    sophia likes merida
    sophia likes claudia
    println("${sophia.name} likes ${sophia.likenPeople.map { it.name }}")
    println(str[4..14])
    //permite llamar con cualquier numero de parameters
    printAll("hola", "algo ","porque si","porque no")
    printAllWithPrefix("hola ", "prueba ","de algo ", prefix = "greet: " )
    log("hola por acá ", "saludar tod ")
println(prueba)
    println(prueba2)
    println(prueba3)
    println(contact.id)
    contact.email ="janu@jmm.l"
    println(contact.email)
    contact.updateEmail("algo@hdm.jk")
contact.printContact()
    /** for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }*/
}
