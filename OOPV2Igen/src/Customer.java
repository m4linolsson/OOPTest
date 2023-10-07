public class Customer {

private String nameCustomer;
private int ageCustomer;
private boolean hasToothAche;


public Customer (){
}
public Customer (String nameCustomer, int ageCustomer, boolean hasToothAche){
    this.nameCustomer=nameCustomer;
    this.ageCustomer=ageCustomer;
    this.hasToothAche=hasToothAche;
}

public String getNameCustomer(){
    return nameCustomer;
}

public void setNameCustomer(String nameCustomer){
    this.nameCustomer=nameCustomer;
}

public int getAgeCustomer(){
    return ageCustomer;
}

public void setAgeCustomer(int ageCustomer){
    this.ageCustomer=ageCustomer;
}

public boolean getHasToothAche(){
    return hasToothAche;
}
public void setHasToothAche(boolean hasToothAche){
    this.hasToothAche=hasToothAche;
}

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", ageCustomer=" + ageCustomer +
                ", hasToothAche=" + hasToothAche +
                '}';
    }
}
