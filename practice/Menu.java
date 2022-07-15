package practice;

public class Menu {

      public interface MenuConstants {

         String LINK_DESTINATION = "linkDestination";
         String LINK_TARGET = "linkTarget";
         String LINK_TYPE = "linkType";
         String TITLE = "title";
         String IMAGE_URL = "imageURL";

    }

}

class Test {
    public static void main(String[] args) {
        System.out.println(Menu.MenuConstants.LINK_DESTINATION);
        System.out.println(Menu.MenuConstants.LINK_TARGET);
        System.out.println(Menu.MenuConstants.LINK_TYPE);
        System.out.println(Menu.MenuConstants.TITLE);
        System.out.println(Menu.MenuConstants.IMAGE_URL);

    }
}