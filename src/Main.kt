fun main() {
    val pila = Pila<String>()
    pila.lista.add("hola")
    pila.lista.add("quetal")
    pila.lista.add("adios")
    println(pila.top())
    pila.push("nada")
    pila.pop()
    pila.isEmpty()
    pila.lista.forEach { println(it) }

    val lisTal = listOf(1, 2, 3, 4, 5)
    val lisTalinve = reverse(lisTal)
    println("lisTal: $lisTal")
    println("lisTalinve: $lisTalinve")
}