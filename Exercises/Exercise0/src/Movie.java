public class Movie {
    private String name;
    private double price;
    private String releaseTime;
    private String actors;
    private String directors;
    private String type;
    private String country;
    private double score;
    private String uniqueId;
//constructor
    public Movie(String name, double price, String releaseTime, String actors, String directors, String type, String country, double score, String uniqueId) {
        this.name = name;
        this.price = price;
        this.releaseTime = releaseTime;
        this.actors = actors;
        this.directors = directors;
        this.type = type;
        this.country = country;
        this.score = score;
        this.uniqueId = uniqueId;
        System.out.println("Movie instance is created by name:"+name);
    }
    //method 1
    public void displayInfo(){

    }
    //method 2
    public void printScore(){

    }
    //method 3
    public void printActors(){

    }
}
