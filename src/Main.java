import java.util.*;
public class Main {
    public static void main(String[] args) {
            //instance of the patient
        Patient patient = new Patient(1234,"John");
        Patient outPatient = new Outpatient(2345, "Jenny", "12/15/2024","Doe");
        Patient inPatient = new Inpatient("06/17/2024","104A",3456,"Tom");
        MedicalRecord medRecord = new MedicalRecord("07/15/2024"," palpitations and restless");
        MedicalRecord medRecord1 = new MedicalRecord("01/12/2024", "serious headache and nausea");
        MedicalRecord medRecord2 = new MedicalRecord("01/12/2024", "severe ulcer");
        MedicalRecord medRecord3 = new MedicalRecord("02/22/2024", "itchy arms");


        // Hospital hospital = new Hospital();


        System.out.println(patient.getName());
        patient.setName("Sam");
        System.out.println(patient.getName());
        patient.addMedicalRecord(medRecord);
        System.out.println(patient.getMedicalHistory().toString());

        System.out.println(inPatient.getName());
        System.out.println(inPatient);




        System.out.println(outPatient.getName());
        outPatient.addMedicalRecord(medRecord1);
        System.out.println(outPatient.getMedicalHistory().toString());
        outPatient.updateMedicalRecord(medRecord3,0);
        System.out.println(outPatient.getMedicalHistory().toString());




        /*hospital.addPatient(patient);
        hospital.addPatient(outPatient);
        hospital.addPatient(inPatient);



        System.out.println(hospital.getPatient(1234));
        hospital.getPatient(2345);
        hospital.getPatient(3456);*/


        }
}
