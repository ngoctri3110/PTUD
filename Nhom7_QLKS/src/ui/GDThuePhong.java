package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class GDThuePhong extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tablePTP;
	private JTextField txtSoPhong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GDThuePhong window = new GDThuePhong();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GDThuePhong() {
		setTitle("Quản lý thuê phòng");
		setBounds(100, 100, 1366, 768);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel pnChucNangTP = new JPanel();
		pnChucNangTP.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnChucNangTP.setBackground(SystemColor.menu);
		pnChucNangTP.setBounds(0, 0, 506, 138);
		getContentPane().add(pnChucNangTP);
		pnChucNangTP.setLayout(null);
		
		JLabel lblThue = new JLabel("");
		lblThue.setBounds(10, 0, 95, 95);
		Image imgThue = new ImageIcon(this.getClass().getResource("/img/thuephong.png")).getImage().getScaledInstance(95, 95, Image.SCALE_SMOOTH);
		lblThue.setIcon(new ImageIcon(imgThue));
		pnChucNangTP.add(lblThue);
		
		JLabel lblNewLabel = new JLabel("THUÊ PHÒNG");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 97, 95, 30);
		pnChucNangTP.add(lblNewLabel);
		
		JLabel lblChinhSua = new JLabel("");
		lblChinhSua.setBounds(144, 11, 95, 95);
		Image imgChinhSua = new ImageIcon(this.getClass().getResource("/img/chinhsuaptp.png")).getImage().getScaledInstance(95, 95, Image.SCALE_SMOOTH);
		lblChinhSua.setIcon(new ImageIcon(imgChinhSua));
		pnChucNangTP.add(lblChinhSua);
		
		JLabel lblCSTP = new JLabel("SỬA PHIẾU");
		lblCSTP.setHorizontalAlignment(SwingConstants.CENTER);
		lblCSTP.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCSTP.setBounds(140, 97, 95, 30);
		pnChucNangTP.add(lblCSTP);
		
		JLabel lblTimKiemTP = new JLabel("");
		lblTimKiemTP.setBounds(270, 11, 95, 95);
		Image imgTimKiemTP = new ImageIcon(this.getClass().getResource("/img/timkiemthuephong.png")).getImage().getScaledInstance(95, 95, Image.SCALE_SMOOTH);
		lblTimKiemTP.setIcon(new ImageIcon(imgTimKiemTP));
		pnChucNangTP.add(lblTimKiemTP);
		
		JLabel lblTKTP = new JLabel("TÌM KIẾM");
		lblTKTP.setHorizontalAlignment(SwingConstants.CENTER);
		lblTKTP.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTKTP.setBounds(270, 97, 95, 30);
		pnChucNangTP.add(lblTKTP);
		
		JLabel lblTroVe = new JLabel("");
		lblTroVe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GDChinh().setVisible(true);
				dispose();
			}
		});
		lblTroVe.setBounds(401, 11, 95, 95);
		Image imgTroVe = new ImageIcon(this.getClass().getResource("/img/trove.png")).getImage().getScaledInstance(95, 95, Image.SCALE_SMOOTH);
		lblTroVe.setIcon(new ImageIcon(imgTroVe));
		pnChucNangTP.add(lblTroVe);
		
		JLabel lblQuayVe = new JLabel("TRỞ VỀ");
		lblQuayVe.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuayVe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuayVe.setBounds(401, 97, 95, 30);
		pnChucNangTP.add(lblQuayVe);
		
		JPanel pnPTP_TTKH = new JPanel();
		pnPTP_TTKH.setBounds(0, 138, 506, 591);
		getContentPane().add(pnPTP_TTKH);
		pnPTP_TTKH.setLayout(null);
		
		JPanel pnTTTP = new JPanel();
		pnTTTP.setBackground(Color.WHITE);
		pnTTTP.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin thu\u00EA ph\u00F2ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnTTTP.setBounds(0, 0, 505, 276);
		pnPTP_TTKH.add(pnTTTP);
		pnTTTP.setLayout(null);
		
		JLabel lblTenKH = new JLabel("Tên khách hàng:");
		lblTenKH.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTenKH.setBounds(10, 21, 166, 23);
		pnTTTP.add(lblTenKH);
		
		JComboBox cboTenKH = new JComboBox();
		cboTenKH.setBounds(179, 21, 316, 23);
		pnTTTP.add(cboTenKH);
		
		JLabel lblSoLuongKH = new JLabel("Số lượng khách:");
		lblSoLuongKH.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSoLuongKH.setBounds(10, 73, 166, 23);
		pnTTTP.add(lblSoLuongKH);
		
		JComboBox cboSoLuongKH = new JComboBox();
		cboSoLuongKH.setBounds(179, 76, 74, 23);
		pnTTTP.add(cboSoLuongKH);
		
		JLabel lblChonLP = new JLabel("Chọn loại phòng:");
		lblChonLP.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChonLP.setBounds(10, 130, 166, 23);
		pnTTTP.add(lblChonLP);
		
		JComboBox cboChonLP = new JComboBox();
		cboChonLP.setBounds(179, 133, 174, 23);
		pnTTTP.add(cboChonLP);
		
		JLabel lblNgayThue = new JLabel("Ngày thuê:");
		lblNgayThue.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNgayThue.setBounds(10, 185, 166, 23);
		pnTTTP.add(lblNgayThue);
		
		JDateChooser dcNgayThue = new JDateChooser();
		dcNgayThue.setBounds(179, 185, 174, 23);
		pnTTTP.add(dcNgayThue);
		
		JLabel lblNgayTra = new JLabel("Ngày trả dự kiến:");
		lblNgayTra.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNgayTra.setBounds(10, 240, 166, 23);
		pnTTTP.add(lblNgayTra);
		
		JDateChooser dcNgayTra = new JDateChooser();
		dcNgayTra.setBounds(179, 240, 174, 23);
		pnTTTP.add(dcNgayTra);
		
		JLabel lblChiaKhoa = new JLabel("");
		lblChiaKhoa.setBounds(363, 109, 132, 154);
		Image imgThuePhong = new ImageIcon(this.getClass().getResource("/img/chiakhoa.png")).getImage().getScaledInstance(132, 154, Image.SCALE_SMOOTH);
		lblChiaKhoa.setIcon(new ImageIcon(imgThuePhong));
		pnTTTP.add(lblChiaKhoa);
		
		JLabel lblSoPhong = new JLabel("Số phòng:");
		lblSoPhong.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSoPhong.setBounds(263, 73, 110, 23);
		pnTTTP.add(lblSoPhong);
		
		txtSoPhong = new JTextField();
		txtSoPhong.setBounds(363, 73, 132, 23);
		pnTTTP.add(txtSoPhong);
		txtSoPhong.setColumns(10);
		
		JPanel pnPTP = new JPanel();
		pnPTP.setBackground(Color.WHITE);
		pnPTP.setBorder(new TitledBorder(null, "Phi\u1EBFu thu\u00EA ph\u00F2ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnPTP.setBounds(0, 276, 505, 315);
		pnPTP_TTKH.add(pnPTP);
		pnPTP.setLayout(null);
		
		JPanel pnBangPTP = new JPanel();
		pnBangPTP.setBounds(10, 21, 485, 283);
		pnPTP.add(pnBangPTP);
		pnBangPTP.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 485, 283);
		pnBangPTP.add(scrollPane);
		
		tablePTP = new JTable();
		tablePTP.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 Phi\u1EBFu", "T\u00EAn kh\u00E1ch h\u00E0ng", "Ng\u00E0y thu\u00EA", "Ng\u00E0y tr\u1EA3 d\u1EF1 ki\u1EBFn", "S\u1ED1 ph\u00F2ng"
			}
		));
		tablePTP.getColumnModel().getColumn(0).setPreferredWidth(57);
		tablePTP.getColumnModel().getColumn(1).setPreferredWidth(159);
		tablePTP.getColumnModel().getColumn(2).setPreferredWidth(113);
		tablePTP.getColumnModel().getColumn(3).setPreferredWidth(109);
		tablePTP.getColumnModel().getColumn(4).setPreferredWidth(57);
		scrollPane.setViewportView(tablePTP);
		
		JPanel pnThuePhong = new JPanel();
		pnThuePhong.setBounds(507, 0, 843, 729);
		getContentPane().add(pnThuePhong);
		pnThuePhong.setLayout(null);
		
		JPanel pnDSPT = new JPanel();
		pnDSPT.setBackground(SystemColor.menu);
		pnDSPT.setBorder(new TitledBorder(null, "Danh s\u00E1ch ph\u00F2ng thu\u00EA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnDSPT.setBounds(0, 0, 843, 729);
		pnThuePhong.add(pnDSPT);
		pnDSPT.setLayout(null);
		
		JPanel pnTang1 = new JPanel();
		pnTang1.setBorder(new TitledBorder(null, "T\u1EA7ng 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnTang1.setBackground(SystemColor.window);
		pnTang1.setBounds(10, 33, 823, 112);
		pnDSPT.add(pnTang1);
		pnTang1.setLayout(null);
		
		JButton btn101 = new JButton("101");
		btn101.setBackground(Color.GREEN);
		btn101.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn101.setBounds(21, 15, 89, 89);
		btn101.setFocusable(false);
		pnTang1.add(btn101);
		
		JButton btn102 = new JButton("102");
		btn102.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn102.setFocusable(false);
		btn102.setBackground(Color.GREEN);
		btn102.setBounds(120, 15, 89, 89);
		pnTang1.add(btn102);
		
		JButton btn103 = new JButton("103");
		btn103.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn103.setFocusable(false);
		btn103.setBackground(Color.GREEN);
		btn103.setBounds(219, 15, 89, 89);
		pnTang1.add(btn103);
		
		JButton btn104 = new JButton("104");
		btn104.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn104.setFocusable(false);
		btn104.setBackground(Color.GREEN);
		btn104.setBounds(318, 15, 89, 89);
		pnTang1.add(btn104);
		
		JButton btn105 = new JButton("105");
		btn105.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn105.setFocusable(false);
		btn105.setBackground(Color.GREEN);
		btn105.setBounds(417, 15, 89, 89);
		pnTang1.add(btn105);
		
		JButton btn106 = new JButton("106");
		btn106.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn106.setFocusable(false);
		btn106.setBackground(Color.GREEN);
		btn106.setBounds(516, 15, 89, 89);
		pnTang1.add(btn106);
		
		JButton btn107 = new JButton("107");
		btn107.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn107.setFocusable(false);
		btn107.setBackground(Color.GREEN);
		btn107.setBounds(615, 15, 89, 89);
		pnTang1.add(btn107);
		
		JButton btn108 = new JButton("108");
		btn108.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn108.setFocusable(false);
		btn108.setBackground(Color.GREEN);
		btn108.setBounds(714, 15, 89, 89);
		pnTang1.add(btn108);
		
		JPanel pnTang2 = new JPanel();
		pnTang2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u1EA7ng 2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnTang2.setBackground(Color.WHITE);
		pnTang2.setBounds(10, 145, 823, 112);
		pnDSPT.add(pnTang2);
		pnTang2.setLayout(null);
		
		JButton btn201 = new JButton("201");
		btn201.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn201.setFocusable(false);
		btn201.setBackground(Color.GREEN);
		btn201.setBounds(21, 15, 89, 89);
		pnTang2.add(btn201);
		
		JButton btn202 = new JButton("202");
		btn202.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn202.setFocusable(false);
		btn202.setBackground(Color.GREEN);
		btn202.setBounds(120, 15, 89, 89);
		pnTang2.add(btn202);
		
		JButton btn203 = new JButton("203");
		btn203.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn203.setFocusable(false);
		btn203.setBackground(Color.GREEN);
		btn203.setBounds(219, 15, 89, 89);
		pnTang2.add(btn203);
		
		JButton btn204 = new JButton("204");
		btn204.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn204.setFocusable(false);
		btn204.setBackground(Color.GREEN);
		btn204.setBounds(318, 15, 89, 89);
		pnTang2.add(btn204);
		
		JButton btn205 = new JButton("205");
		btn205.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn205.setFocusable(false);
		btn205.setBackground(Color.GREEN);
		btn205.setBounds(417, 15, 89, 89);
		pnTang2.add(btn205);
		
		JButton btn206 = new JButton("206");
		btn206.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn206.setFocusable(false);
		btn206.setBackground(Color.GREEN);
		btn206.setBounds(516, 15, 89, 89);
		pnTang2.add(btn206);
		
		JButton btn207 = new JButton("207");
		btn207.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn207.setFocusable(false);
		btn207.setBackground(Color.GREEN);
		btn207.setBounds(615, 15, 89, 89);
		pnTang2.add(btn207);
		
		JButton btn208 = new JButton("208");
		btn208.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn208.setFocusable(false);
		btn208.setBackground(Color.GREEN);
		btn208.setBounds(714, 15, 89, 89);
		pnTang2.add(btn208);
		
		JPanel pnTang3 = new JPanel();
		pnTang3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u1EA7ng 3", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnTang3.setBackground(Color.WHITE);
		pnTang3.setBounds(10, 257, 823, 112);
		pnDSPT.add(pnTang3);
		pnTang3.setLayout(null);
		
		JButton btn301 = new JButton("301");
		btn301.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn301.setFocusable(false);
		btn301.setBackground(Color.GREEN);
		btn301.setBounds(21, 15, 89, 89);
		pnTang3.add(btn301);
		
		JButton btn302 = new JButton("302");
		btn302.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn302.setFocusable(false);
		btn302.setBackground(Color.GREEN);
		btn302.setBounds(120, 15, 89, 89);
		pnTang3.add(btn302);
		
		JButton btn303 = new JButton("303");
		btn303.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn303.setFocusable(false);
		btn303.setBackground(Color.GREEN);
		btn303.setBounds(219, 15, 89, 89);
		pnTang3.add(btn303);
		
		JButton btn304 = new JButton("304");
		btn304.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn304.setFocusable(false);
		btn304.setBackground(Color.GREEN);
		btn304.setBounds(318, 15, 89, 89);
		pnTang3.add(btn304);
		
		JButton btn305 = new JButton("305");
		btn305.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn305.setFocusable(false);
		btn305.setBackground(Color.GREEN);
		btn305.setBounds(417, 15, 89, 89);
		pnTang3.add(btn305);
		
		JButton btn306 = new JButton("306");
		btn306.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn306.setFocusable(false);
		btn306.setBackground(Color.GREEN);
		btn306.setBounds(516, 15, 89, 89);
		pnTang3.add(btn306);
		
		JButton btn307 = new JButton("307");
		btn307.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn307.setFocusable(false);
		btn307.setBackground(Color.GREEN);
		btn307.setBounds(615, 15, 89, 89);
		pnTang3.add(btn307);
		
		JButton btn308 = new JButton("308");
		btn308.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn308.setFocusable(false);
		btn308.setBackground(Color.GREEN);
		btn308.setBounds(714, 15, 89, 89);
		pnTang3.add(btn308);
		
		JPanel pnTang4 = new JPanel();
		pnTang4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u1EA7ng 4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnTang4.setBackground(Color.WHITE);
		pnTang4.setBounds(10, 369, 823, 112);
		pnDSPT.add(pnTang4);
		pnTang4.setLayout(null);
		
		JButton btn401 = new JButton("401");
		btn401.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn401.setFocusable(false);
		btn401.setBackground(Color.GREEN);
		btn401.setBounds(21, 15, 89, 89);
		pnTang4.add(btn401);
		
		JButton btn402 = new JButton("402");
		btn402.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn402.setFocusable(false);
		btn402.setBackground(Color.GREEN);
		btn402.setBounds(120, 15, 89, 89);
		pnTang4.add(btn402);
		
		JButton btn403 = new JButton("403");
		btn403.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn403.setFocusable(false);
		btn403.setBackground(Color.GREEN);
		btn403.setBounds(219, 15, 89, 89);
		pnTang4.add(btn403);
		
		JButton btn404 = new JButton("404");
		btn404.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn404.setFocusable(false);
		btn404.setBackground(Color.GREEN);
		btn404.setBounds(318, 15, 89, 89);
		pnTang4.add(btn404);
		
		JButton btn405 = new JButton("405");
		btn405.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn405.setFocusable(false);
		btn405.setBackground(Color.GREEN);
		btn405.setBounds(417, 15, 89, 89);
		pnTang4.add(btn405);
		
		JButton btn406 = new JButton("406");
		btn406.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn406.setFocusable(false);
		btn406.setBackground(Color.GREEN);
		btn406.setBounds(516, 15, 89, 89);
		pnTang4.add(btn406);
		
		JButton btn407 = new JButton("407");
		btn407.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn407.setFocusable(false);
		btn407.setBackground(Color.GREEN);
		btn407.setBounds(615, 15, 89, 89);
		pnTang4.add(btn407);
		
		JButton btn408 = new JButton("408");
		btn408.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn408.setFocusable(false);
		btn408.setBackground(Color.GREEN);
		btn408.setBounds(714, 15, 89, 89);
		pnTang4.add(btn408);
		
		JPanel pnTang5 = new JPanel();
		pnTang5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u1EA7ng 5", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnTang5.setBackground(Color.WHITE);
		pnTang5.setBounds(10, 481, 823, 112);
		pnDSPT.add(pnTang5);
		pnTang5.setLayout(null);
		
		JButton btn501 = new JButton("501");
		btn501.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn501.setFocusable(false);
		btn501.setBackground(Color.GREEN);
		btn501.setBounds(21, 15, 89, 89);
		pnTang5.add(btn501);
		
		JButton btn502 = new JButton("502");
		btn502.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn502.setFocusable(false);
		btn502.setBackground(Color.GREEN);
		btn502.setBounds(120, 15, 89, 89);
		pnTang5.add(btn502);
		
		JButton btn503 = new JButton("503");
		btn503.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn503.setFocusable(false);
		btn503.setBackground(Color.GREEN);
		btn503.setBounds(219, 15, 89, 89);
		pnTang5.add(btn503);
		
		JButton btn504 = new JButton("504");
		btn504.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn504.setFocusable(false);
		btn504.setBackground(Color.GREEN);
		btn504.setBounds(318, 15, 89, 89);
		pnTang5.add(btn504);
		
		JButton btn505 = new JButton("505");
		btn505.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn505.setFocusable(false);
		btn505.setBackground(Color.GREEN);
		btn505.setBounds(417, 15, 89, 89);
		pnTang5.add(btn505);
		
		JButton btn506 = new JButton("506");
		btn506.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn506.setFocusable(false);
		btn506.setBackground(Color.GREEN);
		btn506.setBounds(516, 15, 89, 89);
		pnTang5.add(btn506);
		
		JButton btn507 = new JButton("507");
		btn507.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn507.setFocusable(false);
		btn507.setBackground(Color.GREEN);
		btn507.setBounds(615, 15, 89, 89);
		pnTang5.add(btn507);
		
		JButton btn508 = new JButton("408");
		btn508.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn508.setFocusable(false);
		btn508.setBackground(Color.GREEN);
		btn508.setBounds(714, 15, 89, 89);
		pnTang5.add(btn508);
		
		JPanel pnTang6 = new JPanel();
		pnTang6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u1EA7ng 6", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnTang6.setBackground(Color.WHITE);
		pnTang6.setBounds(10, 593, 823, 112);
		pnDSPT.add(pnTang6);
		pnTang6.setLayout(null);
		
		JButton btn601 = new JButton("601");
		btn601.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn601.setFocusable(false);
		btn601.setBackground(Color.GREEN);
		btn601.setBounds(21, 15, 89, 89);
		pnTang6.add(btn601);
		
		JButton btn602 = new JButton("602");
		btn602.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn602.setFocusable(false);
		btn602.setBackground(Color.GREEN);
		btn602.setBounds(120, 15, 89, 89);
		pnTang6.add(btn602);
		
		JButton btn603 = new JButton("503");
		btn603.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn603.setFocusable(false);
		btn603.setBackground(Color.GREEN);
		btn603.setBounds(219, 15, 89, 89);
		pnTang6.add(btn603);
		
		JButton btn604 = new JButton("504");
		btn604.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn604.setFocusable(false);
		btn604.setBackground(Color.GREEN);
		btn604.setBounds(318, 15, 89, 89);
		pnTang6.add(btn604);
		
		JButton btn605 = new JButton("505");
		btn605.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn605.setFocusable(false);
		btn605.setBackground(Color.GREEN);
		btn605.setBounds(417, 15, 89, 89);
		pnTang6.add(btn605);
		
		JButton btn606 = new JButton("506");
		btn606.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn606.setFocusable(false);
		btn606.setBackground(Color.GREEN);
		btn606.setBounds(516, 15, 89, 89);
		pnTang6.add(btn606);
		
		JButton btn607 = new JButton("507");
		btn607.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn607.setFocusable(false);
		btn607.setBackground(Color.GREEN);
		btn607.setBounds(615, 15, 89, 89);
		pnTang6.add(btn607);
		
		JButton btn608 = new JButton("608");
		btn608.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn608.setFocusable(false);
		btn608.setBackground(Color.GREEN);
		btn608.setBounds(714, 15, 89, 89);
		pnTang6.add(btn608);
		
	}
}
