package com.aldren.server.wallet.repositories;

import com.aldren.server.wallet.entities.EMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoneyRepository extends JpaRepository<EMoney, Long> {

    Optional<EMoney> findByUserIdAndCurrencyId(Long userId, Long currencyId);

}
