import java.util.ArrayList;
import java.util.List;

public class Dentist {

    private String nameDentist;
    private int examYear;
    private boolean isGentle;
    private float personalNumberDentist;
    private List<Customer> customers = new ArrayList<>();

    private int numberOfCustomers;

    private boolean negativ;

    public Dentist() {

    }

    public Dentist(String nameDentist, int examYear, boolean isGentle, float personalNumberDentist) {
        this.nameDentist = nameDentist;
        this.examYear = examYear;
        this.isGentle = isGentle;
        this.personalNumberDentist = personalNumberDentist;
    }

    public String getNameDentist() {
        return nameDentist;
    }

    public void setNameDentist(String nameDentist) {
        this.nameDentist = nameDentist;
    }

    public int getExamYear() {
        return examYear;
    }

    public void setExamYear(int examYear) {
        this.examYear = examYear;
    }

    public boolean getIsGentle() {
        return isGentle;
    }

    public void setIsGentle(boolean isGentle) {
        this.isGentle = isGentle;
    }

    public void setPersonalNumberDentist(float personalNumberDentist) {
        this.personalNumberDentist = personalNumberDentist;
    }


    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }


    @Override
    public String toString() {
        return "Dentist{" +
                "nameDentist='" + nameDentist + '\'' +
                ", examYear=" + examYear +
                ", isGentle=" + isGentle +
                '}';
    }


    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Ny kund tillagd");
    }

    public int numberOfCustomers(){
        numberOfCustomers=customers.size();
        return numberOfCustomers;
    }

    public int numberOfCustomers(boolean negativ){
        numberOfCustomers=customers.size();
        if (negativ){
            return -numberOfCustomers;
        }
        return numberOfCustomers;
    }
}
