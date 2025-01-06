// RealEstateManager class

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;




public static void main(String[] args) {
    RealEstateManager manager = new RealEstateManager("My Real Estate Office");
    manager.getProperties().addAll(DataManager.createSampleProperties());

    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1 -> Search Properties");
        System.out.println("2 -> Financial Report");
        System.out.println("3 -> Commercial Yield");
        System.out.println("4 -> Properties by City");
        System.out.println("5 -> Number of Cities");
        System.out.println("-1 -> Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter maximum price: ");
                double maxPrice = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                try {
                    List<Property> results = manager.findPropertiesByPrice(maxPrice);
                    System.out.println("Properties found:");
                    for (Property property : results) {
                        System.out.println(property);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("Financial Report:");
                for (Property property : manager.getProperties()) {
                    System.out.print(property + " - ");
                    property.taxIt();
                }
                break;

            case 3:
                double totalYield = 0;
                for (Property property : manager.getProperties()) {
                    if (property instanceof Commercial) {
                        Commercial commercial = (Commercial) property;
                        totalYield += commercial.getYield();
                    }
                }
                System.out.println("Total Commercial Yield: " + totalYield);
                break;
            case 4:
                System.out.print("Enter city name: ");
                String city = scanner.nextLine();
                System.out.println("Properties in " + city + ":");
                for (Property property : manager.getProperties()) {
                    if (property.getAddress().toLowerCase().contains(city.toLowerCase())) {
                        System.out.println(property);
                    }
                }
                break;
            case 5:
                Set<String> cities = new HashSet<>();
                for (Property property : manager.getProperties()) {
                    String[] addressParts = property.getAddress().split(",");
                    if (addressParts.length > 0) {
                        cities.add(addressParts[0].trim());
                    }
                }
                System.out.println("Number of unique cities: " + cities.size());
                System.out.println("Cities: " + String.join(", ", cities));
                break;
            case -1:
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

