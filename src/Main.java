import People.*;

public class Main {

  public static void main(String[] args) {
    Human human = new Human("Human");
    System.out.println(human);
    System.out.println(human.greet());
    Human man = new Man("John");
    System.out.println(man);
    System.out.println(man.greet());
    Human woman = new Woman("Jessi");
    System.out.println(woman);
    System.out.println(woman.greet());
  }
}
