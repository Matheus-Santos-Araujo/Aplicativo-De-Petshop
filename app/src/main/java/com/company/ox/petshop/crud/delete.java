package com.company.ox.petshop.crud;
import android.database.sqlite.SQLiteDatabase;
import com.company.ox.petshop.Pessoa;

/**
 * Created by matheus_araujo on 15/11/17.
 */

public class delete {

    public void removerTabela() {

        SQLiteDatabase db = mainDB.getInstancia().getWritableDatabase();
        String query = "DROP TABLE IF EXISTS " + mainDB.TABELA_PESSOA;
        db.execSQL(query);

    }

    public boolean removerPessoa(Pessoa pessoa) {

        SQLiteDatabase db = mainDB.getInstancia().getWritableDatabase();
        String query = "UID = '" + pessoa.getUID() + "'";
        return db.delete(mainDB.TABELA_PESSOA, query, null) > 0;

    }

}
