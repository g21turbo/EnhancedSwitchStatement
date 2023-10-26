public class Main {
    public static void main(String[] args) {

        String month = "March";
        System.out.println("The month of " + month + " is in the " + getQuarter(month));

        int switchValue = 6;

        switch (switchValue) {

            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            case 4 -> System.out.println("Value was 4");
            case 5, 6, 7 -> {
                System.out.println("Was 5, 6 , or 7");
                System.out.println("It was: " + switchValue);
            }
            default -> System.out.println("It was not on the list");
        }
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> { yield "1st"; }
            case "April", "May", "June" -> { yield "2nd"; }
            case "July", "August", "September" -> { yield "3rd"; }
            case "October", "November", "December" -> { yield "4th"; }
            default ->  {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}