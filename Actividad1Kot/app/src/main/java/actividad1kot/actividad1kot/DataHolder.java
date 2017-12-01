package actividad1kot.actividad1kot;

import android.util.Log;

/**
 * Created by sergioredondo on 19/11/17.
 */

class DataHolder {
    private static final DataHolder ourInstance = new DataHolder();

    static DataHolder getInstance() {
        return ourInstance;
    }

    static public String nombre;
    static public String email;
    static public String telefono;
    static public String direccion;
    static public int yy = 0;
    static public int mm = 0;
    static public int dd = 0;

    static  public boolean aux = true;


    private DataHolder() {

    }
}
