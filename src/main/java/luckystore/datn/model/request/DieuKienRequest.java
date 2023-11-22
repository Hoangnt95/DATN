package luckystore.datn.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DieuKienRequest {

    private Long id;

    private Integer phanTramGiam;

    private BigDecimal tongHoaDon;

    private Long DotGiamGiaId;

}