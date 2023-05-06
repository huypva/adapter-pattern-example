package io.github.huypva.adapterpattern;

import lombok.AllArgsConstructor;

/**
 * @author huypva
 */
@AllArgsConstructor
public class Adapter implements NewFunction {
    private Service service;

    public void method(String data) {
        LegacyObject legacyObject = new LegacyObject(data);
        service.method(legacyObject);
    }

}
