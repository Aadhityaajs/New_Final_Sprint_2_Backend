package Com.Spacefinders.DTO.Request;

public class PaymentExternalServerRequest {
    private String fromAccountNumber;
    private String toUpiId;
    private String toAccountNumber;
    private Double amount;
    private String remarks;

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToUpiId() {
        return toUpiId;
    }

    public void setToUpiId(String toUpiId) {
        this.toUpiId = toUpiId;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public PaymentExternalServerRequest(String fromAccountNumber, String toAccountNumber, Double amount, String remarks) {
        this.fromAccountNumber = fromAccountNumber;
        this.toUpiId = "";
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.remarks = remarks;
    }
}
