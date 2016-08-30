import bdir.models.User
import org.scalatest.{FlatSpec, Matchers}

class TestModels extends FlatSpec with Matchers {
  "The user model" should "take password and name" in {
    intercept[IllegalArgumentException] {
      User("", "", "")
    }

    intercept[IllegalArgumentException] {
      User("", "hello", "")
    }

    intercept[IllegalArgumentException] {
      User("hello", "", "")
    }

    intercept[IllegalArgumentException] {
      User(null, null, null)
    }
  }
}
