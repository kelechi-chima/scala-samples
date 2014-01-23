package app;

import org.scalatest._

class AppTest extends FlatSpec {
  
  "An App" should "should be named correctly" in {
    val a = new app.App()
    a.setName("one")
    assert(a.getName() === "one")
  } 
}
