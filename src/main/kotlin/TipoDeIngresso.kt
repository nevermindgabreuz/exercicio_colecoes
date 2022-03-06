class TipoDeIngresso (
    val valorInteiro: Int = 30
        ){
    fun ingresso(): Int {
        return this.valorInteiro
    }
    fun estudante():Int{
        var desconto:Int
        desconto = (this.valorInteiro - (this.valorInteiro * 0.5)).toInt()
        return desconto
    }
    fun idoso(valorInteiro: Int):Int{
        var descontoIdoso:Int
        descontoIdoso = (this.valorInteiro - (valorInteiro * 0.5)).toInt()
        return descontoIdoso
    }
}

