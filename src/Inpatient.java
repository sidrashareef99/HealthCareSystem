//this patient is already in the medical facility
public class Inpatient extends Patient{
    private String admissionDate;
    private String roomNumber;

    public Inpatient(String admissionDate, String roomNumber, int patientID, String name){
        super(patientID, name);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }

    public String getAdmissionDate(){
        return admissionDate;
    }
    public void setAdmissionDate(String admissionDate){
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString(){
        return "\nAdmission Date: " + admissionDate + "\nRoom Number: " + roomNumber;
    }
}
