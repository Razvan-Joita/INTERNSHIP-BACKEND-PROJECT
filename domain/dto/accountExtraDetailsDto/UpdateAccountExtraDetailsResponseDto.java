package nexttech.domain.dto.accountExtraDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.AccountExtraDetailsId;
import nexttech.domain.model.entities.AccountExtraColumn;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAccountExtraDetailsResponseDto {
    private AccountExtraDetailsId userTitleComposite;
    private String inputValue;
    private AccountExtraColumn title;
    private LocalDateTime lastModificationDate;
}