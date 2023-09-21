package nexttech.domain.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.AccountExtraDetailsId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account_extra_details")
public class AccountExtraDetails extends BaseEntity {
    @EmbeddedId
    private AccountExtraDetailsId userTitleComposite;

    @Column(name = "input_value")
    private String inputValue;

    @ManyToOne
    @MapsId("title")
    @JoinColumn(name = "title")
    private AccountExtraColumn title;
}
