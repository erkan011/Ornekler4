package org.example

fun main() {

    val person = Person()
    person.name = "Erkan"
    person.incrementAge()
    println("${person.name} is ${person.age} years old.")
}

class Person{
    var name=""
    private var _age:Int=0
    var age:Int
        get() = _age
        private set(value){

            _age=value

        }
    fun incrementAge(){
        age++
    }

}