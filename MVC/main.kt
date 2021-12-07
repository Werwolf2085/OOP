fun main() {
    val view = ViewS()   //создается объект класса вью
        println("GETLIST or GETFIRST or GETFIRST_2")      //сообщение о предлогаемых запросах
        val entered: String = readLine().toString()     //
        view.commandTransaction(entered)
}