package old;

public class OldApplication {

    public static void main(String[] args) {
        AnadoluHighSchoolOldPetition anatolian = new AnadoluHighSchoolOldPetition("12 Science-A",
                "1093", "Sadık Bahadır Memiş");

        anatolian.printRequest();

        

        System.out.println("\n\n");

        ScienceHighSchoolOldPetition science = new ScienceHighSchoolOldPetition("10",
                "91", "Ayşe Yusuf", "B");

        science.printRequest();

        
    }
}