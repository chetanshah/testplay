package controllers

import play.api.mvc._
import models.People
import models.Persons


class home extends Controller{
  def index = Action {
    val people = People.getAll
    val persons = Persons.getAll
    Ok(views.html.home(people,persons))
    
  }
  
}