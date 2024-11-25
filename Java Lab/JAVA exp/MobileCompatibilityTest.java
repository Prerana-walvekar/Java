import java.util.ArrayList;
import java.util.List;

class Mobile {
    private String model;
    private String operatingSystem;
    private List<String> supportedNetworks;

    
    public Mobile(String model, String operatingSystem) {
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.supportedNetworks = new ArrayList<>();
    }

    public void addNetwork(String network) {
        supportedNetworks.add(network);
    }

    public boolean isCompatible(String network) {
        return supportedNetworks.contains(network);
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", OS: " + operatingSystem + ", Networks: " + supportedNetworks);
    }
}

public class MobileCompatibilityTest {
    public static void main(String[] args) {
	
        Mobile mobile1 = new Mobile("Model A", "Android");
        mobile1.addNetwork("4G");
        mobile1.addNetwork("5G");

        Mobile mobile2 = new Mobile("Model B", "iOS");
        mobile2.addNetwork("4G");

        mobile1.displayInfo();
        mobile2.displayInfo();

        System.out.println("Is Model A compatible with 5G? " + mobile1.isCompatible("5G"));
        System.out.println("Is Model B compatible with 5G? " + mobile2.isCompatible("5G"));
    }
}
