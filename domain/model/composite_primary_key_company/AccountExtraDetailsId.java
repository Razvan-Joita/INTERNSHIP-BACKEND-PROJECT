package nexttech.domain.model.composite_primary_key_company;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Embeddable
@NoArgsConstructor
public class AccountExtraDetailsId implements Serializable {
    @Column(name = "title")
    private String title;

    @Column(name = "account_id")
    private Integer accountId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountExtraDetailsId that = (AccountExtraDetailsId) o;
        return Objects.equals(title, that.title) && Objects.equals(accountId, that.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, accountId);
    }
}
