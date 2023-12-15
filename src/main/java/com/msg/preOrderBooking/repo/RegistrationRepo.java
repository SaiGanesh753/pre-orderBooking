package com.msg.preOrderBooking.repo;

import com.msg.preOrderBooking.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, Long> {
    Registration findByRegistrationId(Long registrationId);

}
