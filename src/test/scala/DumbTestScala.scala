
import org.scalatest._

class DumbTestScala extends FlatSpec {
  "dumb test for CI functionality" should "go well" in {
    assert(DumbObject.doSum(1, 3) === 4)
  }
}
