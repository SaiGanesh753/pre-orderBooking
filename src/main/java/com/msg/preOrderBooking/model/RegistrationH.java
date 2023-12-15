package com.msg.preOrderBooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationH {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "registrationH_id")
    private Long registrationHId;
    @Column
    private Long registrationId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String username;
    @Column
    private String contactEmail;
    @Column
    private String phoneNumber;
    @Column
    private Boolean verificationFlg;
    @Column
    private String passcode;
    @Column
    private Timestamp lastLoggedInDate;
    @Column
    private Boolean activeFlg;
    @Column
    private Boolean deleteFlg;
    @Column
    private Timestamp createdDt;
    @Column
    private String createdUser;
    @Column
    private Timestamp modifiedDt;
    @Column
    private String modifiedUser;
}
