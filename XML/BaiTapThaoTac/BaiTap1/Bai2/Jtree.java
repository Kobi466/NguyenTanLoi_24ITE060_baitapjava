package XML.BaiTapThaoTac.BaiTap1.Bai2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Jtree {
    public static void main(String[] args) {
        try {
            // Khởi tạo DocumentBuilderFactory để tạo DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Đọc và phân tích file XML thành đối tượng Document
            Document document = builder.parse("src/XML/BaiTap1/Bai2/products.xml");

            // Gọi hàm tạo cây từ phần tử gốc của XML
            DefaultMutableTreeNode root = createTree(document.getDocumentElement());

            // Tạo đối tượng JTree để hiển thị cây XML
            JTree tree = new JTree(root);

            // Tạo JFrame để chứa JTree
            JFrame frame = new JFrame("XML Tree Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Đóng cửa sổ sẽ kết thúc chương trình
            frame.add(new JScrollPane(tree)); // Đặt cây vào trong JScrollPane để hỗ trợ cuộn
            frame.setSize(300, 400); // Thiết lập kích thước cửa sổ
            frame.setVisible(true); // Hiển thị cửa sổ
        } catch (Exception e) {
            // In lỗi ra console nếu có lỗi xảy ra khi đọc file XML
            e.printStackTrace();
        }
    }

    /**
     * Hàm đệ quy tạo cây từ một nút XML.
     *
     * @param node Nút XML hiện tại
     * @return DefaultMutableTreeNode - Nút tương ứng trong JTree
     */
    public static DefaultMutableTreeNode createTree(Node node) {
        // Tạo một nút trong JTree với tên là tên của nút XML
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(node.getNodeName());

        // Lấy danh sách các nút con của nút hiện tại
        NodeList nodeList = node.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node childNode = nodeList.item(i);

            // Chỉ xử lý các nút là phần tử (ELEMENT_NODE), bỏ qua text node hoặc comment
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                treeNode.add(createTree(childNode)); // Đệ quy để xử lý nút con
            }
        }

        return treeNode; // Trả về nút đã tạo
    }
}
