class operacionesClase(var n1:Double,var n2:Double) {
    fun suma(){
        var res = n1+n2
        println("la suma es: $res")
    }

    fun division(): String {
        return "El cociente es ${n1/n2}"
    }

    fun mitad(x:Int){
        var producto = n1*n2
        var mitad = producto/x
        println("la mitad es: $mitad")
    }

    fun cuadrado(x: Double):String{
        return "El cuadrado de toda la suma es: ${Math.pow(((n1+n2)*x), 2.0)}"
    }

    override fun toString(): String {
        return "operacionesClase(n1=$n1, n2=$n2)"
    }

}