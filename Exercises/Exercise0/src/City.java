public class City {
    private String cityName;
    private String country;
    private int population;
    private double area;
    private String mayor;
    private String uniqueId;
    private int gdp;
    private String climate;

    // Constructor
    public City(String cityName, String country, int population, double area, String mayor, String uniqueId, int gdp, String climate) {
        this.cityName = cityName;
        this.country = country;
        this.population = population;
        this.area = area;
        this.mayor = mayor;
        this.uniqueId = uniqueId;
        this.gdp = gdp;
        this.climate = climate;
        System.out.println("City instance created with name:"+cityName);
    }
    //method 1
    public void displayInfo() {
        System.out.println("City Information:");
        System.out.println("City Name: " + cityName);
        System.out.println("Country: " + country);
        System.out.println("Population: " + population);
        System.out.println("Area (square km): " + area);
        System.out.println("Mayor: " + mayor);
    }
    //method 2
    public void updatePopulation(int newPopulation) {
        population = newPopulation;
        System.out.println("Population of " + cityName + " updated to " + newPopulation);
    }
    //method 3
    public void changeMayor(String newMayor) {
        mayor = newMayor;
        System.out.println("New mayor of " + cityName + ": " + newMayor);
    }
}
