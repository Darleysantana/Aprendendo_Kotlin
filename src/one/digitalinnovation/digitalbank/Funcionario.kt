package one.digitalinnovation.digitalbank

import Pessoa

abstract class Funcionario(
        nome: String,
        cpf: String,
        val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double
}