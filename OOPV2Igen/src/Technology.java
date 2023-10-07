public abstract class Technology {
    private String manufacture;

    private String model;

    private int price;

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
