package controllers

import play.api.mvc._
import models.Persons


class PersonsView extends Controller{
  def index = Action {
    
    Ok(views.html.address(Persons.getAll))
  }
  }