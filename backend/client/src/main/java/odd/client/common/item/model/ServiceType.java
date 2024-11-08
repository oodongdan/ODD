package odd.client.common.item.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ServiceType {
    DELIVERY("배달"),
    PICKUP("픽업");

    private String description;

}