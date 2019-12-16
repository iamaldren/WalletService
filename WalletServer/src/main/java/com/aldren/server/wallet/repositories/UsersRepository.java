package com.aldren.server.wallet.repositories;

import com.aldren.server.wallet.entities.EUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<EUsers, Long> {

    Optional<EUsers> findByUserId(String userId);

}
