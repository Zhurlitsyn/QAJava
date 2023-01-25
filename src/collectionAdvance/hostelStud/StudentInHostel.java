package collectionAdvance.hostelStud;

public class StudentInHostel extends Student {
    private Hostel hostel;
    private String room;

    public StudentInHostel(String name, String group, Hostel hostel, String room) {
        super(name, group);
        this.hostel = hostel;
        this.room = room;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String printNameRoom () {
      return  " Name " + super.getName() +
              " group " + super.getGroup();
    }

    @Override
    public String toString() {
        return "Room: " + room + " Name " + super.getName() +
                " group " + super.getGroup();
    }
}
