package controllers
import models.PersonsForm
import play.api.mvc._
import play.api.data.Form._

class PersonsAdd extends Controller {
  def index=Action {
    
    Ok(views.html.personsForm(PersonsForm.personForm))
  }
 
  
}