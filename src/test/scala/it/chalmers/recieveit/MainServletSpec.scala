package it.chalmers.receiveit

import org.scalatra.test.specs2._

class MainServletSpec extends MutableScalatraSpec {

  addServlet(classOf[MainServlet], "/*")
  addServlet(classOf[GreetingController], "/greeting/*")

  "GET on /" >> {
    "should return 200" >> {
      get("/") {
        status === 200
      }
    }

    "should return \"Hello, World!\"" >> {
      get("/") {
        response.body === "Hello, World!"
      }
    }
  }

  "GET on /greeting/saser" >> {
    "should return 200" >> {
      get("/greeting/saser") {
        status === 200
      }
    }

    "should return \"Hello, saser!\"" >> {
      get("/greeting/saser") {
        response.body === "Hello, saser!"
      }
    }
  }
}
