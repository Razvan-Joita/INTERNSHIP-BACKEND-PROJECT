package nexttech.domain.dto.accountExtraDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.AccountExtraDetailsId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountExtraDetailsRequestDto {
    private AccountExtraDetailsId userTitleComposite;
}
