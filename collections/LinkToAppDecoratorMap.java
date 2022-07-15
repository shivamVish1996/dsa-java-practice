package collections;

import java.util.Map;

public class LinkToAppDecoratorMap {

    private static final String OBJECTS_TYPE_PART = "wt.part.WTPart";
    private static final String OBJECTS_TYPE_DOCUMENT = "wt.doc.WTDocument";
    private static final String OBJECTS_TYPE_EPM_DOCUMENT = "wt.epm.EPMDocument";

    private static final String ID = "ID";

    private static final String LANDING_PAGE_MASHUP = "LandingPageAccessAppMashup";

    private static final String DESIGN_FILES_APP_ID = "PTC.Nav.DesignFiles";
    private static final String DRAWING_APP_ID = "PTC.Nav.Drawing";
    private static final String VIEW_AND_MEASURE_IN_3D_APP_ID = "PTC.Nav.ViewAndMeasureIn3D";
    private static final String PART_PROPERTIES_APP_ID = "PTC.Nav.PartProperties";
    private static final String PART_LIST_APP_ID = "PTC.Nav.PartList";
    private static final String PART_STRUCTURE_ID = "PTC.Nav.PartStructure";

    private static final String DOCUMENT_APP_ID = "PTC.Nav.Document";
    private static final String DOCUMENT_STRUCTURE_APP_ID = "PTC.Nav.DocumentStructure";

    private static final String DESIGN_FILES_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "DesignFilesAccessAppMashup&configEntity=Example1DesignFilesAccessAppConfigThing";
    private static final String DRAWING_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "DrawingAccessAppMashup&configEntity=Example1DrawingAccessAppConfigThing";
    private static final String VIEW_AND_MEASURE_IN_3D_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "InterrogateCadModelAccessAppMashup&configEntity=Example1InterrogateCadModelAccessAppConfigThing";
    private static final String PART_PROPERTIES_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "PartPropertiesAccessAppMashup&configEntity=Example1PartPropertiesAccessAppConfigThing";
    private static final String PART_LIST_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "PartsListWithPreviewAccessAppMashup&configEntity=Example1PartsListAccessAppConfigThing";
    private static final String PART_STRUCTURE_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "PartStructureWithPreviewAppMashup&configEntity=Example1PartStructureAccessAppConfigThing";

    private static final String DOCUMENT_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "PTC.Nav.DocumentAccessAppMashup&configEntity=Example1DocumentAccessAppConfigThing";
    private static final String DOCUMENT_STRUCTURE_MASHUP_URL = "PTC.Nav.ViewAppMashup&appMashupname=" +
            "DocumentStructureWithPreviewAccessAppMashup&configEntity=Example1DocumentStructureAccessAppConfigThing";

    private static final Map<String,String> partCollectionAppIdToUrlMap = Map.of(
            DESIGN_FILES_APP_ID, DESIGN_FILES_MASHUP_URL, DRAWING_APP_ID, DRAWING_MASHUP_URL,
            VIEW_AND_MEASURE_IN_3D_APP_ID, VIEW_AND_MEASURE_IN_3D_MASHUP_URL, PART_PROPERTIES_APP_ID, PART_PROPERTIES_MASHUP_URL,
            PART_LIST_APP_ID, PART_LIST_MASHUP_URL, PART_STRUCTURE_ID, PART_STRUCTURE_MASHUP_URL);

    private static final Map<String,String> documentCollectionAppIdToUrlMap = Map.of(
            DOCUMENT_APP_ID, DOCUMENT_MASHUP_URL, DOCUMENT_STRUCTURE_APP_ID, DOCUMENT_STRUCTURE_MASHUP_URL);

    public static void main(String[] args) {

      //  String itemId = "OR:wt.part.WTPart:111254";
       // String itemId = "OR:wt.epm.EPMDocument:111254";
        String itemId = getItemId();
       // String appId = "PTC.Nav.PartList";
     //   String appId = "PTC.Nav.PartStructure";
        String appId = "PTC.Nav.DocumentStructure";

        if(itemId.contains(OBJECTS_TYPE_PART) && partCollectionAppIdToUrlMap.containsKey(appId)){
            System.out.println("part");
            System.out.println(partCollectionAppIdToUrlMap.get(appId));
        } else if (itemId.contains(OBJECTS_TYPE_EPM_DOCUMENT) && partCollectionAppIdToUrlMap.containsKey(appId)) {
            System.out.println("cad");
            System.out.println(partCollectionAppIdToUrlMap.get(appId));
        } else if(itemId.contains(OBJECTS_TYPE_DOCUMENT) && documentCollectionAppIdToUrlMap.containsKey(appId)){
            System.out.println("document");
            System.out.println(documentCollectionAppIdToUrlMap.get(appId));
        } else{
            System.out.println(appId);
        }



    }

    private static String getItemId(){
        return "OR:wt.doc.WTDocument:111254";
    }
}
