package XML.BaiTapThaoTac.BaiTap1.Bai5;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class XSL {
    public static void main(String[] args) {
        try{
            TransformerFactory factory = TransformerFactory.newInstance();
            //Tao Tranformer tu xsl
            Source xslt = new StreamSource("src/XML/BaiTap1/Bai5/products.xsl");
            Transformer transformer = factory.newTransformer(xslt);
            // Chuyển đổi XML thành HTML
            Source xml = new StreamSource("src/XML/BaiTap1/Bai2/products.xml");
            transformer.transform(xml, new StreamResult(new File("src/XML/BaiTap1/Bai5/ouput.html")));
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
