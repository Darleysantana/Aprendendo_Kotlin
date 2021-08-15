package one.digitalinnovation.digitalbank.one.digitalinnovation.digitalbank

import java.math.BigDecimal


abstract class Conta(
    open val agencia: String,
    val numerodaconta: String,
    val sold: BigDecimal = TODO()
)
    fun deposit(valor:BigDecimal){

    }
    fun saque(valor:BigDecimal) {}
