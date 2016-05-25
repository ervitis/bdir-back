import bdir.controllers.HelloWorldController
import org.scalatest.FunSuiteLike
import org.scalatra.test.scalatest.ScalatraSuite

class HelloWorldControllerTest extends ScalatraSuite with FunSuiteLike {
  addServlet(classOf[HelloWorldController], "/*")

  test("get name") {
    get("/hello") {
      status should equal(200)

      body should include("Hello hello")
    }
  }

  test("home page") {
    get("/") {
      status should equal(200)

      body should include("Hello world")
    }
  }

  test("post send") {
    post("/send", Map("name" -> "hello")) {
      status should equal(200)
    }
  }

  test("post unkown param should return code 200") {
    post("/send", Map("n" -> "unkown")) {
      status should equal(200)
    }
  }
}
