package it.chalmers.receiveit

import org.scalatra.test.specs2._

class MainServletSpec extends MutableScalatraSpec {

  addServlet(classOf[MainServlet], "/*")

  "GET on /" >> {
    "should return 404" >> {
      get("/") {
        status === 404
      }
    }
  }

}
