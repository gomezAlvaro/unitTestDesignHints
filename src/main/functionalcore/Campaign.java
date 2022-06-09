package functionalcore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Campaign {
    Long id;
    String calc;
    String type;

    Campaign(String calc) {
        this.calc = calc;
    }
}
