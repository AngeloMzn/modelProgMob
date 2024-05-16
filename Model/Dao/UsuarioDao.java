package com.example.bdroom24.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.bdroom24.entities.Usuario;
import java.util.List;

@Dao
public interface UsuarioDao {
    @Query("SELECT * FROM usuario WHERE id=:idUsu LIMIT 1")
    Usuario getUser(int idUsu);

    @Query("SELECT * FROM Usuario")
    List<Usuario> getAll();

    @Query("SELECT * FROM usuario WHERE login like :userLogin")
    Usuario getUserByLogin(String userLogin);
    
    @Insert
    void insertAll(Usuario usuario);
    @Update
    void update(Usuario usuario);
    @Delete
    void delete(Usuario usuario);
}
