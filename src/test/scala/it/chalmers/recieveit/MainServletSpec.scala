package it.chalmers.recieveit

import org.scalatra.test.specs2._

class MainServletSpec extends MutableScalatraSpec {

  addServlet(classOf[MainServlet], "/*")

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

  "GET on /saser" >> {
    "should return 200" >> {
      get("/saser") {
        status === 200
      }
    }

    "should return \"Hello, saser!\"" >> {
      get("/saser") {
        response.body === "Hello, saser!"
      }
    }
  }
}
