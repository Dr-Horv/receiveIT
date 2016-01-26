package it.chalmers.receiveit

import org.scalatra._

class MainServlet extends ScalatraServlet {

  get("/") {
    NotFound("")
  }

}
