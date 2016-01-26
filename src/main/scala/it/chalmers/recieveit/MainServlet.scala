package it.chalmers.receiveit

import org.scalatra._

class MainServlet extends ScalatraServlet {

  get("/") {
    Ok("Hello, World!")
  }

  get("/:name") {
    val name = params("name")
    Ok(s"Hello, $name!")
  }

}
