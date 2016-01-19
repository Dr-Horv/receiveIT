package it.chalmers.recieveit

import org.scalatra.test.specs2._

class MainServletSpec extends MutableScalatraSpec {

  addServlet(classOf[MainServlet], "/*")

  "GET on /" >> {
    "should return 200" >> {
      status === 200
    }
  }
}
