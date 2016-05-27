/*
 *   UNIANDES - PUYO
 *   Sistema Lista de Animales 2016
 *   Octavo Semestre
 *   Alexander Ulloa
 *   26/05/2016
 */
package listaanimales;
import java.util.Date;
import java.text.SimpleDateFormat; 
/**
 *
 * @author Pc01
 */
public class clsAnimal {

    public int ID() {
        return _ID;
    }

    public void ID(int _ID) {
        this._ID = _ID;
    }

    public String Nombres() {
        return _Nombres;
    }

    public void Nombres(String _Nombres) {
        this._Nombres = _Nombres;
    }

    public Date Apareamiento() {
        return _Apareamiento;
    }

    public void Apareamiento(Date _Apareamiento) {
        this._Apareamiento = _Apareamiento;
    }

    public float Peso() {
        return _Peso;
    }

    public void Peso(float _Peso) {
        this._Peso = _Peso;
    }

    public ReinoAnimal ReinoA() {
        return _ReinoA;
    }

    public void ReinoA(ReinoAnimal _ReinoA) {
        this._ReinoA = _ReinoA;
    }

    public Nacimiento Nacimiento() {
        return _Nacimiento;
    }

    public void Nacimiento(Nacimiento _Nacimiento) {
        this._Nacimiento = _Nacimiento;
    }
    public enum ReinoAnimal {Vertebrados, Invertebrados};
     public enum Nacimiento {Oviparos, Viviparos}; 
     private int _ID;
     private String _Nombres;
     private Date _Apareamiento;
     private float _Peso;
     private ReinoAnimal _ReinoA;
     private Nacimiento _Nacimiento;

    public clsAnimal() {
    }

    public clsAnimal(int _ID, String _Nombres, Date _Apareamiento, float _Peso, ReinoAnimal _ReinoA, Nacimiento _Nacimiento) {
        this._ID = _ID;
        this._Nombres = _Nombres;
        this._Apareamiento = _Apareamiento;
        this._Peso = _Peso;
        this._ReinoA = _ReinoA;
        this._Nacimiento = _Nacimiento;
    }    
}
