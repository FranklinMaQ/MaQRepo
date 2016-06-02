package maq.repository.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@ManagedBean(name="xpathParser")
@ViewScoped

public class XPathParser {

    public void Parse() throws XPathExpressionException {
        DocumentBuilderFactory builderFactory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = builderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
 Document xmlDocument = null;
        try {
          xmlDocument  = builder.parse(
                    new FileInputStream("c:\\xml\\uzytkowe.xml"));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        XPath xPath = XPathFactory.newInstance().newXPath();

        String expression = "/Repository/Apps/App";
    
        Node node = (Node) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODE);
        NodeList nodeList = null;

        if (null != node) {
            nodeList = node.getChildNodes();
            for (int i = 0; null != nodeList && i < nodeList.getLength(); i++) {
                Node nod = nodeList.item(i);
                if (nod.getNodeType() == Node.ELEMENT_NODE) {
                   NodeList ndl = nod.getChildNodes();
                  for(int x=0; x<ndl.getLength(); x++)
                  {
                      System.out.println(ndl.item(x).getFirstChild().getNodeValue());
                  }
                }
            }
        }
    }

}
