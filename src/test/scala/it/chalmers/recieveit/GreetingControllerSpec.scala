package it.chalmers.receiveit

import org.scalatra.test.specs2._

class GreetingControllerSpec extends MutableScalatraSpec {

  addServlet(classOf[GreetingController], "/greeting/*")

  "GET on /greeting" >> {
    "should return 200" >> {
      get("/greeting") {
        status === 200
      }
    }

    "should return \"Hello, World!\"" >> {
      get("/greeting") {
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