package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GDChinh extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GDChinh window = new GDChinh();
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
	public GDChinh() {
		setFont(new Font("Dialog", Font.BOLD, 20));
		setTitle("CHỨC NĂNG CHÍNH");
		setBounds(100, 100, 940, 644);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
//		frame.setUndecorated(true); 
//		frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		setLocationRelativeTo(null);
		
		JPanel pnChinh = new JPanel();
		pnChinh.setBounds(0, 0, 926, 605);
		getContentPane().add(pnChinh);
		pnChinh.setLayout(null);
		
		JButton btnQLTP = new JButton("");
		btnQLTP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GDThuePhong().setVisible(true);
				dispose();
			}
		});
		Image imgQLTP = new ImageIcon(this.getClass().getResource("/img/qltp.png")).getImage().getScaledInstance(232, 211, Image.SCALE_SMOOTH);
		btnQLTP.setIcon(new ImageIcon(imgQLTP));
		btnQLTP.setBounds(0, 76, 232, 211);
		pnChinh.add(btnQLTP);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ THUÊ PHÒNG");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 287, 231, 53);
		pnChinh.add(lblNewLabel);
		
		JButton btnQLTraPhong = new JButton("");
		btnQLTraPhong.setBounds(230, 76, 232, 211);
		Image imgQLTraPhong = new ImageIcon(this.getClass().getResource("/img/qltraphong.png")).getImage().getScaledInstance(232, 211, Image.SCALE_SMOOTH);
		btnQLTraPhong.setIcon(new ImageIcon(imgQLTraPhong));
		pnChinh.add(btnQLTraPhong);
		
		JLabel lblQLTraPhong = new JLabel("QUẢN LÝ TRẢ PHÒNG");
		lblQLTraPhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblQLTraPhong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQLTraPhong.setBounds(231, 287, 231, 53);
		pnChinh.add(lblQLTraPhong);
		
		JButton btnHuyThuePhong = new JButton("");
		btnHuyThuePhong.setBounds(461, 76, 232, 211);
		Image imgHuyThuePhong = new ImageIcon(this.getClass().getResource("/img/huythuephong.png")).getImage().getScaledInstance(250, 211, Image.SCALE_SMOOTH);
		btnHuyThuePhong.setIcon(new ImageIcon(imgHuyThuePhong));
		pnChinh.add(btnHuyThuePhong);
		
		JLabel lblHuyThuePhong = new JLabel("HỦY THUÊ PHÒNG");
		lblHuyThuePhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblHuyThuePhong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHuyThuePhong.setBounds(461, 287, 231, 53);
		pnChinh.add(lblHuyThuePhong);
		
		JButton btnQLP = new JButton("");
		btnQLP.setBounds(0, 340, 232, 211);
		Image imgQLP = new ImageIcon(this.getClass().getResource("/img/qlp.png")).getImage().getScaledInstance(232, 211, Image.SCALE_SMOOTH);
		btnQLP.setIcon(new ImageIcon(imgQLP));
