package XML.BaiTapGUI;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;

public class Main extends JFrame {
    private javax.swing.JTextField authorText;
    private javax.swing.JTextField genreText;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField pageText;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField publisherText;
    private javax.swing.JTextField titleText;
    private javax.swing.JTextField yearText;

    public Main() {
        this.initComponents();
        loadDuLieu();
        this.setVisible(true);
    }

    private void initComponents() {
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        authorText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        publisherText = new javax.swing.JTextField();
        pageText = new javax.swing.JTextField();
        genreText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btThem.setText("Them");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerThem();
                loadDuLieu();
                lamTrong();
                JOptionPane.showMessageDialog(null, "Ban da them 1 quyen sach thanh cong");
            }
        });

        btSua.setText("Sua");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerSua();
                JOptionPane.showMessageDialog(null, "Ban da cap nhap thanh cong");
            }
        });

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controllerXoa();
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title", "Author", "Year", "Publisher", "Pages", "Genre", "Price"}));

        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jTable1.getSelectedRow(); // Lấy dòng được chọn
                if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn không
                    titleText.setText(jTable1.getValueAt(selectedRow, 0).toString());
                    authorText.setText(jTable1.getValueAt(selectedRow, 1).toString());
                    yearText.setText(jTable1.getValueAt(selectedRow, 2).toString());
                    publisherText.setText(jTable1.getValueAt(selectedRow, 3).toString());
                    pageText.setText(jTable1.getValueAt(selectedRow, 4).toString());
                    genreText.setText(jTable1.getValueAt(selectedRow, 5).toString());
                    priceText.setText(jTable1.getValueAt(selectedRow, 6).toString());
                    vt = selectedRow;
                }
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Title");

        jLabel2.setText("Author");

        jLabel3.setText("Year");

        jLabel4.setText("Publisher");

        jLabel5.setText("Pages");

        jLabel6.setText("Genre");

        jLabel7.setText("Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(authorText)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(yearText)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(publisherText)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(pageText)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(genreText).addComponent(priceText))))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(publisherText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(pageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(genreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))));


        jLabel1.getAccessibleContext().setAccessibleName("titleLabel");
        titleText.getAccessibleContext().setAccessibleName("titleText");
        authorText.getAccessibleContext().setAccessibleName("authorText");
        authorText.getAccessibleContext().setAccessibleDescription("");
        yearText.getAccessibleContext().setAccessibleName("YearText");
        publisherText.getAccessibleContext().setAccessibleName("publisherText");
        pageText.getAccessibleContext().setAccessibleName("pageText");
        genreText.getAccessibleContext().setAccessibleName("genreText");
        priceText.getAccessibleContext().setAccessibleName("priceText");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(0, 0, Short.MAX_VALUE)).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)).addContainerGap()));

        btThem.getAccessibleContext().setAccessibleName("themBt");
        btSua.getAccessibleContext().setAccessibleName("suaBt");
        btXoa.getAccessibleContext().setAccessibleName("xoaBt");

        pack();
    }

    Document document;
    String file = "C:\\Users\\ADMIN\\Documents\\JavaProject\\JavaII\\src\\XML\\BaiTapGUI\\Books.xml";

    public void taiFile() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            document = db.parse(file);
            document.getDocumentElement().normalize();
            System.out.println("Tải file thành công!");
        } catch (Exception e) {
            tbLoi(e);
        }
    }

    public void tbLoi(Exception ex) {
        JOptionPane.showMessageDialog(null, "Loi: " + ex.getMessage());
    }

    void loadDuLieu() {
        taiFile();
        if (document == null) {
            System.out.println("Lỗi: document chưa được khởi tạo!");
            return;
        }
        Vector vTable = new Vector();
        NodeList dsBook = document.getElementsByTagName("book");

        for (int i = 0; i < dsBook.getLength(); i++) {
            Vector vRow = new Vector();
            Element book = (Element) dsBook.item(i);

//            String title = book.getElementsByTagName("title").item(0).getTextContent();
//            String author = book.getElementsByTagName("author").item(0).getTextContent();
//            String year = book.getElementsByTagName("year").item(0).getTextContent();
//            String publisher = book.getElementsByTagName("publisher").item(0).getTextContent();
//            String pages = book.getElementsByTagName("pages").item(0).getTextContent();
//            String genre = book.getElementsByTagName("genre").item(0).getTextContent();
//            String price = book.getElementsByTagName("price").item(0).getTextContent();
            String title = getElementText(book, "title");
            String author = getElementText(book, "author");
            String year = getElementText(book, "year");
            String publisher = getElementText(book, "publisher");
            String pages = getElementText(book, "pages");
            String genre = getElementText(book, "genre");
            String price = getElementText(book, "price");


            vRow.add(title);
            vRow.add(author);
            vRow.add(year);
            vRow.add(publisher);
            vRow.add(pages);
            vRow.add(genre);
            vRow.add(price);
            vTable.add(vRow);
        }

        Vector vHeader = new Vector();
        vHeader.add("Title");
        vHeader.add("Author");
        vHeader.add("Year");
        vHeader.add("Publisher");
        vHeader.add("Pages");
        vHeader.add("Genre");
        vHeader.add("Price");

        DefaultTableModel model = new DefaultTableModel(vTable, vHeader);
        jTable1.setModel(model);
    }

    private String getElementText(Element book, String tagName) {
        NodeList list = book.getElementsByTagName(tagName);
        if (list != null && list.getLength() > 0) {
            Node node = list.item(0);
            if (node != null) {
                return node.getTextContent();
            }
        }
        return "N/A";
    }


    String title, author, year, publisher, pages, genre, price;

    void layDl() {
        title = titleText.getText().trim();
        author = authorText.getText().trim();
        year = yearText.getText().trim();
        publisher = publisherText.getText().trim();
        pages = pageText.getText().trim();
        genre = genreText.getText().trim();
        price = priceText.getText().trim();
    }

    void lamTrong() {
        titleText.setText("");
        authorText.setText("");
        yearText.setText("");
        publisherText.setText("");
        pageText.setText("");
        genreText.setText("");
        priceText.setText("");
    }

    void controllerThem() {
        try {
            layDl();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Element bookElement = document.createElement("book");
        bookElement.appendChild(createElement("title", title));
        bookElement.appendChild(createElement("author", author));
        bookElement.appendChild(createElement("year", year));
        bookElement.appendChild(createElement("publisher", publisher));
        bookElement.appendChild(createElement("pages", pages));
        bookElement.appendChild(createElement("genre", genre));
        bookElement.appendChild(createElement("price", price));

        Element rootElement = document.getDocumentElement();
        rootElement.appendChild(bookElement);

        saveXMLFile();
    }

    private Element createElement(String tagName, String value) {
        Element element = document.createElement(tagName);
        element.setTextContent(value);
        return element;
    }

    void saveXMLFile() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/XML/BaiTapGUI/Books.xml"));

            transformer.transform(source, result);

            System.out.println("Lưu XML thành công!");
        } catch (Exception e) {
            tbLoi(e);
        }
    }

    void controllerXoa() {
        String tenSach = titleText.getText().trim();

        if (tenSach.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tiêu đề sách cần xóa!");
            return;
        }

        NodeList dsBook = document.getElementsByTagName("book");
        boolean found = false;

        for (int i = 0; i < dsBook.getLength(); i++) {
            Element book = (Element) dsBook.item(i);
            String title = book.getElementsByTagName("title").item(0).getTextContent();

            if (title.equalsIgnoreCase(tenSach)) {
                book.getParentNode().removeChild(book);
                saveXMLFile();
                JOptionPane.showMessageDialog(this, "Đã xóa sách: " + tenSach);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sách có tiêu đề: " + tenSach);
        }

        loadDuLieu();
    }

    int vt = -1;

    void controllerSua() {
        if (vt == -1) {
            JOptionPane.showMessageDialog(null, "Xin chọn tiêu đề để sửa");
            return;
        }

        NodeList dsBook = document.getElementsByTagName("book");
        for (int i = 0; i < dsBook.getLength(); i++) {
            Element book = (Element) dsBook.item(i);
            String currentTitle = book.getElementsByTagName("title").item(0).getTextContent();
            if (currentTitle.equals(jTable1.getValueAt(vt, 0).toString())) {
                book.getElementsByTagName("title").item(0).setTextContent(titleText.getText().trim());
                book.getElementsByTagName("author").item(0).setTextContent(authorText.getText().trim());
                book.getElementsByTagName("year").item(0).setTextContent(yearText.getText().trim());
                book.getElementsByTagName("publisher").item(0).setTextContent(publisherText.getText().trim());
                book.getElementsByTagName("pages").item(0).setTextContent(pageText.getText().trim());
                book.getElementsByTagName("genre").item(0).setTextContent(genreText.getText().trim());
                book.getElementsByTagName("price").item(0).setTextContent(priceText.getText().trim());
                break;
            }
        }
        saveXMLFile();
        loadDuLieu();
    }


    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}