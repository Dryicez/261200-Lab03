public class Main{
    public static void main(String[] args){
    Patient somchai = new Patient(101, "Somchai", 2006, 185.5 ,78.5);
        somchai.displayDetails(2025);

    int currentYear = 2024;
    //Test invalid patient
        Patient validPt = new Patient(1001, "john Doe", 1978, 175.5,78.5);
        validPt.displayDetails(currentYear);

        Patient invalidPt = new Patient(1002, "khaimook",-160.0,-65.0);
        invalidPt.displayDetails(currentYear);

    }

}
