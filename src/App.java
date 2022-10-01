import domain.Costumer;
import domain.Persona;
import service.CostumerService;
import util.DniComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
       /* Map< Integer, String> entries = new HashMap<>();
        entries.put(0, "Valor 1");
        entries.put(1, "Valor 2");
        entries.put(2, "Valor 3");
        entries.put(1, "Valor 4");
        entries.put(0, "Valor 5");
        entries.put(null, "Valor nulo");
        entries.put(5, null);
        entries.put(null, null);
        entries.put(6, null);
        entries.put(0, "Nuevo valor");
        entries.put(0, "Valor definitivo para 0");

        System.out.println(entries);
        System.out.println("Número de entradas en el mapa: " + entries.size());
        System.out.println("Reemplazando: " + entries.replace(0, "Nuevo valor para cero"));
        System.out.println("Reemplazando con valor anterior: " + entries.replace(0, "Nuevo valor para cero", "Nuevo valor para cero"));

        System.out.println("Objeto removido: " + entries.remove(2));
        System.out.println("Objeto que corresponde a la llave: " + entries.get(0));

        System.out.println(entries);

        for (Map.Entry<Integer, String> entry : entries.entrySet()) {
            if (entry.getValue() != null && entry.getValue().equals("Valor 4")) {
                System.out.println(entry.getKey());
            }
        }*/
        /*
        Map<Persona, String> celularesPersonas = new HashMap<>();
        celularesPersonas.put(new Persona(12345,"Brenda", "Zattera"), "+54123456");
        celularesPersonas.put(new Persona(12457, "Lucia", "Espindola"),"+54789456");
        celularesPersonas.put(new Persona(48956, "Juan", "Albarracin"), "+57312456");
        celularesPersonas.put(new Persona(12345,"Brenda", "Zattera"), "+54789");

        System.out.println(celularesPersonas);
        Persona luciana = new Persona(45987, "Luciana", "Chaparro");
        luciana.equals(new Integer(1));*/

        /*Map<Persona, String> treeMapEntries = new TreeMap<>(new DniComparator());
        treeMapEntries.put(new Persona(12345, "Brenda", "Zattera"), "+54123456");
        treeMapEntries.put(new Persona(456789, "Lucia", "Espindola"),"+54789456");
        treeMapEntries.put(new Persona(48956, "Juan", "Albarracin"),"+57312456");
        treeMapEntries.put(new Persona(12345, "Brenda","Zattera"),"+54789");

        System.out.println(treeMapEntries);
*/
        /*
        Scanner leer = new Scanner(System.in);

        Costumer customer1 = new Costumer("AS611", "Motorola", "Lavalle 1700");
        Costumer customer2 = new Costumer("WF121", "Arcos Dorados S.A.", "Alem 700");
        Costumer customer3 = new Costumer("BD311", "Aerolineas Argentina S.A.", "Mitre 900");
        Costumer customer4 = new Costumer("US844", "Mappa Studios", "Okinawa 342");
        Costumer customer5 = new Costumer("F43S2", "Wit Studio", "Corrientes 1231");

        Map<String, Costumer> customers = new HashMap<>();
        customers.put(customer1.getCodigoDeRegistro(), customer1);
        customers.put(customer2.getCodigoDeRegistro(), customer2);
        customers.put(customer3.getCodigoDeRegistro(), customer3);
        customers.put(customer4.getCodigoDeRegistro(), customer4);
        customers.put(customer5.getCodigoDeRegistro(), customer5);

        for (Map.Entry<String, Costumer> customersAux: customers.entrySet()) {
            System.out.println(customersAux.toString());
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Ingrese el codigo de registro a buscar:");
        String aux = leer.next();

        if (CostumerService.getCustomerByKey(customers, aux) == null) {
            System.out.println("El elemento buscado no se encuentra registrado.");
        } else {
            System.out.println(CostumerService.getCustomerByKey(customers, aux).toString());
        }*/
        Map<Persona, String> treeMapEntries = new TreeMap<>(new DniComparator());
        treeMapEntries.put(new Persona(12345, "Brenda", "Zattera"), "+54123456");
        treeMapEntries.put(new Persona(456789, "Lucía", "Espíndola"), "+54789465");
        treeMapEntries.put(new Persona(48956, "Juan", "Albarracín"), "+57312545887");
        treeMapEntries.put(new Persona(12345, "Brenda", "Zattera"), "+547894");

        System.out.println(treeMapEntries);

    }

}
