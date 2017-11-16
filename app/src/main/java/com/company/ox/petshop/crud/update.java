package com.company.ox.petshop.crud;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.company.ox.petshop.Pessoa;

/**
 * Created by matheus_araujo on 15/11/17.
 */

public class update {

    public boolean addPessoa(Pessoa pessoa) {

        SQLiteDatabase db = mainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("UID", pessoa.getUID());
        cv.put("NOME", pessoa.getNome());
        cv.put("IDADE", pessoa.getIdade());
        cv.put("PESO", pessoa.getPesoanimal());
        cv.put("ANIMAL", pessoa.isAnimal());

        return db.insert(mainDB.TABELA_PESSOA, null, cv) != -1;

    }

    public boolean updatePessoa(Pessoa pessoa) {

        SQLiteDatabase db = mainDB.getInstancia().getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("UID", pessoa.getUID());
        cv.put("NOME", pessoa.getNome());
        cv.put("IDADE", pessoa.getIdade());
        cv.put("PESO", pessoa.getPesoanimal());
        cv.put("ANIMAL", pessoa.isAnimal());

        String where = "UID = '" + pessoa.getUID() + "'";

        return db.update(mainDB.TABELA_PESSOA, cv, where, null) > 0;

    }

}
