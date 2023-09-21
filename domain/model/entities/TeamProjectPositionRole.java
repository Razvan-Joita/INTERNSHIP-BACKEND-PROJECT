//package nexttech.domain.model.entities;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import nexttech.domain.model.composite_primary_key_company.TeamProjectPositionRoleId;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "team_project_position")
//public class TeamProjectPositionRole extends BaseEntity {
//    @EmbeddedId
//    private TeamProjectPositionRoleId teamProjectPositionRoleId;
//
//    @ManyToOne
//    @MapsId("teamId")
//    @JoinColumn(name = "team_id")
//    private Team teamId;
//
//    @ManyToOne
//    @MapsId("projectId")
//    @JoinColumn(name = "project_id")
//    private Project projectId;
//
//    @ManyToOne
//    @MapsId("positionId")
//    @JoinColumn(name = "employee_position_id")
//    private EmployeePosition projectPosition;
//
//    @ManyToOne
//    @MapsId("roleId")
//    @JoinColumn(name = "role_id")
//    private Role role;
//}