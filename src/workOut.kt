import java.io.FileReader
import java.io.FileWriter
import java.util.function.Consumer

fun main(args: Array<String>) {
    while (true) {
        var cat: Cat = Cat("mimi", color = "white")
        write(cat.makeNoise())
        println(read())
    }
}
abstract class Animal{
    var name:String;var numberOfLegs:Int;var power:Double
    constructor(name: String, numberOfLegs: Int, power: Double) {
        this.name = name
        this.numberOfLegs = numberOfLegs
        this.power = power
    }
    abstract fun makeNoise():String
}
public class Cat(name: String, numberOfLegs: Int=4, power: Double=0.0,var color:String) : Animal(name, numberOfLegs, power) {
    override fun makeNoise():String {
        return "Meaw I'm a $color cat "
    }
}
public fun write(message:String){
    var writer= FileWriter("src/my.txt",true)
    writer.write(message+"\n")
    writer.close()
}
public fun read():String{
    var reader= FileReader("src/my.txt")
    var result:String = ""
    for (line in reader.buffered().lines()) {
        result+=line+"\n"
    }
    return result
}