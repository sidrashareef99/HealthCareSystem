import java.util.*;

public class Hospital<T extends Patient> {
    List<T> patients = new ArrayList<T>();
    public Hospital(){

    }

    public void addPatient(T patient) {
        patients.add(patient);
    }

    public T getPatient(Integer patientID){
       //redo return statement
        return patients.get(patientID);

    }
}
