class RubberDuck extends Duck {
  override def display(): Unit = {
    println("Rubber Duck")
  }

  override var flyBehavior: FlyBehavior = new FlyNoWay
  override var quackBehavior: QuackBehavior = new Squeak

}
