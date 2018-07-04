package com.bdir.back.app

import org.scalatra._

class BdirServlet extends ScalatraServlet {

  get("/") {
    "Hello world"
  }

}
