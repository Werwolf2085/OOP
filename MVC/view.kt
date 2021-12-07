import java.util.*

enum class Enum{GETLIST,GETFIRST,GETFIRST_2}   //класс возможных запросов
 interface View {      //создается интерфейс вью
    fun commandTransaction(command: String) {       //функция транзакции
    }
}
class ViewS:View{        //создается класс вью, который наследуется от интерфейса
    private val controller:Controller=Controller()  //создаем объект контроллер 
    override fun commandTransaction(command:String){   //переопределение функции
        when(command.trim().uppercase(Locale.getDefault())){     
            Enum.GETLIST.name->{       //смотрим команду которая была введена 
                println(controller.doAction(CommandProcessing.ReturnModeList))
            }    //вывод результатов после выполнения команды
            Enum.GETFIRST.name->{
                println(controller.doAction(CommandProcessing.ReturnFirstItem))
            }
            Enum.GETFIRST_2.name->{
                println(controller.doAction(CommandProcessing.ReturnFirstItem_2))
            }
        }
    }

}