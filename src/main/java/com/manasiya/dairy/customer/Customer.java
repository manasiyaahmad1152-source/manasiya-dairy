package com.manasiya.dairy.customer;
import jakarta.persistence.*;
@Entity @Table(name="customers")
public class Customer {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private String name; private String phone; private String address;
  private Double rate;
  public Customer() {}
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getName(){return name;} public void setName(String name){this.name=name;}
  public String getPhone(){return phone;} public void setPhone(String phone){this.phone=phone;}
  public String getAddress(){return address;} public void setAddress(String address){this.address=address;}
  public Double getRate(){return rate;} public void setRate(Double rate){this.rate=rate;}
}
