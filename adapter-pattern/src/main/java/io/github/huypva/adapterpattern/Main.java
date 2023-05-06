package io.github.huypva.adapterpattern;

import javax.xml.crypto.Data;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    String data = "Jack";
    LegacyService service = new LegacyService();

    Adapter adapter = new Adapter(service);
    
    ExistingClient client = new ExistingClient(adapter);
    client.method(data);
  }
}
