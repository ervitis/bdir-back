package com.bdir.back.app.pages

import org.scalatra.scalate.ScalateSupport

trait NotFound extends ScalateSupport {
  notFound {
    response.setContentType("JSON")
    response.setStatus(404)
  }
}
