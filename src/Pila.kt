class Pila<T> {
    val lista = mutableListOf<T>()


    fun top(): T? {
        return if (lista.isNotEmpty()){
            lista[lista.size - 1]
        }else{
            null
        }
    }

    fun push(cosa:T){
        lista.add(cosa)
    }

    fun pop(): T? {
        return if (lista.isNotEmpty()) {
            val aDevolver = lista[lista.size - 1]
            lista.remove(lista[lista.size - 1])
            return aDevolver
        } else{
            null
        }

    }

    fun isEmpty(): Boolean {
        return lista.isEmpty()
    }
}

fun <T>reverse(lista: List<T>):List<T>{

    val loDeIterar = lista.iterator()
    val aDevolver = lista.toMutableList()

    var aRestarPosicion = lista.size - 1
    while (loDeIterar.hasNext()){
        aDevolver[aRestarPosicion] = loDeIterar.next()
        aRestarPosicion--
    }
    return aDevolver
}