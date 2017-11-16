package com.company.ox.petshop.crud;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import com.company.ox.petshop.Pessoa;
/**
 * Created by matheus_araujo on 15/11/17.
 */

public class read {

    public ArrayList<Pessoa> getPessoas() {

        SQLiteDatabase db = mainDB.getInstancia().getReadableDatabase();
        String query = "SELECT * FROM " + mainDB.TABELA_PESSOA;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Cursor c = db.rawQuery(query, null);

        if (c.moveToFirst()) {

            do {
                Pessoa pessoa = new Pessoa(c.getString(0));
                pessoa.setNome(c.getString(1));
                pessoa.setIdade(c.getInt(2));
                pessoa.setPesoanimal(c.getDouble(3));
                pessoa.setAnimal(c.getInt(4) == 1);
                pessoas.add(pessoa);
            } while (c.moveToNext());
        }

        c.close();
        return pessoas;
    }
}
