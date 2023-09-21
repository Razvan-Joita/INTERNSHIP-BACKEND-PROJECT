//package nexttech.domain.model.entities;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import nexttech.domain.model.composite_primary_key_company.EmployeeDetailsTeamId;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "employee_details_team")
//public class EmployeeDetailsTeam extends BaseEntity {
//    @EmbeddedId
//    private EmployeeDetailsTeamId teamUserWorkComposite;
//
//    @ManyToOne
//    @MapsId("teamId")
//    @JoinColumn(name = "team_id")
//    private Team teamId;
//
//    @ManyToOne
//    @MapsId("userWorkId")
//    @JoinColumn(name = "employee_id")
//    private EmployeeDetails userWorkId;
//}
