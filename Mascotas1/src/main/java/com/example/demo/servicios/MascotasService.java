package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Rmascotas;

@Repository
public interface MascotasService  extends JpaRepository<Rmascotas, Long>
{

}
