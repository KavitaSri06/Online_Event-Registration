import java.util.ArrayList;
import java.util.List;

public class EventService {

    List<Event> events = new ArrayList<>();
    List<Participant> participants = new ArrayList<>();

    int eventCounter = 1;
    int participantCounter = 1;

    // ADD EVENT
    public void addEvent(String name, String date, String location, int capacity, double fee) {

        Event e = new Event(eventCounter++, name, date, location, capacity, fee);
        events.add(e);

        System.out.println("Event added successfully!");
    }

    // VIEW EVENTS
    public void viewEvents() {

        if(events.isEmpty()){
            System.out.println("No events available.");
            return;
        }

        for(Event e : events){
            System.out.println(e);
        }
    }

    // UPDATE EVENT
    public void updateEvent(int eventId, String newName, String newDate, String newLocation, int newCapacity, double newFee){

        for(Event e : events){

            if(e.eventId == eventId){

                e.eventName = newName;
                e.eventDate = newDate;
                e.location = newLocation;
                e.capacity = newCapacity;
                e.registrationFee = newFee;

                System.out.println("Event updated successfully!");
                return;
            }
        }

        System.out.println("Event not found!");
    }

    // DELETE EVENT
    public void deleteEvent(int eventId){

        Event eventToRemove = null;

        for(Event e : events){

            if(e.eventId == eventId){
                eventToRemove = e;
            }
        }

        if(eventToRemove != null){
            events.remove(eventToRemove);
            System.out.println("Event deleted successfully!");
        }
        else{
            System.out.println("Event not found!");
        }
    }

    // REGISTER PARTICIPANT
    public void registerParticipant(String name, String email, int eventId, String date){

        Event selectedEvent = null;
        int registeredCount = 0;

        // find event
        for(Event e : events){
            if(e.eventId == eventId){
                selectedEvent = e;
            }
        }

        if(selectedEvent == null){
            System.out.println("Event not found!");
            return;
        }

        // count participants
        for(Participant p : participants){
            if(p.eventId == eventId){
                registeredCount++;
            }
        }

        // capacity check
        if(registeredCount >= selectedEvent.capacity){
            System.out.println("Registration closed! Event capacity full.");
            return;
        }

        Participant p = new Participant(participantCounter++, name, email, eventId, date);
        participants.add(p);

        System.out.println("Participant registered successfully!");
    }

    // VIEW PARTICIPANTS BY EVENT
    public void viewParticipantsByEvent(int eventId){

        boolean found = false;

        for(Participant p : participants){

            if(p.eventId == eventId){
                System.out.println(p);
                found = true;
            }
        }

        if(!found){
            System.out.println("No participants registered for this event.");
        }
    }

    // SEARCH EVENT BY NAME
    public void searchEventByName(String name){

        boolean found = false;

        for(Event e : events){

            if(e.eventName.toLowerCase().contains(name.toLowerCase())){
                System.out.println(e);
                found = true;
            }
        }

        if(!found){
            System.out.println("No matching event found.");
        }
    }
}