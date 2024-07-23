import java.util.*;

public class Patient {
    private int patientID;
    private String name;
    private List<MedicalRecord> medicalHistory = new ArrayList<>();

    public Patient(int patientID, String name, List<MedicalRecord> medicalHistory) {
        this.patientID = patientID;
        this.name = name;
        this.medicalHistory = medicalHistory;

    }

    public Patient(int patientID, String name) {
        this.patientID = patientID;
        this.name = name;
    }


    public int getPatientID() {
        return patientID;
    }
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }
    public void setMedicalHistory(List<MedicalRecord> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalHistory.add(medicalRecord);
    }
    public  void updateMedicalRecord(MedicalRecord newRecord, int index) {
        this.medicalHistory.set(index,newRecord);
    }
    public MedicalRecord getMedicalRecord(int index){
        return this.medicalHistory.get(index);
    }
}
