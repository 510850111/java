package explore;
import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.Container; 
import java.awt.FileDialog; 
import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.IOException; 
import java.net.URL; 
import javax.swing.JButton; 
import javax.swing.JEditorPane; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JMenu; 
import javax.swing.JMenuBar; 
import javax.swing.JMenuItem; 
import javax.swing.JOptionPane; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import javax.swing.JTextField; 
import javax.swing.JViewport; 
import javax.swing.event.HyperlinkEvent; 
import javax.swing.event.HyperlinkListener; 
import javax.swing.text.html.HTMLDocument; 
import javax.swing.text.html.HTMLFrameHyperlinkEvent; 
 
 
public class Browser extends JFrame implements ActionListener { 
 
    private Container contentPane; 
    // �ı���  
    private JTextField addressTex; 
    private JLabel statusLbl; 
    // ��ʼ��������  
    private JScrollPane centerPane; 
    // �༭��ʾ����  
    private JEditorPane textArea; 
    private JMenuBar munubar; 
 
    private JButton btgoto, btback; 
    private JMenu filemenu; 
    // �˵���  
    private JMenuItem itemopen, itemquit; 
 
    public Browser() { 
         
        super("123"); 
        setBounds(120, 80, 750, 500); 
        setDefaultCloseOperation(this.EXIT_ON_CLOSE); 
        contentPane = this.getContentPane(); 
         
        // ��ʼ���˵���  
        munubar = new JMenuBar(); 
        setJMenuBar(munubar); 
        // ��ʼ���˵�  
        filemenu = new JMenu("�ļ�"); 
        // ���˵�����˵���  
        munubar.add(filemenu); 
 
        // ��ʼ���˵���  
        itemopen = new JMenuItem("��"); 
        itemopen.addActionListener(this); 
        itemquit = new JMenuItem("�ر�"); 
        itemquit.addActionListener(this); 
        // ���˵�����뵽file�˵�  
        filemenu.add(itemopen); 
        filemenu.add(itemquit); 
 
        contentPane.setLayout(new BorderLayout()); 
        // ��ַ��  
        addressTex = new JTextField(40);         
 
        btgoto = new JButton("ת��"); 
        btgoto.addActionListener(this); 
        btback = new JButton("����"); 
        btback.addActionListener(this); 
        JPanel toolpanel = new JPanel(); 
        // ������ɫ  
        toolpanel.setBackground(Color.pink); 
        toolpanel.setLayout(new FlowLayout()); 
        toolpanel.add(btback); 
        toolpanel.add(addressTex); 
        toolpanel.add(btgoto); 
 
        contentPane.add(toolpanel, BorderLayout.NORTH); 
 
        // ״̬��  
        statusLbl = new JLabel("status: "); 
        contentPane.add(statusLbl, BorderLayout.SOUTH); 
        // ������岿  
        centerPane = new JScrollPane(); 
        // ��ʾ����  
        JViewport view = centerPane.getViewport(); 
        // ������ʾ  
        textArea = new JEditorPane(); 
        // ����������,ʹ����Ч  
        textArea.addHyperlinkListener(new HyperlinkListener() { 
            public void hyperlinkUpdate(HyperlinkEvent e) { 
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) { 
                    JEditorPane pane = (JEditorPane) e.getSource(); 
                    statusLbl.setText(e.getURL().toString()); 
                    if (e instanceof HTMLFrameHyperlinkEvent) { 
                        HTMLFrameHyperlinkEvent evt = (HTMLFrameHyperlinkEvent) e; 
                        HTMLDocument doc = (HTMLDocument) pane.getDocument(); 
                        doc.processHTMLFrameHyperlinkEvent(evt); 
                    } else { 
                        try { 
                            pane.setPage(e.getURL()); 
                        } catch (Throwable t) { 
                            t.printStackTrace(); 
                        } 
                    } 
                } 
            } 
        }); 
        addressTex.setText("http://blog.sina.com.cn/myhrr"); 
        // ���ò���д����http://www.baidu.com/  
        textArea.setEditable(false); 
        view.add(textArea); 
        contentPane.add(centerPane); 
 
    } 
 
    public void actionPerformed(ActionEvent e) { 
         
        //��ת��������  
        if (e.getSource() == btgoto) { 
            String address = addressTex.getText().trim(); 
            statusLbl.setText(address); 
            try { 
                if (addressTex.getText().length() > 0 
                        && (addressTex.getText().startsWith("http://"))||addressTex.getText
().startsWith("file:")) 
                   textArea.setPage(address); 
                else if (addressTex.getText().length() > 0 
                        && !addressTex.getText().startsWith("http://")) { 
                    String newURL = ""; 
                    newURL = "http://" + addressTex.getText(); 
                    URL newurl = new URL(newURL); 
                    addressTex.setText(newURL); 
                    textArea.setPage(newurl); 
                } 
            } catch (IOException e1) { 
                e1.printStackTrace(); 
            } 
        }// end btgoto  
 
        //�����ء�����  
        if (e.getSource() == btback) { 
            String address = addressTex.getText().trim(); 
            try { 
                if (addressTex.getText().length() > 0 
                        && addressTex.getText().startsWith("http://")) 
                    textArea.setPage(address); 
                else if (addressTex.getText().length() > 0 
                        && !addressTex.getText().startsWith("http://")) { 
                    String newURL = ""; 
                    newURL = "http://" + addressTex.getText();// ��http: 
                    textArea.setPage(newURL); 
                } 
            } catch (IOException e1) { 
                e1.printStackTrace(); 
            } 
        }// end btback  
         
        //���򿪡�����  
        if(e.getSource()==itemopen){ 
             
           FileDialog fd = new FileDialog(new JFrame(), "Open a file", 
                    FileDialog.LOAD); 
            fd.setVisible(true); 
            String name = fd.getFile();          
            try { 
                URL url = new URL("file" + ":///" + fd.getDirectory() + name); 
                addressTex.setText(url.toString()); 
            } catch (Exception e1) { 
                JOptionPane.showMessageDialog(null, "��ʧ��!", "openopen���ļ�", 
                        JOptionPane.ERROR_MESSAGE); 
            } 
             
        }//end itemopen  
         
        //���˳�������  
        if(e.getSource()==itemquit){ 
            System.exit(0); 
        }//end itemquit  
         
    }//end actionPerformed  
     
     
    public static void main(String[] args) { 
        Browser bro = new Browser(); 
        bro.setVisible(true); 
    } 
} 