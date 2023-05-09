package People;

public class Woman extends Human {
//  Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".
//  Попытка вывести их на экран должна приводить к выводу строки
//  "Мужчина по имени ..." или "Женщина по имени ..."
//  Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"

  public Woman(String name) {
    super(name);
  }

  @Override
  public String greet() {
    return "I was born! (woman)";
  }
}
