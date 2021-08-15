package one.digitalinnovation.digitalbank

import one.digitalinnovation.digitalbank.TesteBanco.Clientetipo

class Cliente(nome: String, cpf: String, val clienteTipo: Clientetipo, val senha: String):Pessoa(nome, cpf), logavel{
    override fun login(): Boolean = "123456" == senha
    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Tipo: $clienteTipo
    """.trimIndent()
}