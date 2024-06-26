public class GroundTransportation extends Transport {

  private String licensePlate;

  public GroundTransportation(String licensePlate) {
    super();
    this.licensePlate = licensePlate;
  }

  public GroundTransportation(String origin, String destination, double price, String licensePlate) {
    super();
    setValues(origin, destination, price);
    this.licensePlate = licensePlate;
  }

  public String getLicensePlate() {
    return this.licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  @Override
  public String getTransportType() {
    return "Transporte Terrestre"; 
  }

  @Override
  public double getFees() {
    // Override the base class method to set fees specific to GroundTransportation
    return 0.03; // 3% fee for GroundTransportation
  }
  
  @Override
  public double getPriceWithFees() {
    return super.getPriceWithFees() * (1.0 + 0.03); // 3% de honorários para transporte terrestre
  }
  
  @Override
public String toString() {
  final StringBuilder sb = new StringBuilder();
  sb.append("Tipo Transporte: ").append(getTransportType()).append("\n");
  sb.append("ID: ").append(getId()).append("\n");
  sb.append(String.format("%15s: %s\n", "Matrícula", getLicensePlate()));
  return sb.toString();
}

    
}
