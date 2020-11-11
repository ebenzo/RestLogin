package com.example.restlogin.model;

public class LoginView {
    private String Correo;
    private String Clave;

    public LoginView(String correo, String clave) {
        Correo = correo;
        Clave = clave;
    }

    public LoginView() {
    }

    public String getUsuario() {
        return Correo;
    }

    public void setUsuario(String correo) {
        Correo = correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    @Override
    public String toString() {
        return "LoginView{" +
                "Correo='" + Correo + '\'' +
                ", Clave='" + Clave + '\'' +
                '}';
    }
}
