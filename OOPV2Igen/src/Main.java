import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Dentist dentist1 = new Dentist("Emma", 2014, true, 196001011234F);
        Dentist dentist2 = new Dentist("Lars", 2023, false, 199407261234F);

        Customer customer1 = new Customer("Lisa", 87, true);
        Customer customer2 = new Customer("Thomas", 12, true);
        Customer customer3 = new Customer("Thomas", 12, true);


        dentist1.getCustomers().add(customer1);
        dentist1.getCustomers().add(customer2);
        dentist1.getCustomers().add(customer3);


        for (int i = 0; i < dentist1.getCustomers().size(); i++) {
            System.out.println(dentist1.getCustomers().get(i).getNameCustomer());
        }

        System.out.println(dentist1.numberOfCustomers(true));

        System.out.println("--------------");


        Computure computure1 = new Computure();
        Tv tv1 = new Tv();
        Phone phone1 = new Phone();

        computure1.setManufacture("Asus");
        computure1.setModel("Asus sdfhi123msuper");
        computure1.setPrice(20000);

        tv1.setManufacture("Samsung");
        tv1.setModel("Samsung superdupermegamojäng");
        tv1.setPrice(50000);

        phone1.setManufacture("Apple");
        phone1.setModel("Iphone 597++++");
        phone1.setPrice(10);


        Owner owner1 = new Owner("Klas", 12);
        Owner owner2 = new Owner("Olle", 33);

        owner1.getPrylar().add(phone1);
        owner2.getPrylar().add(computure1);
        owner2.getPrylar().add(tv1);

        System.out.println(owner2);

        for (int i = 0; i < owner2.prylar.size(); i++) {
            System.out.println(owner2.prylar.get(i).getModel());
        }

        System.out.println("----------");


        Employee employee1 = new Employee("Kent", 53);
        Employee employee2 = new Employee("Roger", 5);

        //PracticeArchery.resultsFromPractice(employee1);

      //  PracticeArchery.resultsFromPracticeWhitGetterSetter(employee2);

        //System.out.println(PracticeArchery.resultsFromPracticeRandom(employee1));


        Random ran = new Random();
        int points = ran.nextInt(51)+50;

        int point = (int) points;
        System.out.println(points);
        //System.out.println(point);

        //28 det
    }


//• Skapa tre klasser som representerar olika teknikprylar. Ge prylarna attribut för tillverkare, modell
//och pris. Skriv ett program som hämtar valfri info om respektive pryl och skriver ut det på skärmen.
//• Bygg ut programmet med klassen Owner. Skapa en koppling till teknikprylarna så man vid utskrift
//ser vem som äger prylen, alternativt vilka prylar en ägare har.

//Följande regler gäller:
//Varje omgång består av 3 pilar. Varje träningspass består av 5 omgångar. Tavlans poäng är 1 – 10.
//Efter fem genomförda omgångar ska antal poäng och antal träffade pilar skrivas ut på skärmen.
//Skapa lämplig klass/klasser med attribut och metoder. Använd getters och setters för åtkomst till
//objekten.
//Bonus: Låt användaren mata in resultatet för varje pil.
//Dubbel Bonus: Slumpa fram resultatet av varje pil.
//Tips: Random random = new Random(); random.nextInt();
}




