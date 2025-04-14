package XML.BaiTapThaoTac.BaiTap2.Bai3_Bai4;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
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

public class Students {
    static Scanner sc = new Scanner(System.in);
    static File file = new File("src/XML/BaiTap2/Bai3_Bai4/students.xml");
    static Document doc;

    public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException, SAXException {
        Menu(sc);
    }

    static void Menu(Scanner sc) throws ParserConfigurationException, IOException, TransformerException, SAXException {
        int choice = 0;
        do {
            System.out.println("1. Ghi 1 sinh vien vao file");
            System.out.println("2. Xoa 1 sinh vien ( id )");
            System.out.println("3. Cap nhap 1 sinh vien ( id )");
            System.out.println("4. In danh sach sinh vien");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("------------------------------------");
                System.out.println("Id: ");
                sc.nextLine();
                String id = sc.nextLine();
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Ma sinh vien: ");
                String maSV = sc.nextLine();
                System.out.println("Lop: ");
                String lop = sc.nextLine();
                writeXML(id, name, maSV, lop);
                System.out.println("------------------------------------");
            } else if (choice == 2) {
                System.out.println("------------------------------------");
                System.out.println("Nhap id can xoa: ");
                sc.nextLine();
                String findId = sc.nextLine();
                xoa(findId);
                System.out.println("------------------------------------");
            } else if (choice == 3) {
                System.out.println("------------------------------------");
                System.out.println("Nhap id can update: ");
                sc.nextLine();
                String findId = sc.nextLine();
                update(findId);
                System.out.println("------------------------------------");
            } else if (choice == 4) {
                read();
            }
        } while (choice > 0 && choice <= 4);
    }

    static void writeXML(String id, String name, String maSV, String lop) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Element root;
        if (file.exists()) {
            doc = builder.parse(file);
            root = doc.getDocumentElement();
        } else {
            doc = builder.newDocument();
            root = doc.createElement("students");
            doc.appendChild(root);
        }
        Element student = doc.createElement("student");
        student.setAttribute("id", id);
        Element nameStudent = doc.createElement("name");
        nameStudent.appendChild(doc.createTextNode(name));
        Element maSVStudent = doc.createElement("maSV");
        maSVStudent.appendChild(doc.createTextNode(maSV));
        Element lopStudent = doc.createElement("lop");
        lopStudent.appendChild(doc.createTextNode(lop));
        student.appendChild(nameStudent);
        student.appendChild(maSVStudent);
        student.appendChild(lopStudent);
        root.appendChild(student);
        save();
    }

    static void save() throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }

    static void read() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        doc = builder.parse(file);
        NodeList listStudents = doc.getElementsByTagName("student");
        for (int i = 0; i < listStudents.getLength(); i++) {
            Element student = (Element) listStudents.item(i);
            String id = student.getAttribute("id");
            String name = student.getElementsByTagName("name").item(0).getTextContent();
            String maSV = student.getElementsByTagName("maSV").item(0).getTextContent();
            String lop = student.getElementsByTagName("lop").item(0).getTextContent();
            System.out.println("------------------------------------");
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Student Ma sinh vien: " + maSV);
            System.out.println("Student Lop: " + lop);
            System.out.println("------------------------------------");
        }
    }

    static void xoa(String findID) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        doc = builder.parse(file);
        NodeList listStudents = doc.getElementsByTagName("student");
        boolean ktr = false;
        for (int i = 0; i < listStudents.getLength(); i++) {
            Element student = (Element) listStudents.item(i);
            String id = student.getAttribute("id");
            if (id.equals(findID)) {
                student.getParentNode().removeChild(student);
                ktr = true;
            }
        }
        if (ktr) {
            save();
        } else {
            System.out.println("Khong tim thay id sinh vien");
        }
    }

    static void update(String finID) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilder builder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
        doc = builder.parse(file);
        NodeList listStudents = doc.getElementsByTagName("student");
        boolean ktr = false;
        for (int i = 0; i < listStudents.getLength(); i++) {
            Element student = (Element) listStudents.item(i);
            String id = student.getAttribute("id");
            int choice = 0;
            if (id.equals(finID)) {
                ktr = true;
                String name, maSV, lop;
                do {
                    System.out.println("1.Update student name");
                    System.out.println("2.Update student maSV");
                    System.out.println("3.Update student lop");
                    System.out.println("4.EXit");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Nhap ten sinh vien can update: ");
                        sc.nextLine();
                        name = sc.nextLine();
                        student.getElementsByTagName("name").item(0).setTextContent(name);
                        save();
                        System.out.println("Update thanh cong ten cho sinh vien");
                    } else if (choice == 2) {
                        System.out.println("Nhap ma sinh vien can update: ");
                        sc.nextLine();
                        maSV = sc.nextLine();
                        student.getElementsByTagName("maSV").item(0).setTextContent(maSV);
                        save();
                        System.out.println("Update thanh cong ma sinh vien cho sinh vien");
                    } else if (choice == 3) {
                        System.out.println("Nhap lop vien can update: ");
                        sc.nextLine();
                        lop = sc.nextLine();
                        student.getElementsByTagName("lop").item(0).setTextContent(lop);
                        save();
                        System.out.println("Update thanh cong lop cho sinh vien");
                    }
                } while (choice > 0 && choice < 4);
            }
            if (ktr) {
                System.out.println("Khong tim thay id sinh vien");
            }
        }
    }
}
