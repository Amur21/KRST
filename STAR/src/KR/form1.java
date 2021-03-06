package KR;
/**
 * объявление пакета
 *
/**
 * Импорт библиотек классов, необходимых для работы.
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
/**
 * Объявление публичного класса, наследующего члены класса JFrame, для создания окна 
 */
public class form1 extends JFrame {
	int k1;
	int k2;
	int k3;
	float r1;
	float result;
	int s1,s2,count1=220;
	/**
	 * Метод, отвечающий за запуск фрейма
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 frame = new form1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		/**
	 * Объявление метода, в котором объявляются элементы экранной формы, ее события
	 */
	public form1() {
		/**
		 * Создание главной панели
		 */
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(BorderFactory.createTitledBorder("Для жилых помещений"));
		/**
		 * Создание панелей для: 
		 * выпадающих списков и меток
		 * кнопки
		 */
		JPanel Panel1 = new JPanel(new GridLayout(8, 1));
		Panel1.setBounds(10,15,280,200);
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(300,15,350,200);
		/**
		 * Задание шрифта и размера надписей для кнопок, меток, переключателей
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 18);
		/**
		 * Создание меток 
		 */
		JLabel label_1 = new JLabel("Максимальная мощность, Вт");
		label_1.setFont(font);
		JLabel label_2 = new JLabel("Напряжение сети, В");
		label_2.setFont(font);
		final JLabel label_4 = new JLabel("");
		label_4.setBounds(50, 60, 350, 20);
		label_4.setFont(font);
		JLabel label_5 = new JLabel("");
		label_5.setBounds(80, 150, 350, 20);
		label_5.setFont(font);
		/**
		 * создание маски ввода 
		 */
		NumberFormat number = new DecimalFormat("##0.##");//маска ввода
		/**
		 * Создание текстовый полей 
		 */
		final JFormattedTextField TxtBox = new JFormattedTextField(new NumberFormatter(number));//специальное текстовое поле для контроля ввода
		TxtBox.setFont(font);
		JFormattedTextField TxtBox_1 = new JFormattedTextField(new NumberFormatter(number));
		TxtBox_1.setFont(font);
		JFormattedTextField TxtBox_2 = new JFormattedTextField(new NumberFormatter(number));
		TxtBox_2.setFont(font);
		JFormattedTextField TxtBox_3 = new JFormattedTextField(new NumberFormatter(number));
		TxtBox_3.setFont(font);
		/**
		 * Создание кнопки
		 */
		JButton btnNewButton = new JButton("Рассчитать");
		btnNewButton.setFont(font);
		btnNewButton.setBounds(50, 20, 140, 40);
		/**
		 * Добавление элементов на панель для текстовых полей
		 */
		Panel1.add(label_1);
		Panel1.add(TxtBox);
		Panel1.add(label_2);
		Panel1.add(TxtBox_1);
		//Panel1.add(TxtBox_2);
		TxtBox_1.setText(String.valueOf(count1));
		TxtBox_1.disable();
		/**
		 * Добавление элементов на панель для кнопки
		 */
		Panel2.add(btnNewButton);
		Panel2.add(label_4);
		Panel2.add(label_5);
		/**
		 * Добавление элементов на главную панель
		 */
