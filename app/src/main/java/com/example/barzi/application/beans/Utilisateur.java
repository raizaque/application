package com.example.barzi.application.beans;

/**
 * Created by barzi on 11/03/2018.
 */

public class Utilisateur {
    private String id;
    private String pseduo;
    private String password;
    private String permission;

    public String getPseduo() {
        return pseduo;
    }

    public String getPassword() {
        return password;
    }

    public String getPermission() {
        return permission;
    }

    public String getRole() {
        return role;
    }

    private String role;

    public Utilisateur(String id, String pseduo, String password, String permission, String role) {
        this.id = id;
        this.pseduo = pseduo;
        this.password = password;
        this.permission = permission;
        this.role = role;
    }

    public String getId() {
        return id;
    }
}
