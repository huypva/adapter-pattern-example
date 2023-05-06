package io.github.huypva.adapterpattern;

import lombok.AllArgsConstructor;

/**
 * @author huypva
 */
@AllArgsConstructor
public class ExistingClient {

    NewFunction newFunction;
    
    public void method(String data) {
        newFunction.method(data);
    }
}
