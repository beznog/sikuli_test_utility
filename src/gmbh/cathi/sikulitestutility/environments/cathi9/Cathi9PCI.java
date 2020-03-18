package gmbh.cathi.sikulitestutility.environments.cathi9;

import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;

public class Cathi9PCI {
    String Cathi9DesktopLink = "cathi9/PCIDesktopLink.png";
    Screen s = new Screen();

    public Cathi9PCI () {
        try {
            this.startCathi9PCI(Cathi9DesktopLink);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startCathi9PCI (String LinkPath) {
        try {
            s.doubleClick(LinkPath);
        }
        catch (FindFailed e) {
            e.printStackTrace();
        }

    }

}
