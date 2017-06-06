package models
import play.api.data._
import play.api.data.Forms._
import java.sql._

case class PersonsForm(id: Int, name: String, age: Int, sex: String)

object PersonsForm {
  val personForm = Form(mapping("id" -> number, "name" -> text, "age" -> number, "sex" -> text)(PersonsForm.apply)(PersonsForm.unapply))

  def submitPersons{
    val url = "jdbc:postgresql://localhost:5432/playtest"
    val driver = "org.postgresql.Driver"
    val username = "chats"
    val password = "chats"
    var connection = DriverManager.getConnection(url, username, password)
    val rs = connection.createStatement.executeQuery("INSERT INTO people VALUES 5, name,6,sex")
  }
}