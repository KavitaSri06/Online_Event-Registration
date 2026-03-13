public class Event {

    int eventId;
    String eventName;
    String eventDate;
    String location;
    int capacity;
    double registrationFee;

    public Event(int eventId, String eventName, String eventDate, String location, int capacity, double registrationFee) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.location = location;
        this.capacity = capacity;
        this.registrationFee = registrationFee;
    }

    public String toString() {
        return eventId + " | " + eventName + " | " + eventDate + " | " + location + " | Capacity: " + capacity + " | Fee: " + registrationFee;
    }
}