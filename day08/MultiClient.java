package day08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient extends JFrame implements ActionListener, Runnable {
	JTextArea jta;
	JPanel jp;
	JTextField jf;
	JButton jbt;
	Socket sock;
	DataInputStream dis;
	DataOutputStream dos;

	public MultiClient() {
		setTitle("멀티 채팅 클라이언트");
		jta = new JTextArea();
		jp = new JPanel();
		jf = new JTextField(20);
		jbt = new JButton("전송");
		jbt.addActionListener(this);
		jp.add(jf);
		jp.add(jbt);
		add(jta, "Center");
		add(jp, "South");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		///////////////////////////////////////////////////
		Thread thread = new Thread(this);
		thread.start();
		//////////////////////////////////////////////////
	}

	public static void main(String[] args) {
		new MultiClient();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		if (obj == jbt) {
			try {
				dos.writeUTF(jf.getText().toString());
				jta.setText("나: " + jf.getText() + "\n" + jta.getText());
				jf.setText("");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// 서버소켓 연결하고, 상대방 메세지 읽어와서 출력하기
		try {
			sock = new Socket("127.0.0.1", 9999);
			System.out.println("서버 연결 성공");
			dos = new DataOutputStream(sock.getOutputStream());
			dis = new DataInputStream(sock.getInputStream());
			while (true) {
				String msg = dis.readUTF().toString();
				jta.setText("상대방: " + msg + "\n" + jta.getText());
				System.out.println("Message: " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
