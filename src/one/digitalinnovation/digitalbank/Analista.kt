package one.digitalinnovation.digitalbank

class Analista(
    salario: Double,
    nome: String,
    cpf: String
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1
}