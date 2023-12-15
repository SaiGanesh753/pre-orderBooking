package com.msg.preOrderBooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "registration_id")
    private Long registrationId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "user_name")
    private String username;
    @Column(name = "contact_email")
    private String contactEmail;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "verification_flg")
    private Boolean verificationFlg;
    @Column
    private String passcode;
    @Column(name = "last_logged_in_dt")
    private Timestamp lastLoggedInDt;
    @Column(name = "active_flg")
    private Boolean activeFlg;
    @Column(name = "delete_flg")
    private Boolean deleteFlg;
    @Column(name = "created_dt")
    private Timestamp createdDt;
    @Column(name = "created_user")
    private String createdUser;
    @Column(name = "modified_dt")
    private Timestamp modifiedDt;
    @Column(name = "modified_user")
    private String modifiedUser;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "registrationH_id", referencedColumnName = "registrationH_id")
    List<RegistrationH> registrationHList = new ArrayList<>();
}
