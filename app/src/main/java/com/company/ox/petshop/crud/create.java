package com.company.ox.petshop.crud;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by matheus_araujo on 15/11/17.
 */

public class create {

    public void createTable() {

        SQLiteDatabase db = mainDB.getInstancia().getWritableDatabase();
        String colunas = "( UID TEXT, NOME TEXT, IDADE INTEGER, PESOANIMAL REAL, ANIMAL INTEGER )";
        String query = "CREATE TABLE IF NOT EXISTS " + mainDB.TABELA_PESSOA + colunas;
        db.execSQL(query);
    }
}
