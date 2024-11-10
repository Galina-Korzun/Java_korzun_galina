package lesson4;

public class Main {
    public static void main(String[] arg){

        Employee freshEmployee = new Employee("Cernova", "Inna", "Nikitina", "cernova@gmail.com",89142567138L, 355000, 40);
        freshEmployee.getEmployee();

        Park park = new Park("Центральный парк");

        Park.Attraction attraction1 = park.new Attraction("Автодром", "10:00 - 19:00", 7);
        Park.Attraction attraction2 = park.new Attraction("Микс", "11:00 - 21:00", 12);
        Park.Attraction attraction3 = park.new Attraction("Супер восемь", "13:00 - 23:00", 20);

        attraction1.getAttractionInfo();
        attraction2.getAttractionInfo();
        attraction3.getAttractionInfo();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Cernova Inna", "Logistician", "cernova@gmail.com", "89142567138", 355000, 40);
        persArray[1] = new Person("Rysova Irina", "Doctor", "rysac12@gmail.com", "89235613452", 25000, 25);
        persArray[2] = new Person("Bogdanov Artyr", "Astronaut", "artyrbog@gmail.com", "+375(29)47823056", 320000, 30);
        persArray[3] = new Person("Misochenko Darya", "Programmer", "misochenko@gmail.com", "+375(33)7700521", 170000, 28);
        persArray[4] = new Person("Ignatyev Vladislav", "Driver", "ignatvlad@gmail.com", "+375(33)5421023", 100000, 33);
        for (Person perArr : persArray) {
            perArr.getPerson();
        }

    }
}
