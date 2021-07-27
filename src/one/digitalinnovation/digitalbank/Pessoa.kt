package one.digitalinnovation.digitalbank

class Pessoa {


    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    var darlei = Pessoa()

    println(darlei.nome)
    println(darlei.pessoaInfo())
}