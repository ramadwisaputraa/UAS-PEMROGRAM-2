package com.example.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    private @Id @GeneratedValue Long id;
    private Long nip;
    private String nama;
    private String Addres;
    private String Jbtn;
    private String potongan;
    private Long gaji;

    Data() {
    }

    Data(Long nip, String nama, String Addres, String Jbtn, String potongan, Long gaji) {
        this.nip = nip;
        this.nama = nama;
        this.Addres = Addres;
        this.Jbtn = Jbtn;
        this.potongan = potongan;
        this.gaji = gaji;
    }

    public Long getId() {
        return this.id;
    }

    public Long getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAddres() {
        return this.Addres;
    }

    public String getJbtn() {
        return this.Jbtn;
    }

    public String getpotongan() {
        return this.potongan;
    }

    public Long getGaji() {
        return this.gaji;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNip(Long nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAddres(String Addres) {
        this.Addres = Addres;
    }

    public void setJbtn(String Jbtn) {
        this.Jbtn = Jbtn;
    }

    public void setpotongan(String potongan) {
        this.potongan = potongan;
    }

    public void setGaji(Long gaji) {
        this.gaji = gaji;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Data))
            return false;
        Data data = (Data) o;
        return Objects.equals(this.id, data.id) && Objects.equals(this.nip, data.nip)
                && Objects.equals(this.nama, data.nama) && Objects.equals(this.Addres, data.Addres)
                && Objects.equals(this.Jbtn, data.Jbtn) && Objects.equals(this.potongan, data.potongan)
                && Objects.equals(this.gaji, data.gaji);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nip, this.nama, this.Addres, this.Jbtn, this.potongan, this.gaji);
    }

    @Override
    public String toString() {
        return "Data pegawai{" + "id=" + this.id + ", NIP='" + this.nip + '\'' + ", nama='" + this.nama + '\''
                + ", Addres='" + this.Addres + '\'' + ", Jbtn='" + this.Jbtn + '\'' + ", potongan='"
                + this.potongan + '\'' + ", gaji='" + this.gaji + '\'' +  '}';
    }

}
