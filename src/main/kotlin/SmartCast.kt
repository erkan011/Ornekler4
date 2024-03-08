package org.example

open class Animal
class Cat : Animal()
class Dog: Animal()
fun printSound(animal: Animal){ // printSound kullanma nedeni belli bir hayvan türünün sesini çıkarmak için kullanılır.

    if (animal is Cat) {
        println("Meow")
    }else if (animal is Dog){
        println("Woof")
    }
}
fun main() {
    val dog = Dog()
    val cat = Cat()
    printSound(cat)
    printSound(dog)
}

