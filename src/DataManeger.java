import java.util.ArrayList;
import java.util.List;


     class DataManager {
        public static List<Property> createSampleProperties() {
            List<Property> sampleProperties = new ArrayList<>();

            // Adding 2 Plots
            sampleProperties.add(new Plot("Tel Aviv, Rothschild 1", 500, 2000000, Plot.Type.URBAN));
            sampleProperties.add(new Plot("Haifa, Herzl 10", 300, 1500000, Plot.Type.AGRICULTURAL));

            // Adding 2 Apartments
            sampleProperties.add(new Apartment("Jerusalem, King David 15", 120, 3000000, 2, 3));
            sampleProperties.add(new Apartment("Eilat, Red Sea 5", 100, 2500000, 1, 2));

            // Adding 2 Villas
            sampleProperties.add(new Villa("Ramat Gan, HaShikma 20", 250, 5000000, 3, 2));
            sampleProperties.add(new Villa("Kfar Saba, HaGolan 33", 200, 4500000, 2, 1));

            // Adding 2 Vacation Homes
            sampleProperties.add(new Vacation("Tiberias, Sea of Galilee 3", 150, 4000000, 1, 4));
            sampleProperties.add(new Vacation("Netanya, Beachfront 22", 180, 4200000, 2, 6));

            // Adding 2 Commercial Properties
            sampleProperties.add(new Commercial("Ashdod, Port 9", 600, 8000000, 5.0,true ));
            sampleProperties.add(new Commercial("Petah Tikva, Industrial Zone 12", 400, 6000000, 3.0, false));

            // Adding 2 Offices
            sampleProperties.add(new Office("Holon, Business Center 7", 100, 1200000));
            sampleProperties.add(new Office("Beer Sheva, Tech Hub 18", 150, 2000000));

            return sampleProperties;
        }
    }

