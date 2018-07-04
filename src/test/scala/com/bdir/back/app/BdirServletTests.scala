package com.bdir.back.app

import org.scalatra.test.scalatest._

class BdirServletTests extends ScalatraFunSuite {

  addServlet(classOf[BdirServlet], "/*")

  test("GET / on BdirServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
