
class Q17_Temperature{
    double celsius;
    double faherengeit;
    int type;
    void convert(double celsius){
        if(celsius< -273.15){
            System.out.println("Invalid ");
        }
        else{
            double faherenheit = (celsius*9/5)+32;
            System.out.println(celsius + "Conveting to " + faherenheit + "Faherengeit");
        }
    }

     void convert(double faherenheit , int type){
        if(faherenheit< -459.67){
            System.out.println("Invalid ");
        }
        else{
            double celsius = (faherenheit-32)*5/9;
            System.out.println(faherenheit + "Conveting to " + celsius + "Faherengeit");
        }
    }
}

class Test{
    public static void main(String[] args){
       
        Q17_Temperature s = new Q17_Temperature();
        s.convert(123.0);
        s.convert(343.4,4);
    }
}