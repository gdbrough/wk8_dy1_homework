import db.DBHelper;
import models.Motorcycle;
import models.Person;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Person person1 = new Person("Graeme", "Brough");
        DBHelper.save(person1);

        Motorcycle motorcycle1 = new Motorcycle("Ducati", "Diavel", person1);
        DBHelper.save(motorcycle1);

        Motorcycle motorcycle2 = new Motorcycle("Ducati", "Monster", person1);
        DBHelper.save(motorcycle2);

        List<Motorcycle> motorcycles = DBHelper.getAll("Motorcycle");

        List<Person> people = DBHelper.getAll("Person");

        Motorcycle motorcycle3 = new Motorcycle("Yamaha", "Streetfighter", person1);
        DBHelper.save(motorcycle3);
        motorcycle3.setMake("Ducati");
        DBHelper.update(motorcycle3);

        List<Motorcycle> moreMotorcycles = DBHelper.getAll("Motorcycle");

        DBHelper.delete(motorcycle3);

        List<Motorcycle> lessMotorcycles = DBHelper.getAll("Motorcycle");

        Person person2 = new Person("Davie", "Shanks");
        DBHelper.save(person2);

        Motorcycle motorcycle4 = new Motorcycle("Yamaha", "Dragstar", person2);
        DBHelper.save(motorcycle4);

        List<Motorcycle> MotorcylesOfPerson1 = DBHelper.getMotorcycles(person1.getId());

        List<Person> People = DBHelper.getAll("Person");

    }

}
