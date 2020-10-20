class ModelDuck extends Duck {
  override var flyBehavior: FlyBehavior = new FlyNoWay
  override var quackBehavior: QuackBehavior = new NormalQuack

  override def display(): Unit = {
    println("Model Duck")
  }
}
