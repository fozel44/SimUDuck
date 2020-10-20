class MallardDuck extends Duck {
  override def display(): Unit = {
    println("Mallard Duck")

  }

  override var flyBehavior: FlyBehavior = new FlyWithWings
  override var quackBehavior: QuackBehavior = new NormalQuack
}