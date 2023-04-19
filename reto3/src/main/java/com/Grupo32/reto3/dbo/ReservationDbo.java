package com.Grupo32.reto3.dbo;

import com.Grupo32.reto3.model.CarModel;
import com.Grupo32.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDbo {
    private int idReservation;
    private Date starDate;
    private Date devolutionDate;
    private CarModel car;
    private ClientModel client;
}
