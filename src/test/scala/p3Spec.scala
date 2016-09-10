import org.scalatest._

class p3Spec extends FlatSpec with Matchers {

    "An list containing 1,2,3" should "have 2 as theelement when n = 1" in {
        val kth = p3.kthElement(1, List(1,2,3))
        kth shouldEqual 2
    }
}
