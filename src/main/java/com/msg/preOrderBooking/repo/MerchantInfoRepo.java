package com.msg.preOrderBooking.repo;

import com.msg.preOrderBooking.model.MerchantInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MerchantInfoRepo extends JpaRepository<MerchantInfo, Long> {

    MerchantInfo getMerchantInfoById(Long merchantInfoId);
}