//		btnQLP.setBorderPainted(false);
//		btnQLP.setContentAreaFilled (false);
		pnChinh.add(btnQLP);
		
		JLabel lblQLP = new JLabel("QUẢN LÝ PHÒNG");
		lblQLP.setHorizontalAlignment(SwingConstants.CENTER);
		lblQLP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQLP.setBounds(0, 550, 231, 53);
		pnChinh.add(lblQLP);
		
		JButton btnQLDV = new JButton("");
		btnQLDV.setBounds(230, 340, 232, 211);
		pnChinh.add(btnQLDV);
		
		JLabel lblQLDV = new JLabel("QUẢN LÝ DỊCH VỤ");
		lblQLDV.setHorizontalAlignment(SwingConstants.CENTER);
		lblQLDV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQLDV.setBounds(231, 551, 231, 53);
		Image imgQLDV = new ImageIcon(this.getClass().getResource("/img/qldv.png")).getImage().getScaledInstance(232, 211, Image.SCALE_SMOOTH);
		btnQLDV.setIcon(new ImageIcon(imgQLDV));
		pnChinh.add(lblQLDV);
		
		JButton btnQLKH = new JButton("");
		btnQLKH.setBounds(461, 340, 232, 211);
		Image imgQLKH = new ImageIcon(this.getClass().getResource("/img/qlkh.png")).getImage().getScaledInstance(232, 211, Image.SCALE_SMOOTH);
		btnQLKH.setIcon(new ImageIcon(imgQLKH));
		pnChinh.add(btnQLKH);
		
		JLabel lblQLKH = new JLabel("QUẢN LÝ KHÁCH HÀNG");
		lblQLKH.setHorizontalAlignment(SwingConstants.CENTER);
		lblQLKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQLKH.setBounds(462, 551, 231, 53);
		pnChinh.add(lblQLKH);
		
		JButton btnThongKe = new JButton("");
		btnThongKe.setBounds(692, 76, 232, 211);
		Image imgThongKe = new ImageIcon(this.getClass().getResource("/img/thongke.png")).getImage().getScaledInstance(232, 211, Image.SCALE_SMOOTH);
		btnThongKe.setIcon(new ImageIcon(imgThongKe));
		pnChinh.add(btnThongKe);
		
		JButton btnQLNV = new JButton("");
		btnQLNV.setBounds(692, 340, 232, 211);
		Image imgQLNV = new ImageIcon(this.getClass().getResource("/img/qlnv.png")).getImage().getScaledInstance(232, 211, Image.SCALE_SMOOTH);
		btnQLNV.setIcon(new ImageIcon(imgQLNV));
		pnChinh.add(btnQLNV);
		
		JLabel lblThongKe = new JLabel("THỐNG KÊ");
		lblThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThongKe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThongKe.setBounds(693, 287, 231, 53);
		pnChinh.add(lblThongKe);
		
		JLabel lblQLNV = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblQLNV.setHorizontalAlignment(SwingConstants.CENTER);
		lblQLNV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQLNV.setBounds(693, 551, 231, 53);
		pnChinh.add(lblQLNV);
		
		JPanel pnTieuDe = new JPanel();
		pnTieuDe.setBackground(new Color(128, 128, 128));
		pnTieuDe.setBounds(0, 0, 924, 77);
		pnChinh.add(pnTieuDe);
		pnTieuDe.setLayout(null);
		
		JLabel lblTieuDe = new JLabel("KHÁCH SẠN TÂM BÌNH");
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setBounds(0, 11, 924, 66);
		lblTieuDe.setFont(new Font("Sitka Small", Font.BOLD, 35));
		lblTieuDe.setForeground(new Color(255, 165, 0));
		pnTieuDe.add(lblTieuDe);
		
		JLabel lblTenTaiKhoan = new JLabel("username01");
		lblTenTaiKhoan.setForeground(new Color(255, 255, 255));
		lblTenTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		lblTenTaiKhoan.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTenTaiKhoan.setBounds(720, 6, 120, 14);
		pnTieuDe.add(lblTenTaiKhoan);
		
		JLabel lblDangXuat = new JLabel("Đăng xuất");
		lblDangXuat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int thoat = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất khỏi tài khoản " + lblTenTaiKhoan.getText() + " không?", "Nhắc nhở", JOptionPane.YES_NO_OPTION);
				if(thoat == JOptionPane.YES_OPTION) {
					new GDDangNhap().setVisible(true);
					dispose();
				}	
			}
		});
		lblDangXuat.setForeground(new Color(0, 0, 255));
		lblDangXuat.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDangXuat.setHorizontalAlignment(SwingConstants.CENTER);
		lblDangXuat.setBounds(835, 0, 82, 26);
		pnTieuDe.add(lblDangXuat);
	}
}
