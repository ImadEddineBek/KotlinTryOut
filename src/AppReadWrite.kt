fun main(args: Array<String>) {
    var response:Int = 0
    while (response!=3){
        println("type 1 for reading from a file ")
        println("type 2 for writing to a file ")
        println("type 3 to exit ")
        when(response){
            1->{
                println(readFromFile())}
            2->{
                var readFromFile = readLine()!!
                writeToFile(readFromFile)}
        }
        response = readLine()!!.toInt()
    }
}
