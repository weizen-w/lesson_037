package People;

public class People {
//  Создайте класс "Человек", конструктор которого принимает имя.
//  При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени ..."
//  Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"

  private final String name;

  public People(String name) {
    this.name = name;
  }

  public String greet() {
    return "Я родился!";
  }

  @Override
  public String toString() {
    return "Человек по имени " + name;
  }
}
