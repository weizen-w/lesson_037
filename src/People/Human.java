package People;

public class Human {
//  Создайте класс "Человек", конструктор которого принимает имя.
//  При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени ..."
//  Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"

  private String name;

  public Human(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String greet() {
    return "I was born!";
  }

  @Override
  public String toString() {
    return String.format("%s named %s", getClass().getSimpleName(), name);
  }
}
