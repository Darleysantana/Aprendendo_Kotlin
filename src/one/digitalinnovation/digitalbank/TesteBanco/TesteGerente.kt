package one.digitalinnovation.digitalbank
import one.digitalinnovation.digitalbank.TesteBanco.testeautenticacao

fun main() {
    val Maria = Gerente(nome = "Maria do carmo", cpf = "123.123.123-11", salario = 5000.0, senha = "123456")
    imprimeRelatorio.imprime(Maria)
    testeautenticacao().autentica(Maria)
}
