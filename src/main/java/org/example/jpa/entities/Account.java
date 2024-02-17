package org.example.jpa.entities;

import lombok.*;
import org.example.jpa.enums.AccountType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ACCOUNTS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries(value = {
        @NamedQuery(name = "findAll", query = "select c from Account c")
})
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CODE")
    private Long code;
    @Column(name="BALANCE")
    private Double balance;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;


}
