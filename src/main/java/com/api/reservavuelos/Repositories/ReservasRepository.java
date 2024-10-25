package com.api.reservavuelos.Repositories;

import com.api.reservavuelos.Models.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservasRepository extends JpaRepository<Reservas, Long> {



    @Query(
            value = "SELECT COUNT(*) FROM reservas WHERE id_vuelo = :idVuelo AND clase = 'bussiness'",
            nativeQuery = true
    )
    int getBussinessClassByidVuelo(Long idVuelo);
    @Query(
            value = "SELECT COUNT(*) FROM reservas WHERE id_vuelo = :idVuelo AND clase = 'economy'",
            nativeQuery = true
    )
    int getEconomyClassByidVuelo(Long idVuelo);
    @Query(
            value = "SELECT * FROM reservas WHERE numero_asiento = :numeroAsiento",
            nativeQuery = true

    )
    Optional<Reservas> findByNumeroAsiento(int numeroAsiento);
}