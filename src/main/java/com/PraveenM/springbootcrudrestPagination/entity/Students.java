package com.PraveenM.springbootcrudrestPagination.entity;
import jakarta.persistence.*;
@Entity
@Table(name="students")
public class Students {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sid;
private String sname;
private String scity;
public Students() {
super();
}
public Students(int sid, String sname, String scity) {
super();
this.sid = sid;
this.sname = sname;
this.scity = scity;
}
public int getSid() {
return sid;
}
public void setSid(int sid) {
this.sid = sid;
}
public String getSname() {
return sname;
}
public void setSname(String sname) {
this.sname = sname;
}
public String getScity() {
return scity;
}
public void setScity(String scity) {
this.scity = scity;
}
}
