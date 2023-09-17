package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model;

import org.omg.CORBA.Object;

import java.util.Objects;

public abstract class Transport {
 private int bienKiemSoat;
 private String tenHangSanXuat;
 private int namSanXuat;
 private String chuSoHuu;

 public Transport(int bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
  this.bienKiemSoat = bienKiemSoat;
  this.tenHangSanXuat = tenHangSanXuat;
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

 public String getTenHangSanXuat() {
  return tenHangSanXuat;
 }

 public void setTenHangSanXuat(String tenHangSanXuat) {
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
