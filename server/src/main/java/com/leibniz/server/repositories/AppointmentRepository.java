package com.leibniz.server.repositories;

import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "scheduled_appointement")
public class AppointmentRepository extends AbstractRepository{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "scheduled_appointment_id")
    private long id;
    private Date appointement_datetime;
    private long idService;
    private long idEmploye;
    private long idClient;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getAppointement_datetime() {
        return appointement_datetime;
    }

    public void setAppointement_datetime(Date appointement_datetime) {
        this.appointement_datetime = appointement_datetime;
    }

    public long getIdService() {
        return idService;
    }

    public void setIdService(long idService) {
        this.idService = idService;
    }

    public long getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(long idEmploye) {
        this.idEmploye = idEmploye;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }
}
