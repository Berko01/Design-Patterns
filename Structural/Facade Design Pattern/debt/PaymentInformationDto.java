package debt;

public class PaymentInformationDto {
    private String nameOnTheCard;
    private String cardNumber;
    private Long expiryMonth;
    private Long expiryYear;
    private Long cvvNumber;

    public PaymentInformationDto(String nameOnTheCard, int i, Long expiryMonth, Long expiryYear,
            Long cvvNumber) {
        this.nameOnTheCard = nameOnTheCard;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvvNumber = cvvNumber;
    }

    public String getNameOnTheCard() {
        return nameOnTheCard;
    }

    public void setNameOnTheCard(String nameOnTheCard) {
        this.nameOnTheCard = nameOnTheCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(Long expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public Long getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(Long expiryYear) {
        this.expiryYear = expiryYear;
    }

    public Long getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(Long cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

}
