public class Outpatient extends Patient{
    String appointmentDate;
    String doctorName;
//removed void below?
    public Outpatient(int patientID, String name, String appointmentDate, String doctorName){
        super(patientID, name);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    public String getAppointmentDate(){
        return appointmentDate;
    }

    public String getDoctorName(){
        return doctorName;
    }

    public void setAppointmentDate(String appointmentDate){
        this.appointmentDate = appointmentDate;
    }

    public void setDoctorName(String doctorName){
        this.doctorName = doctorName;
    }

    @Override
    public String toString(){
        return "\nAppointment Date: " + appointmentDate + "\nDoctor Name: " + doctorName + "\n";
    }


}
