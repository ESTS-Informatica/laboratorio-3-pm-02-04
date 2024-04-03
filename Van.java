public class Van extends GroundTransportation {

  private int packages;

  public Van(int packages, String licensePlate) {
    super(licensePlate);
    this.packages = packages;
  }

  public int getPackages() {
    return this.packages;
  }

  public void setPackages(int packages) {
    this.packages = packages;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder(super.toString());

    sb.append(String.format("%15s: %d\n", "Número de Pacotes", getPackages()));

    return sb.toString();
  }
}
