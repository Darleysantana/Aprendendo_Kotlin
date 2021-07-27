package one.digitalinnovation.digitalbank

class Pessoa {
    var nome:String = "Darlei"
    var cpf:String = "123.123.123-11"

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    var darlei = Pessoa()

    println(darlei.nome)
    println(darlei.pessoaInfo())
}