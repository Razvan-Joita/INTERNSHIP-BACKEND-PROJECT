package nexttech.domain.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.enumerates.AuthRole;
import nexttech.domain.model.enumerates.SeniorityLevel;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeDetails extends BaseEntity {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeDetailsId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @ManyToOne
    @JoinColumn(name = "employee_position_id")
    private EmployeePosition positionId;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "manager_id")
    private EmployeeDetails manager;

    @Column(name = "seniority_level")
    @Enumerated(EnumType.STRING)
    private SeniorityLevel seniorityLevel;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @Email
    @Column(name = "work_email")
    private String workEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "auth_role")
    @Enumerated(EnumType.STRING)
    private AuthRole authRole;

    @Column(name = "photo_URL")
    private String photoURL;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private List<EmployeeRoleTeamProjectPosition> employeeRoleTeamProjectPositions;
}
