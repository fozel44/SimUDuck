class DecoyDuck extends Duck {
  override def display(): Unit = {
    println("Decoy Duck")
  }

  override var flyBehavior: FlyBehavior = new FlyNoWay
  override var quackBehavior: QuackBehavior = new MuteQuack
}
