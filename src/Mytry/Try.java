package Mytry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Try extends JFrame {
	public Try(){
		setBounds(100,100,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c=getContentPane();
				c.setLayout(null);

//		create method 1:
//		JComboBox<String> combobox =new JComboBox<>();
//		combobox.addItem("id card");
//		combobox.addItem("stu card");
//		combobox.addItem("work card");

		String items[]= {"id ","stu ","work "};
		JComboBox<String> combobox =new JComboBox<>(items);
		combobox.setBounds(10,10,80,20);//窗体容器中设置位置 用setbounds
//	combobox.setLocation(getMousePosition());
		combobox.setEditable(true);//下拉列表可编辑(未找到则返回-1)
		c.add(combobox);
		combobox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("clicked!");
			}
		});

		JButton btn=new JButton("print");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("index:"+combobox.getSelectedIndex());//获取选中的索引
				System.out.println("item:"+combobox.getSelectedItem());//获取选中的值


			}
		});
		btn.setBounds(100,10,100,20);//默认布局（绝对布局） 需要设置组件的位置和大小
		c.add(btn);
		setVisible(true);

	}
    public static void main(String[] args) {
		new Try();

    }

}
