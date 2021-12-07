class Model{   
    private val list= mutableListOf("Alex","Sergey","Pavel")   //создается список изменяемый
    fun getFirstElement():String{   //функция получения 1го элемента 
        return list.elementAt(0)
    }
    fun getFirstElement_2():String{      //функция получения 2го элемента 
        return list.elementAt(1)
    }
    fun getMutableList():MutableList<String>{      //возвращаем весь список
        return list
    }
}