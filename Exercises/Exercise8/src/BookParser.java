import org.w3c.dom.*;
import org.xml.sax.InputSource;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class BookParser {

    public static void main(String[] args) throws Exception {

        String xmlData = "<BookShelf>\n" +
                "    <Book>\n" +
                "        <title>Hunchback of notre-dame</title>\n" +
                "        <publishedYear>2018</publishedYear>\n" +
                "        <numberOfPages>500</numberOfPages>\n" +
                "        <authors>\n" +
                "            <author>John Doe</author>\n" +
                "            <author>Jane Smith</author>\n" +
                "        </authors>\n" +
                "    </Book>\n" +
                "    <Book>\n" +
                "        <title>The Three Musketeers</title>\n" +
                "        <publishedYear>2020</publishedYear>\n" +
                "        <numberOfPages>300</numberOfPages>\n" +
                "        <authors>\n" +
                "            <author>Emily White</author>\n" +
                "        </authors>\n" +
                "    </Book>\n" +
                "    <Book>\n" +
                "        <title>Anna Karenina</title>\n" +
                "        <publishedYear>2021</publishedYear>\n" +
                "        <numberOfPages>350</numberOfPages>\n" +
                "        <authors>\n" +
                "            <author>Mike Brown</author>\n" +
                "        </authors>\n" +
                "    </Book>\n" +
                "</BookShelf>";
        Document xmlDocument = parseXML(xmlData);
        addNewBookToXML(xmlDocument, "THREE DAYS TO SEE", 1993, 400, new String[]{"Helen Keller"});
        printXML(xmlDocument);

        
        String jsonData = "{\n" +
                "  \"BookShelf\": [\n" +
                "    {\n" +
                "      \"title\": \"Hunchback of notre-dame\",\n" +
                "      \"publishedYear\": 2018,\n" +
                "      \"numberOfPages\": 500,\n" +
                "      \"authors\": [\"John Doe\", \"Jane Smith\"]\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"The Three Musketeers\",\n" +
                "      \"publishedYear\": 2020,\n" +
                "      \"numberOfPages\": 300,\n" +
                "      \"authors\": [\"Emily White\"]\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Anna Karenina\",\n" +
                "      \"publishedYear\": 2021,\n" +
                "      \"numberOfPages\": 350,\n" +
                "      \"authors\": [\"Mike Brown\"]\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
        JSONObject jsonObject = new JSONObject(jsonData);
        addNewBookToJSON(jsonObject, "Harry Potter", 1997, 400, new String[]{"J.K.Rowling"});
        printJSON(jsonObject);
    }

    private static Document parseXML(String xmlData) throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        return dBuilder.parse(new InputSource(new StringReader(xmlData)));
    }

    private static void addNewBookToXML(Document doc, String title, int year, int pages, String[] authors) {
        Element newBook = doc.createElement("Book");
        newBook.appendChild(createElementWithText(doc, "title", title));
        newBook.appendChild(createElementWithText(doc, "publishedYear", String.valueOf(year)));
        newBook.appendChild(createElementWithText(doc, "numberOfPages", String.valueOf(pages)));

        Element authorsElement = doc.createElement("authors");
        for (String author : authors) {
            authorsElement.appendChild(createElementWithText(doc, "author", author));
        }
        newBook.appendChild(authorsElement);

        doc.getDocumentElement().appendChild(newBook);
    }

    private static Element createElementWithText(Document doc, String elementName, String text) {
        Element element = doc.createElement(elementName);
        element.appendChild(doc.createTextNode(text));
        return element;
    }

    private static void printXML(Document doc) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult console = new StreamResult(System.out);
        transformer.transform(source, console);
    }

    private static void addNewBookToJSON(JSONObject jsonObject, String title, int year, int pages, String[] authors) {
        JSONArray bookShelf = jsonObject.getJSONArray("BookShelf");
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("publishedYear", year);
        newBook.put("numberOfPages", pages);
        newBook.put("authors", authors);
        bookShelf.put(newBook);
    }

    private static void printJSON(JSONObject jsonObject) {
        System.out.println(jsonObject.toString(4)); // Indented with 4 spaces
    }
}

