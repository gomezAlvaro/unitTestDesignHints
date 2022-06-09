package functionalcore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    Long id;
    String name;
    String type;
}
