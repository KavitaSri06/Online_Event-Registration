public class Participant {

    int participantId;
    String name;
    String email;
    int eventId;
    String registrationDate;

    public Participant(int participantId, String name, String email, int eventId, String registrationDate) {
        this.participantId = participantId;
        this.name = name;
        this.email = email;
        this.eventId = eventId;
        this.registrationDate = registrationDate;
    }

    public String toString() {
        return participantId + " | " + name + " | " + email + " | Event ID: " + eventId + " | Date: " + registrationDate;
    }
}