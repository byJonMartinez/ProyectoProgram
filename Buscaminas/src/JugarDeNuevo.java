import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JugarDeNuevo  extends JFrame{

	public JugarDeNuevo() {
		setTitle("¡Fin del Juego!");
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);


		JButton btnNewButton = new JButton("Si");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				InterfazTablero.getInterfazTablero().volverAJugar();
			}
		});
		btnNewButton.setBounds(72, 136, 99, 34);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(240, 136, 99, 34);
		getContentPane().add(btnNewButton_1);
		
		JLabel label_volver_jugar = new JLabel("¿Quieres volver a jugar?");
		label_volver_jugar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_volver_jugar.setEnabled(false);
		label_volver_jugar.setBounds(114, 52, 173, 50);
		getContentPane().add(label_volver_jugar);
		
}
	
}
