package one.digitalinnovation.digitalbank

class Gerente (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), logavel {
    override fun calculoAuxilio(): Double = salario * 0.4
    override fun login(): Boolean = "123" == senha
}