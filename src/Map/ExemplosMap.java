package Map;
/*Dados os moelos do carros:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6km/l
modelo = mobi - consumo = 16,1km/l
modelo = hb20 - consumo = 14,5km/l
modelo = kwid- consumo = 15.6km/l
 */

import java.util.*;

public class ExemplosMap {
    private static TreeMap carrosPopulares2;

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os modelos e seus respectivos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o nome Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: "+ carrosPopulares.get("uno"));

        System.out.println("exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);


        System.out.println("exiba o consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("exiba o modelo mais economico e seu consumo");

        Double consumoMaiEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry: entries){
            if (entry.getValue().equals(consumoMaiEficiente))
                modeloMaisEficiente= entry.getKey();

        }
        System.out.println("Modelo " + modeloMaisEficiente +" consumo " + consumoMaiEficiente );


        System.out.println("Exiba o modelo menos economico: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry: carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + "consumo " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média de consumo: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igual 15.6km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
            }
        System.out.println(carrosPopulares);

        System.out.println("Ordenados pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares2);
    }
        }


