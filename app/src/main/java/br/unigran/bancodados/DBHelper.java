package br.unigran.bancodados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context){
        super(context,"BancoLista",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table Lista(" +
                        "id integer primary key autoincrement," +
                        "nome varchar(150)," +
                        "telefone varchar(15)," +
                        "dataNascimento varchar(10))"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
