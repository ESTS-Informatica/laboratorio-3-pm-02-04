import java.util.ArrayList;
import java.util.Objects;
import java.util.*;

public class ShippingCompany extends HashSet<Transport> {

  private String name;
  private ArrayList<Transport> inService;

  public ShippingCompany(String name) {
    super();
    this.name = name;
    this.inService = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Transport> getInService() {
    return inService;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();

    sb.append("Nome da Companhia: ").append(getName()).append("\n");
    sb.append("Transportes em Serviço:\n");
    for (Transport t : getInService()) {
      sb.append(t.toString()).append("\n");
    }

    return sb.toString();
  }

  // Método para buscar um transporte na coleção
  private Transport getTransportation(String id) {
    for (Transport t : this) {
      if (t.getId().equals(id)) {
        return t;
      }
    }
    return null;
  }

  // Método para colocar um transporte em serviço
  public void makeTransportation(String id, String origin, String destination, double price) {
    Transport t = getTransportation(id);
    if (t != null && t.isAvailable()) {
      t.setValues(origin, destination, price);
      t.setAvailable(false);
      inService.add(t);
      remove(t);
    }
  }

  // Método para finalizar um transporte em serviço
  public void finalizeTransportation(String id) {
    Transport t = getTransportation(id);
    if (t != null) {
      inService.remove(t);
      t.resetValues();
      add(t);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingCompany that = (ShippingCompany) o;
    return Objects.equals(name, that.name) && Objects.equals(inService, that.inService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inService);
  }
}
