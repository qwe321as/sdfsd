import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

class JTablesub extends JFrame{
	String [] jtitle = {"���", "����", "�μ�"};
	Object [][] data = {{"1","���¿�","�λ��"}, {"2","������","�ѹ���"},{"3","��ȣ��","������"} };
	JTablesub(String title){
		super.setTitle(title);
		Container contententPane = getContentPane();
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTable table = new JTable(data,jtitle);
		int v =ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h =ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(table,v,h);
		contententPane.add(js,BorderLayout.CENTER);
		setVisible(true);
	}
}
public class Ex12_09_JTable {
	public static void main(String[] args) {
		JTablesub t = new JTablesub("Jtablesub");
	}
}