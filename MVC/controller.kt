sealed class CommandProcessing {    //создание сиалед класса, в который передаем команды 
    object ReturnModeList : CommandProcessing()
    object ReturnFirstItem : CommandProcessing()
    object ReturnFirstItem_2 : CommandProcessing()
}
    class Controller{     //создаем класс контроллер 
        private val model=Model()         //создаем объект модул
        fun doAction(command:CommandProcessing):String{      //передаем выше описанные команды 
        return when(command){      // с помощью вен смотрим какая команда введена и передает действие во вью
            is CommandProcessing.ReturnModeList->{
                model.getMutableList().toString()
            }
            is CommandProcessing.ReturnFirstItem->{
                model.getFirstElement()
            }
            is CommandProcessing.ReturnFirstItem_2->{
                model.getFirstElement_2()
            }
        }
    }
}