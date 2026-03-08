
class Q8_Hospital{

    String hospitalName;
    String location;

    public void showdetails(){
        System.out.println("Hospital Name " + hospitalName);
        System.out.println("Location " + location);
    }
}

class Doctor extends Q8_Hospital{

    public String doctorName;
    public String specialization;

    public void showdetails(){
        super.showdetails();
        System.out.println("Doctoe Name "+ doctorName);
        System.out.println("Specialization " + specialization);
    }
}

class Patient extends Q8_Hospital{

    String patientName;
    double consulationFee;
    double discount=0;

   public void showdetails(){
        super.showdetails();
        if(consulationFee>=1000){
            discount = consulationFee*0.10;
            

        }
        System.out.println("PatientName " + patientName);
        System.out.println("consulationFee " + consulationFee);
        System.out.println("Discount " + discount);
    }
}

class test{
    public static void main(String[] args){
        Patient p = new Patient();
        p.hospitalName = "JK Hospital";
        p.location = "Amgmeda";
        Doctor d = new Doctor();
        d.doctorName = "Kashal";
        d.specialization = "Eyes";
        d.showdetails();
        p.patientName = "roank";
        p.consulationFee=2000;
        p.showdetails();
    }
}