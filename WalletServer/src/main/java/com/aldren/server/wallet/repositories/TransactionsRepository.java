package com.aldren.server.wallet.repositories;

import com.aldren.server.wallet.entities.ETransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionsRepository extends JpaRepository<ETransactions, Long> {

    List<ETransactions> findByUserId(Long userId);

}
