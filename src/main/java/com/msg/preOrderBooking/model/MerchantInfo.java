package com.msg.preOrderBooking.model;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@Entity
@ToString
public class MerchantInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "merchant_info_id", nullable = false)
    private Long merchantInfoId;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name ="contact_num")
    private String contactNum;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "merchant_type")
    private String merchantType;

    @Column(name = "active_flg")
    private boolean activeFlg;

    @Column(name = "delete_flg")
    private boolean deleteFlg;

    @Column(name = "modified_user")
    private String modifiedUser;

    @Column(name = "modified_dt")
    private Timestamp modifiedDt;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "created_dt")
    private Timestamp createdDt;

}
