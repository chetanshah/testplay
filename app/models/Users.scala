package models
import slick.driver.PostgresDriver.api._
import slick.model.Column
import play.api.Play.current
import play.api.db.DB


class Users(tag: Tag) extends Table[(Int,String,Int,String)](tag,"users"){
 def id = column[Int]("id")
 def name =column[String]("name")
 def age = column[Int]("age")
 def sex = column[String]("sex")
 def * = (id,name,age,sex)
   
}
case class user( id:Int, name:String, age:Int, sex:String)
