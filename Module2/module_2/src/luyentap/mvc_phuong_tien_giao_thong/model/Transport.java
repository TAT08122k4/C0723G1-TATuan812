package luyentap.mvc_phuong_tien_giao_thong.model;

import org.omg.CORBA.Object;

import java.util.Objects;

public abstract class Transport {
 private int bienKiemSoat;
 private HangSanXuat tenHangSanXuat;
 private int namSanXuat;
 private String chuSoHuu;

 public Transport(){

 }
 public Transport(int bienKiemSoat,HangSanXuat hangSanXuat, int namSanXuat, String chuSoHuu) {
  this.bienKiemSoat = bienKiemSoat;
  this.tenHangSanXuat = hangSanXuat;
  this.namSanXuat = namSanXuat;
  this.chuSoHuu = chuSoHuu;
 }
 public boolean equals(Object obj) {
  Transport transport = (Transport) obj;
  return bienKiemSoat == transport.bienKiemSoat;
 }

 @Override
 public int hashCode() {
  return Objects.hash(bienKiemSoat);
 }

 public int getBienKiemSoat() {
  return bienKiemSoat;
 }

 public void setBienKiemSoat(int bienKiemSoat) {
  this.bienKiemSoat = bienKiemSoat;
 }

 public HangSanXuat getTenHangSanXuat() {
  return tenHangSanXuat;
 }

 public void setTenHangSanXuat(HangSanXuat tenHangSanXuat) {
  this.tenHangSanXuat = tenHangSanXuat;
 }

 public int getNamSanXuat() {
  return namSanXuat;
 }

 public void setNamSanXuat(int namSanXuat) {
  this.namSanXuat = namSanXuat;
 }

 public String getChuSoHuu() {
  return chuSoHuu;
 }

 public void setChuSoHuu(String chuSoHuu) {
  this.chuSoHuu = chuSoHuu;
 }

 @Override
 public String toString() {
  return "Transport{" +
          "bienKiemSoat=" + bienKiemSoat +
          ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
          ", namSanXuat=" + namSanXuat +
          ", chuSoHuu='" + chuSoHuu + '\'' +
          '}';
 }
}
