abstract class Duck {
  var flyBehavior:FlyBehavior
  var quackBehavior:QuackBehavior
  def Duck(){
  }

  def display() // Scala'da eğer abstract bir classın içinde tanımı yapılmamış bir method varsa o method da abstract olur.
  // ( Javada abstract classın methodları, 'abstract' keywordü ile soyutlanır. )
  def performFly() {
    flyBehavior.fly()
  }
  def performQuack() {
    quackBehavior.quack()
  }
  def swim() {
    System.out.println("All ducks float, even decoys!");
  }
  def setFlyBehavior(fb : FlyBehavior): Unit ={

    flyBehavior=fb

  }
  def setQuackBehavior(qb : QuackBehavior): Unit ={

    quackBehavior=qb

  }


}