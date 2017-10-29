import java.io.FileReader
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    var readFromFile = readFromFile()
    println(readFromFile)
    writeToFile(readFromFile)

}

fun writeToFile(readFromFile: String) {
    var fileWriter = FileWriter("src\\my.kt")
    try {
        fileWriter.write(readFromFile)
        fileWriter.close()
    } catch (e: Exception) {
    }
}

fun readFromFile():String{
    var str:String = ""
    var fileReader = FileReader("src\\HelloKotlin.kt")
    var char:Int=fileReader.read()
    while (char!=-1){
        str+=char.toChar()
        char=fileReader.read()
    }
    return str
}