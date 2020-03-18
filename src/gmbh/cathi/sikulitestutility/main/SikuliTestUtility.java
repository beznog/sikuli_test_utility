package gmbh.cathi.sikulitestutility.main;

import gmbh.cathi.sikulitestutility.environments.Win10;
import gmbh.cathi.sikulitestutility.environments.Qt4;
import gmbh.cathi.sikulitestutility.environments.cathi9.Cathi9;
import gmbh.cathi.sikulitestutility.cathi9.procedures.ProcedureRHK;
import gmbh.cathi.sikulitestutility.environments.cathi9.Cathi9PCI;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class SikuliTestUtility {
    public static void main(String[] args) {
        //Win10 winEnv = new Win10();
        //Qt4 qt4 = new Qt4();
        //ProcedureRHK procedureRhkProcedure = new ProcedureRHK();

        java.lang.System.out.print("4");
        ImagePath.add("resources/images");
        Screen s = new Screen();
        Cathi9PCI PCI = new Cathi9PCI();
        /*
        try{
            java.lang.System.out.print("5");
            s.click("code_btn.png");
        }
        catch(FindFailed e){
            e.printStackTrace();
        }

         */
    }
}
