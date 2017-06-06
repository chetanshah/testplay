package models
import java.sql._
import play.api.Play.current
import scala.collection.mutable.ListBuffer

case class Persons(id: Int, name: String, age: Int, sex: String) {

}

object Persons {

  val url = "jdbc:postgresql://localhost:5432/playtest"
  val driver = "org.postgresql.Driver"
  val username = "chats"
  val password = "chats"

  var connection = DriverManager.getConnection(url, username, password)
  val rs = connection.createStatement.executeQuery("SELECT age,name,sex,id FROM people")

  
    val lb = new ListBuffer[Persons]
    while (rs.next)
      lb += (Persons(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("sex")))
  
   connection.close
   def getAll: List[Persons] = lb.toList

}
