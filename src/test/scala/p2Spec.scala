import org.scalatest._

class p2Spec extends FlatSpec with Matchers {

    "An list containing 1,2,3" should "have 2 as the second to last element" in {
        val pen = p2.penultimate(List(1,2,3))
        pen shouldEqual 2
    }
}
