package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Oskar", "Pawłowicz");
        Task task1 = new Task("odkurzanie", "odkurzenie pierwszego piętra", -1, person2);
        Task task2 = new Task("robienie obiadu", "zrobienie dzisiejszego obiadu", 3, person1);
        Task task3 = new Task("sprzątnięcie ogródka", "zgrabienie liści, skoszenie trawy, podlanie kwiatów");
        Task task4 = new Task("mopowanie", "wymopowanie łazienki w pisnicy", 0);

        System.out.printf("%s%n%s%nPriorytet wysoki %b%nPriorytet normalny %b%nPriorytet niski %b%n%n",
                task1.getName(), task1.getInfo(), task1.highPriority(), task1.mediumPriority(), task1.lowPriority());
        System.out.printf("%s%n%s%nPriorytet wysoki %b%nPriorytet normalny %b%nPriorytet niski %b%n%n",
                task2.getName(), task2.getInfo(), task2.highPriority(), task2.mediumPriority(), task2.lowPriority());
        System.out.printf("%s%n%s%nPriorytet wysoki %b%nPriorytet normalny %b%nPriorytet niski %b%n%n",
                task3.getName(), task3.getInfo(), task3.highPriority(), task3.mediumPriority(), task3.lowPriority());
        System.out.printf("%s%n%s%nPriorytet wysoki %b%nPriorytet normalny %b%nPriorytet niski %b%n%n",
                task4.getName(), task4.getInfo(), task4.highPriority(), task4.mediumPriority(), task4.lowPriority());
        System.out.printf("Kto pracuje przy zadaniu %s:%n%s", task1.getName(), task1.getWorker().firstName);
    }
}
