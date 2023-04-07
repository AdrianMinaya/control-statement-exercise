public class estaciones {

    public static void main(String[] args) {
        var season = "winter";

        switch (season) {
            case "spring":
                System.out.println("is spring");
                break;
        
             case "summer":
                System.out.println("is summer");
                break;

            case "fall":
                System.out.println("is fall");
                break;

            case "winter":
                System.out.println("is winter");
                break;
            default:
                System.out.println("is not a season");
        }
    }
}
