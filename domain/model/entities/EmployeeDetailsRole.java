//package nexttech.domain.model.entities;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import nexttech.domain.model.composite_primary_key_company.EmployeeDetailsRoleId;
//
//import java.util.List;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "employee_details_role")
//public class EmployeeDetailsRole extends BaseEntity {
//    @EmbeddedId
//    private EmployeeDetailsRoleId userWorkRoleComposite;
//
//    @ManyToOne
//    @MapsId("roleId")
//    @JoinColumn(name = "role_id")
//    private Role role;
//
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "employee_role_team_project_position",
//            joinColumns = {
//                    @JoinColumn(name = "employee_id"),
//                    @JoinColumn(name = "role_id")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "team_id", referencedColumnName = "team_id"),
//                    @JoinColumn(name = "project_id", referencedColumnName = "project_id"),
//                    @JoinColumn(name = "employee_position_id", referencedColumnName = "employee_position_id")
//            }
//    )
//    private List<TeamProjectPosition> teamProjectPositions;
//}
