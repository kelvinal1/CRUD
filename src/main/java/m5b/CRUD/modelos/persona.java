package m5b.CRUD.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class persona {
    @Id
    private String _id;

    private String nombres;

    private String correo;

    private String fecha_nacimiento;

    private String genero;

    private String telefono;

    public persona() {
    }

    public persona(String nombres, String correo, String fecha_nacimiento, String genero, String telefono) {
        this.nombres = nombres;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.telefono = telefono;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
