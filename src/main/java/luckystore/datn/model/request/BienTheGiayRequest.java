package luckystore.datn.model.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import luckystore.datn.validation.PriceCheck;
import luckystore.datn.validation.groups.CreateGroup;
import luckystore.datn.validation.groups.UpdateGiaGroup;
import luckystore.datn.validation.groups.UpdateGroup;
import luckystore.datn.validation.groups.UpdateSoLuongGroup;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@PriceCheck(groups = {CreateGroup.class, UpdateGroup.class, UpdateGiaGroup.class})
public class BienTheGiayRequest {

    @NotNull(message = "Không được để trống", groups = {UpdateSoLuongGroup.class, UpdateGroup.class})
    private Long id;

    @NotNull(message = "Không được để trống", groups = {CreateGroup.class, UpdateGroup.class})
    private Long mauSacId;

    @NotNull(message = "Không được để trống", groups = {CreateGroup.class, UpdateGroup.class})
    private Long kichThuocId;

    @NotNull(message = "Không được để trống", groups = {CreateGroup.class, UpdateGroup.class, UpdateGiaGroup.class})
    @DecimalMin(message = "Không được âm", value = "0.0", groups = {CreateGroup.class, UpdateGroup.class , UpdateGiaGroup.class})
    private BigDecimal giaNhap;

    @NotNull(message = "Không được để trống", groups = {CreateGroup.class, UpdateGroup.class, UpdateGiaGroup.class})
    @DecimalMin(message = "Không được âm", value = "0.0", groups = {CreateGroup.class, UpdateGroup.class , UpdateGiaGroup.class})
    private BigDecimal giaBan;

    @NotNull(message = "Không được để trống", groups = {CreateGroup.class, UpdateGroup.class})
    private Integer trangThai;

    @NotNull(message = "Không được để trống", groups = {CreateGroup.class, UpdateGroup.class})
    @Length(message = "Không được vượt quá 20 ký tự", max = 20, groups = {CreateGroup.class, UpdateGroup.class})
    private String barcode;

    @NotNull(message = "Không được để trống", groups = {CreateGroup.class, UpdateGroup.class, UpdateSoLuongGroup.class})
    private Integer soLuong;

}
