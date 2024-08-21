fun main(){

    val listaOperaciones = mutableListOf<operacionesClase>()

    listaOperaciones.add(operacionesClase(21.32, 47.2))

    listaOperaciones.forEach { operacion ->
        val resultadoSuma = operacion.suma()
        val resltadoDivision = operacion.division()
        println(resltadoDivision)
        val resultadoMitad = operacion.mitad(50)
        val resultadoCuadrado = operacion.cuadrado(10.3)
        println(resultadoCuadrado)

    }
}