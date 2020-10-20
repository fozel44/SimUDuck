class RedHeadDuck extends Duck {
  override def display(): Unit = {
    println("Redhead Duck")
  }
  override var flyBehavior: FlyBehavior = new FlyWithWings
  override var quackBehavior: QuackBehavior = new NormalQuack
}
