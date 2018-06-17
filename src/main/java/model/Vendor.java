
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// we create a model to handle database data 
@Entity
@Table(name = "merchants", catalog = "masoko") // table name is merchants database name is masoko 
public class Vendor implements Serializable {

    public Vendor() {}
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // this value on the table will be an auto generated value
    @Column(name = "id") // annotated with a column name 'id'
    private int id;
    
    @Column(name = "vendor_name")
    private String vendor_name;
    
  
    @Column(name = "vendor_telephone")
    private String vendor_telephone;
    
    @Column(name = "vendor_email")
    private String vendor_email;
    
    @Column(name = "payment_type")
    private String payment_type;
    
    @Column(name = "payment_number")
    private int payment_number;
    
    @Column(name = "payment_name")
    private String payment_name;
    
    @Column(name = "payment_schedule")
    private String payment_schedule;
    
    @Column(name = "country_code")
    private String country_code;
    
    @Column(name = "tax_pin")
    private String tax_pin;
    
    @Column(name = "tax_class")
    private String tax_class;
    
    @Column(name = "user_id")
    private String user_id;
    
    @Column(name = "external_id")
    private String external_id;
    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_telephone() {
        return vendor_telephone;
    }

    public void setVendor_telephone(String vendor_telephone) {
        this.vendor_telephone = vendor_telephone;
    }

    public String getVendor_email() {
        return vendor_email;
    }

    public void setVendor_email(String vendor_email) {
        this.vendor_email = vendor_email;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public int getPayment_number() {
        return payment_number;
    }

    public void setPayment_number(int payment_number) {
        this.payment_number = payment_number;
    }

    public String getPayment_name() {
        return payment_name;
    }

    public void setPayment_name(String payment_name) {
        this.payment_name = payment_name;
    }

    public String getPayment_schedule() {
        return payment_schedule;
    }

    public void setPayment_schedule(String payment_schedule) {
        this.payment_schedule = payment_schedule;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getTax_pin() {
        return tax_pin;
    }

    public void setTax_pin(String tax_pin) {
        this.tax_pin = tax_pin;
    }

    public String getTax_class() {
        return tax_class;
    }

    public void setTax_class(String tax_class) {
        this.tax_class = tax_class;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }
     
    
   
       
}
