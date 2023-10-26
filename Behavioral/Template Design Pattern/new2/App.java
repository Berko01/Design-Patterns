package new2;


public class App {

    public static void main(String[] args) {

        AnadoluHighSchoolOldPetition anatolianHighSchoolPetition =
                new AnadoluHighSchoolOldPetition("12-Science-A", "1093", "Sadık Bahadır Memiş");

                

        ScienceHighSchoolOldPetition scienceHighSchoolPetition = new ScienceHighSchoolOldPetition("10", "91", "Ayşe Yusuf", "B");

        anatolianHighSchoolPetition.printRequest();

    

        

        System.out.println("\n\n");
        scienceHighSchoolPetition.printRequest();
    }
}
