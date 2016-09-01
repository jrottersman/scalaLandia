import org.scalatest._

class p1Spec extends FlatSpec with Matchers {

    "An list containing 1,2,3" should "have 3 as the last element" in {
        val last = p1.lastSelf(List(1,2,3))
        last shouldEqual 3 
    }
}
