package XML.BaiTapThaoTac.BaiTap2.Bai2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Employee {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse ("src/XML/BaiTap2/Bai2/employee.xml");
            NodeList listEmloyee = document.getElementsByTagName("employee");
            for (int i = 0; i < listEmloyee.getLength(); i++) {
                Element employee = (Element) listEmloyee.item(i);
                String id = employee.getAttribute("id");
                String name = employee.getElementsByTagName("name").item(0).getTextContent();
                Element contact = (Element) employee.getElementsByTagName("contact").item(0);
                String contactemail = contact.getElementsByTagName("email").item(0).getTextContent();
                String contactphone = contact.getElementsByTagName("phone").item(0).getTextContent();
                Element department = (Element) employee.getElementsByTagName("department").item(0);
                String departName = department.getElementsByTagName("name").item(0).getTextContent();
                String departPhone = department.getElementsByTagName("location").item(0).getTextContent();
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Contact Email: " + contactemail);
                System.out.println("Contact Phone: " + contactphone);
                System.out.println("Department Name: " + departName);
                System.out.println("Department Location: " + departPhone);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
