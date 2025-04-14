package XML.BaiTapThaoTac.BaiTap1.Bai1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ModelDOM {
    public static void main(String[] args) {
        try {
            // Tạo DocumentBuilderFactory để thiết lập môi trường đọc file XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Tạo DocumentBuilder để phân tích file XML
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Phân tích tài liệu XML thành đối tượng Document (Chứa toàn bộ cây XML)
            Document document = builder.parse("src/XML/BaiTap1/Bai1/products.xml");

            // Lấy danh sách tất cả các phần tử <product> trong file XML
            NodeList productList = document.getElementsByTagName("product");

            // Duyệt qua danh sách các phần tử <product>
            for (int i = 0; i < productList.getLength(); i++) {
                // Ép kiểu Node về Element để dễ dàng thao tác
                Element product = (Element) productList.item(i);

                // Lấy nội dung của thẻ <name> bên trong <product>
                String name = product.getElementsByTagName("name").item(0).getTextContent();

                // Lấy nội dung của thẻ <price> bên trong <product>
                String price = product.getElementsByTagName("price").item(0).getTextContent();

                // In thông tin sản phẩm ra màn hình
                System.out.println("Product: " + name + ", Price: " + price);
            }
        } catch (Exception e) {
            // Bắt và in lỗi nếu có vấn đề trong quá trình đọc file XML
            e.printStackTrace();
        }
    }
}
