package luckystore.datn.model.request;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class GioHangThanhToanRequest {
    private Long id;

    private KhachHangRequest khachHang;

    private NhanVienRequest nhanVien;

    private LocalDateTime ngayTao;

    private LocalDateTime ngayShip;

    private LocalDateTime ngayNhan;

    private LocalDateTime ngayThanhToan;

    private Integer kenhBan;

    private Integer loaiHoaDon;

    private String maVanDon;

    private String email;

    private BigDecimal phiShip;

    private String soDienThoaiNhan;

    private String diaChiNhan;

    private Integer trangThai;

    private String ghiChu;

    private Set<BienTheGiayGioHangRequest> bienTheGiayRequests;

}
