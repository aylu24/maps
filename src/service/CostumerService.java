package service;

import domain.Costumer;

import java.util.Map;

public class CostumerService {
    public static Costumer getCustomerByKey(Map<String, Costumer> customers, String key) {
        for (Map.Entry<String, Costumer> customersAux: customers.entrySet()) {
            if (customersAux.getKey().equals(key)) {
                return customersAux.getValue();
            }
        }
        return null;
    }
}
