package com.corenetworks.relacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data

@NoArgsConstructor
@Entity
@Table(name = "lugares")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLugar;
    @Column(length = 20,nullable = false)
    private String nombre;
//    @OneToMany(mappedBy = "lugares",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    List<Visita> visitas;

    //Generamos un constructos sin el List<Visitas>


    public Lugar(int idLugar, String nombre) {
        this.idLugar = idLugar;
        this.nombre = nombre;
    }
}
