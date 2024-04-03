public class Lorry extends GroundTransportation {

  private int numberOfPallets;
  private int trailers;

  public Lorry(int numberOfPallets, int trailers, String licensePlate) {
    super(licensePlate);
    this.numberOfPallets = numberOfPallets;
    this.trailers = trailers;
  }

  public int getNumberOfPallets() {
    return this.numberOfPallets;
  }

  public void setNumberOfPallets(int numberOfPallets) {
    this.numberOfPallets = numberOfPallets;
  }

  public int getTrailers() {
    return this.trailers;
  }

  public void setTrailers(int trailers) {
    this.trailers = trailers;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder(super.toString());

    sb.append(String.format("%15s: %d\n", "Número de Paletes", getNumberOfPallets()));
    sb.append(String.format("%15s: %d\n", "Número de Atrelados", getTrailers()));

    return sb.toString();
  }
}
