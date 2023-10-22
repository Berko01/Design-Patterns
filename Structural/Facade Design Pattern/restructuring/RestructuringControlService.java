package restructuring;


import java.util.Date;

import date.DateUtil;

public class RestructuringControlService {
    public boolean isRestructuringShouldBeDisrupted(Date expiryDate){
        
        

        Date currentDate = DateUtil.getCurrentDate();

        long dayDifference = DateUtil.calculateDayDifference(expiryDate, currentDate);

        boolean isRestructuringShouldBeDisrupted = dayDifference > 90;

        if (isRestructuringShouldBeDisrupted){
            System.out.println("Borcun yapılandırması bozulmalı! Tahsil edilemez!");
        }

        return isRestructuringShouldBeDisrupted;
    }
}
