package XML.BaiTapThaoTac.BaiTap2.Bai1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Major: ");
        String major = sc.nextLine();

        writeXML(id, name, age, major);
    }

    private static void writeXML(int id, String name, int age, String major) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        File file = new File("src/XML/BaiTap2/Bai1/students.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc;
        Element root;
        //neu file ton tai , load file moi
        if (file.exists()) {
            doc = builder.parse(file);
            root = doc.getDocumentElement();
        }else{
            //neu file chua ton tai tao file moi
            doc = builder.newDocument();
            root = doc.createElement("students");
            doc.appendChild(root);
        }
        //tao phan tu <student>
        Element student = doc.createElement("student");
        student.setAttribute("id", Integer.toString(id));
        //tao cac phan tu con trong <student>
        Element elementName = doc.createElement("name");
        elementName.appendChild(doc.createTextNode(name));
        Element elementAge = doc.createElement("age");
        elementAge.appendChild(doc.createTextNode(Integer.toString(age)));
        Element elementMajor = doc.createElement("major");
        elementMajor.appendChild(doc.createTextNode(major));
        //them student
        student.appendChild(elementName);
        student.appendChild(elementAge);
        student.appendChild(elementMajor);
        //them vao root
        root.appendChild(student);
        //gi du lieu vao file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
        System.out.println("Da luu thanh cong");
    }

}
