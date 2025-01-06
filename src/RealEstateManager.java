import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RealEstateManager {
    private  String name;
    private  List<Property> properties;

    public RealEstateManager(String name) {
        this.name = name;
        this.properties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public List<Property> findPropertiesByPrice(double maxPrice) {
        if (maxPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        List<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getPrice() <= maxPrice) {
                result.add(property);
            }
        }
        return result;
    }







    // (10) propertiesList
    public List<Property> propertiesList(double maxPrice) throws PriceException {
        if (maxPrice < 0) {
            throw new PriceException();
        }
        List<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getPrice() <= maxPrice) {
                result.add(property);
            }
        }
        return result;
    }

    // (11) financialReport
    public void financialReport() {
        for (Property property : properties) {
            System.out.println(property + " - Tax: ");
            property.taxIt();
        }
    }

    // (12) commercialYield
    public double commercialYield() {
        double totalYield = 0;
        for (Property property : properties) {
            if (property instanceof Commercial) {
                Commercial commercial = (Commercial) property;
                totalYield += commercial.getYield();
            }
        }
        return totalYield;
    }

    // (13) propertiesByCity
    public List<Property> propertiesByCity(String city) {
        List<Property> result = new ArrayList<>();
        String formattedCity = city.replace("-", " ").toLowerCase();
        for (Property property : properties) {
            if (property.getAddress().toLowerCase().contains(formattedCity)) {
                result.add(property);
            }
        }
        return result;
    }

    // (14) numberOfCities
    public HashMap<String, Integer> numberOfCities() {
        HashMap<String, Integer> cityCounts = new HashMap<>();
        for (Property property : properties) {
            String[] addressParts = property.getAddress().split(",");
            if (addressParts.length > 0) {
                String city = addressParts[0].trim();
                cityCounts.put(city, cityCounts.getOrDefault(city, 0) + 1);
            }
        }
        return cityCounts;
    }




}
