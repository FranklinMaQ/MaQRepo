
package maq.repository.Utilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XPathLinksParser {
    
    public XPathLinksParser(){}
    
    /**
     *
     * @param fileName
     * @param appName
     * @return 
     * @throws SAXException
     * 
     * Zwraca haszmapę linków dla danej aplikacji
     */
    public Map<String, String> Parse(String fileName, String appName) throws SAXException
    {
     Map<String, String> linki = new HashMap<>();
        
          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
            doc = builder.parse(fileName);

            // Create XPathFactory object
            XPathFactory xpathFactory = XPathFactory.newInstance();

            // Create XPath object
            XPath xpath = xpathFactory.newXPath();

          

          linki = getLinksForApp(doc, xpath, appName);
          
          

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
         return linki;
    }
    
     private Map<String, String> getLinksForApp(Document doc, XPath xpath, String appName) {
       Map<String, String> linki = new HashMap<String, String>();
        try {
         // version selector
            XPathExpression getVersionAttributes = xpath.compile("/Repository/Apps/App[Name='" + appName + "']/Links/Link/@version");
            //links 
            XPathExpression getVersionValues = xpath.compile("/Repository/Apps/App[Name='" + appName + "']/Links/Link[@version]/text()");
        
            NodeList nodesAtrribute = (NodeList) getVersionAttributes.evaluate(doc, XPathConstants.NODESET);
             NodeList nodesValues = (NodeList) getVersionValues.evaluate(doc, XPathConstants.NODESET);
             
            for (int i = 0; i < nodesAtrribute.getLength(); i++)
            {
                linki.put(nodesAtrribute.item(i).getNodeValue(), nodesValues.item(i).getNodeValue());
                
            }
            
            System.out.println("MAPA: " + linki.size());
            
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return linki;
    }
    
}
