package gr.aueb.cf.cf9.fromclass;

public class Customer {

    private String vat;
    private String phone;
    private String region;
    private String street;
    private String email;

    public Customer () {}

    public Customer(String vat, String phone, String region, String street, String email) {
        this.vat = vat;
        this.phone = phone;
        this.region = region;
        this.street = street;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "vat='" + vat + '\'' +
                ", phone='" + phone + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
