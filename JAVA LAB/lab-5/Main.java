

  public  void sleep() {
    System.out.println("Zzz");
  }


class Pig extends Animal {
  public void animalSound() {
   
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    abstract void animalSound();
    Pig myPig = new Pig(); 
    myPig.animalSound();
    myPig.sleep();
  }
}
