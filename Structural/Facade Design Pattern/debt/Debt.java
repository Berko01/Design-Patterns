package debt;

import java.math.BigDecimal;
import java.util.Date;


public class Debt {
    private long id;
    private EnumDebtType debtType;
    private BigDecimal debtAmount;
    private Date expiryDate;
    public Debt(long id, EnumDebtType debtType, BigDecimal debtAmount, Date expiryDate) {
        this.id = id;
        this.debtType = debtType;
        this.debtAmount = debtAmount;
        this.expiryDate = expiryDate;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public EnumDebtType getDebtType() {
        return debtType;
    }
    public void setDebtType(EnumDebtType debtType) {
        this.debtType = debtType;
    }
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }
    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }
    public Date getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    



}