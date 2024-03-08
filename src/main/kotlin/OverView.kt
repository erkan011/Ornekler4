package org.example

open class AnaSinif {
    open fun selam() {
        println("Merhaba")
    }
}

class AltSinif : AnaSinif() {
    override fun selam() {
        println("Merhaba dünya!")
    }
}

fun main() {
    val altSinif = AltSinif()
    println("Alt Sınıf = $altSinif")
}
