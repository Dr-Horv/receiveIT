package it.chalmers.recieveit

import org.scalatra._

class GreetingController extends ScalatraServlet {

  get("/:name") {
    val name = params("name")
    Ok(s"Hello, $name!")
  }

}
