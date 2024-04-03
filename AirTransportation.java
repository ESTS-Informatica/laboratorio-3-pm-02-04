public class AirTransportation extends Transport {

  private String name;
  private int numberOfContainers;

  public AirTransportation(String name, int numberOfContainers) {
    super();
    this.name = name;
    this.numberOfContainers = numberOfContainers;
  }

  public AirTransportation(String origin, String destination, double price, String name, int numberOfContainers) {
    super();
    setValues(origin, destination, price);
    this.name = name;
    this.numberOfContainers = numberOfContainers;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumberOfContainers() {
    return this.numberOfContainers; 
  }

  public void setNumberOfContainers(int numberOfContainers) {
    this.numberOfContainers = numberOfContainers;
  }

  @Override
  public String getTransportType() {
    return "Transporte Aéreo";
  }

  @Override
  public double getFees() {
    // Override the base class method to set fees specific to AirTransportation
    return 0.04; // 4% fee for AirTransportation
  }
}
