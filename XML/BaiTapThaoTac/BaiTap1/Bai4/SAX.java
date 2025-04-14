package XML.BaiTapThaoTac.BaiTap1.Bai4;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAX {
    public static void main(String[] args) {
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    System.out.println("Start Element: " + qName);
                }
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    System.out.println("End Element: " + qName);
                }
                public void characters(char[] chars, int start, int length) throws SAXException {
                    System.out.println("Characters: " + new String(chars, start, length));
                }
            };
            parser.parse("src/XML/BaiTap1/Bai2/products.xml", handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
