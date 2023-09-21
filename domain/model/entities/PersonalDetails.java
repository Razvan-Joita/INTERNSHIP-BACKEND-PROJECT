package nexttech.domain.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "account")
public class PersonalDetails extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "cnp")
    private String cnp;

    @Column(name = "iban")
    private String iban;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name="ci_series")
    private String ciSeries;

    @Column(name="ci_number")
    private String ciNumber;

    @Column(name = "tshirt")
    private String tshirt;

    @Column(name = "location")
    private String location;

    @JoinColumn(name = "employee_id")
    private Integer employeeDetailsId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id" )
    private List<AccountExtraDetails> accountExtraDetails;

}
