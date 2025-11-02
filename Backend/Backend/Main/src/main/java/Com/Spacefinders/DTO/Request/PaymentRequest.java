package Com.Spacefinders.DTO.Request;


import jakarta.validation.constraints.NotNull;

public class PaymentRequest {
    @NotNull
    private Integer bookingId;

    @NotNull
    private Integer userId;

    @NotNull
    private Integer accountNumber;

    @NotNull
    private Double amount;

    @NotNull
    private Integer propertyId;


    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public PaymentRequest(Integer bookingId, Integer userId, Integer accountNumber, Double amount, Integer propertyId) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.propertyId = propertyId;
    }
}