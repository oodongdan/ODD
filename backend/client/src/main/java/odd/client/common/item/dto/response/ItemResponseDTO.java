package odd.client.common.item.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Item 응답 DTO")
public class ItemResponseDTO {

    private Long Id;
    private String productName;
    private List<String> platform;
    private List<String> serviceType;
    private int price;
    private String s3url;
}