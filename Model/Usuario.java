package Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String email;
    String password;

    public Usuario(){}

    public int getId() {
        return id;    
    }
    
    public void setId(int id) {
        this.id = id;    
    }
    
    public String getName() {
        return name;    
    }
    
    public void setName(String nome) {
        this.name = name;    
    }
    
    public String getEmail() {
        return email;    
    }
    
    public void setEmail(String email) {
        this.email = email;    
    }

    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }    
    
    @Override
    public String toString() {
        return id +": " + name + ", email=" + email;
    }
    
}
