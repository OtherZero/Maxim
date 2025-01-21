package com.yourpackage;

public class Main {
    public static void main(String[] args) {
        // Создание репозитория
        Repository<Person> repository = new Repository<>();

        // Создание объектов Student и Teacher
        Student student1 = new Student("Alice", 20, "S123");
        Teacher teacher1 = new Teacher("Mr. Smith", 40, "Mathematics");

        // Добавление объектов в репозиторий
        repository.add(student1);
        repository.add(teacher1);

        // Вывод всех элементов
        System.out.println("Все элементы репозитория:");
        for (Person person : repository.getItems()) {
            System.out.println(person);
        }

        // Обновление элемента
        repository.update(0, new Student("Bob", 22, "S124"));

        // Удаление элемента
        repository.remove(teacher1);

        // Вывод обновленных элементов
        System.out.println("\nОбновленный репозиторий:");
        for (Person person : repository.getItems()) {
            System.out.println(person);
        }
    }
}
