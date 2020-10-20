object MiniDuckSimulator  {
  def main(args: Array[String]): Unit = {

     val mallard_duck = new MallardDuck
     mallard_duck.performQuack()
     mallard_duck.performFly()
     mallard_duck.swim()
     mallard_duck.setFlyBehavior(new FlyNoWay)
     mallard_duck.performFly()

    println("-------------------------")

    val model_duck=new ModelDuck
    model_duck.performQuack()
    model_duck.performFly()
    model_duck.swim()
    model_duck.setFlyBehavior(new FlyRocketPowered)
    model_duck.performFly()
  }
}
