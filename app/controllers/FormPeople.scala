package controllers

import play.api.mvc._
import play.api._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.Controller
import play.api.data.Field
import play.api.i18n.Messages.Implicits._
import play.api.Play.current
import views._

class FormPeople  extends Controller {
  
  val people_form = Form(
      "name" -> text
      )
  def index = Action {
    Ok(views.html.form_people(people_form))
       
  }
  def gotPerson = Action { implicit request =>
    people_form.bindFromRequest.fold(
         errors => BadRequest(views.html.errors(errors)),
        name => {
          Ok(views.html.gotPerson(name))
        }
  )
  }
  
}