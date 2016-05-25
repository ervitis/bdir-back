package bdir.controllers

import org.scalatra.ScalatraServlet
import org.slf4j.LoggerFactory

class HelloWorldController extends ScalatraServlet {
  val logger = LoggerFactory.getLogger(getClass)

  get("/") {
    "Hello world"
  }

  get("/:name") {
    val name = params.getOrElse("name", "anonymous")
    "Hello " + name
  }

  post("/send") {
    val name = params.getOrElse("name", "noone")

    logger.info("Mi nombre es " + name)
  }
}
