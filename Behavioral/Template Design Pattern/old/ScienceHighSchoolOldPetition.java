package old;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScienceHighSchoolOldPetition {
   

        private String studentClass;
        private String number;
        private String name;
        private String branch;
    
        public ScienceHighSchoolOldPetition(String studentClass, String number, String name, String branch) {
            this.studentClass = studentClass;
            this.number = number;
            this.name = name;
            this.branch = branch;
        }
    
        public void printRequest() {
            System.out.println(requestText());
        }
    
        private String requestText() {
    
            StringBuilder requestText = new StringBuilder();
    
            String formattedDate = getFormattedDate();
    
            requestText.append("**************************************************************************");
            requestText.append("\n");
            requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + formattedDate);
            requestText.append("\n");
            requestText.append("\t\t\t\t" + "To the Principal of Çankırı Fen High School");
            requestText.append("\n");
            requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t" + "Çankırı");
            requestText.append("\n");
            requestText.append("\t");
            requestText.append("I am currently a student in your school, in the " + studentClass + " Fen-" + branch + " class with student number " + number);
            requestText.append(".\n");
            requestText.append("I kindly request information about my attendance for the academic year " + "2020" + ".\n");
            requestText.append("I remain, with respect.");
    
            requestText.append("\n\n");
    
            requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t" + name);
            requestText.append("\n");
            requestText.append("**************************************************************************");
    
            return requestText.toString();
        }

        
    
        private String getFormattedDate() {
    
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    
            return format.format(new Date());
        }
    
}
