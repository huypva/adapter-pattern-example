package io.github.huypva.adapterpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class LegacyService {

    public void method(LegacyObject legacyObject) {
        log.info("Data:" + legacyObject.getData());
    }
}
