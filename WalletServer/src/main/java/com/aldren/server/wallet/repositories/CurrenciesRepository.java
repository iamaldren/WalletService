package com.aldren.server.wallet.repositories;

import com.aldren.server.wallet.entities.ECurrencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrenciesRepository extends JpaRepository<ECurrencies, Long> {

    Optional<ECurrencies> findByCurrencyCode(String currencyCode);

}
