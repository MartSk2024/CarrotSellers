import java.time.LocalDate;

public class CarrotSeller {
    private String name;
    private LocalDate born;
    private int numberOfContracts;
    private double soldCarrots;
    private String addressOfSeller;
    private String vehicleRegisterPlate;
    private double vehicleConsumption;
//koment3
    public String getName() {
        return name;
    }
    public String getAddress() {
        return addressOfSeller;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String addressOfSeller) {
        this.addressOfSeller = addressOfSeller;
    }
}
