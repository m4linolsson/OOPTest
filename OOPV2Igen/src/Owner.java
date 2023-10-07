import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Owner extends Technology{

    String name;
    int age;

List<Technology> prylar=new ArrayList<>();



    public Owner(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public List<Technology> getPrylar() {
        return prylar;
    }

    public void setPrylar(List<Technology> prylar) {
        this.prylar = prylar;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", prylar=" + prylar +
                '}';
    }
}
