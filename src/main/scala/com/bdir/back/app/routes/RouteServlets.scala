package com.bdir.back.app.routes

import com.bdir.back.app.{BdirServlet, Readiness}
import org.scalatra.ScalatraServlet

trait RouteServlets {
  def routes: List[(String, ScalatraServlet)] = {
    List(
      "/" -> new BdirServlet,
      "/_health/liveness" -> new Readiness
    )
  }
}
