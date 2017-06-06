package models

case class People (name:String, age:Int, sex:String)

object People { 
    def getAll = List(People("Chats",40,"M"), People("Sin",36,"F")) 
}
