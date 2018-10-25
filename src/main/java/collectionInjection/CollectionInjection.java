package collectionInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    List documentList;
    Set documentSet;
    Map documentMap;
    Properties documentProp;

    public List getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List documentList) {
        System.out.println("setDocumentList: " + documentList);
        this.documentList = documentList;
    }

    public Set getDocumentSet() {
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {
        System.out.println("setDocemntSet: " + documentSet);
        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {
        System.out.println("setDocumentMap: " + documentMap);
        this.documentMap = documentMap;
    }

    public Properties getDocumentProp() {
        return documentProp;
    }

    public void setDocumentProp(Properties documentProp) {
        System.out.println("setDocumentProp: " + documentProp);
        this.documentProp = documentProp;
    }
}
