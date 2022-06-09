package functionalcore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Page {
    Long id;
    String name;
    String type;
}
