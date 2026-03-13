import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventService service = new EventService();

        while(true) {

            System.out.println("\n1 Add Event");
            System.out.println("2 View Events");
            System.out.println("3 Register Participant");
            System.out.println("4 View Participants");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();
                    System.out.println("Event Name:");
                    String name = sc.nextLine();

                    System.out.println("Date:");
                    String date = sc.nextLine();

                    System.out.println("Location:");
                    String location = sc.nextLine();

                    System.out.println("Capacity:");
                    int capacity = sc.nextInt();

                    System.out.println("Fee:");
                    double fee = sc.nextDouble();

                    service.addEvent(name,date,location,capacity,fee);
                    break;

                case 2:
                    service.viewEvents();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Participant Name:");
                    String pname = sc.nextLine();

                    System.out.println("Email:");
                    String email = sc.nextLine();

                    System.out.println("Event ID:");
                    int eventId = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Registration Date:");
                    String rdate = sc.nextLine();

                    service.registerParticipant(pname,email,eventId,rdate);
                    break;

                case 4:
    System.out.println("Enter Event ID:");
    int id = sc.nextInt();
    service.viewParticipantsByEvent(id);
    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}