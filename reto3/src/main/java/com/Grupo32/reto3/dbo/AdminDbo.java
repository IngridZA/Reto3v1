package com.Grupo32.reto3.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDbo {
    private int idAdmin;
    private String email;
    private String password;
    private byte age;

}
