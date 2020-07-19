package Videos;

import java.util.Date;

public class Usuari {
    String nom, cognom, password;
    Date data_Registre;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getData_Registre() {
        return data_Registre;
    }

    public void setData_Registre(Date data_Registre) {
        this.data_Registre = data_Registre;
    }
}
