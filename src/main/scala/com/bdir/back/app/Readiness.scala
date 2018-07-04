package com.bdir.back.app

import org.scalatra.ScalatraServlet

class Readiness extends ScalatraServlet {
  get("/") {
    s"""{status: 'ok'}"""
  }
}
