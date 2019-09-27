package com.erudika.para.client;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author qhuynh
 * Same as com/erudika/para/validation/Constraint.java
 */
public class Constraint {
	private Map<String, Object> payload;
	
    /**
     * The constraint name.
     * @return a name
     */
    public String getName() {
            return "";
    }

    /**
     * The payload (a map).
     * @return a map
     */
    public Map<String, Object> getPayload() {
            if (payload == null) {
                    payload = new LinkedHashMap<>();
            }
            return payload;
    }
}
