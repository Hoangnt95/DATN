package luckystore.datn.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import luckystore.datn.model.request.YeuCauRequest;

import java.util.Date;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "YeuCau")
public class YeuCau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ID_NGUOI_THUC_HIEN")
    private Long nguoiThucHien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_HOA_DON")
    @JsonBackReference
    private HoaDon hoaDon;

    @Column(name = "TRANG_THAI")
    private Integer trangThai;

    @Column(name = "NGAY_TAO")
    private Date ngayTao;

    @Column(name = "NGAY_SUA")
    private Date ngaySua;

    @Column(name = "GHI_CHU")
    private String ghiChu;

    @OneToMany(mappedBy = "yeuCau",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<YeuCauChiTiet> listYeuCauChiTiet;

    public YeuCau(YeuCauRequest YeuCauRequest,HoaDon hoaDon,Date ngayTao,Date ngaySua) {
        if (YeuCauRequest != null) {
            this.nguoiThucHien = YeuCauRequest.getNguoiThucHien();
            this.hoaDon = hoaDon;
            this.trangThai = YeuCauRequest.getTrangThai();
            this.ngayTao = ngayTao;
            this.ngaySua = ngaySua;
            this.ghiChu = YeuCauRequest.getGhiChu();
        }
    }

}

