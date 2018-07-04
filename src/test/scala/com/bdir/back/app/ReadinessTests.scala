package com.bdir.back.app

import org.scalatra.test.scalatest.ScalatraFunSuite

class ReadinessTests extends ScalatraFunSuite {
  addServlet(classOf[Readiness], "/_health/liveness")

  test("GET liveness") {
    get("/_health/livenessgit a") {
      status should equal (200)
      body should equal ("{status: 'ok'}")
    }
  }
}
