package gmbh.cathi.sikulitestutility.main;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class SikuliTestUtility {
    public static void main(String[] args) {
        java.lang.System.out.print("4");
        ImagePath.add("resources/images");
        Screen s = new Screen();

        try{
            java.lang.System.out.print("5");
            s.click("code_btn.png");
        }
        catch(FindFailed e){
            e.printStackTrace();
        }
    }
}
