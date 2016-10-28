/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tdahl01
 */
public class World {
    
    static Lamp lp = new Lamp("lamp", "It's a shiny brass oil lamp.");
    public ArrayList<Location> locations;  // added public keyword for testing
    
    public World(){  // added public keyword for testing
        Location bb = new Location("forest","You are standing by a babbling brook. From the east you can see misty mountains and there is sunny field in the north direction", "You can go north or east");
        Location mm = new Location("mountains","You are up in some misty mountains. Visibility is poor so you will need to trust your intuition in navigation", "You can go west, north or east");
        Location dc = new Location("cave","You are in the cave of Gwent the dragon, you can hear dripping water and can smell damp. There is a breathing sound coming from the abyss of the cave.", "You can go west");
        Location sf = new Location("field","You are in a sunny field full of flowers. From the north you can see tower ruins and to the east there is a little wood with a big oak tree. When you look to the south you can see the forest where you have been.", "You can go south, north or east");
        Location go = new Location("wood","You are standing by a great oak on the edge of the small wood. From the south you can see misty mountains and from the north you can see the sea. When you look east there is an area covered by the marshes", "You can go south, west, north or east");
        Location ms = new Location("marshes","You are in some murky marshes. From the north you can see the sea side with an empty, sandy beach and from the west you can see a small wood with a big oak tree.", "You can go west or north");
        Location tr = new Location("ruins","You are in some deserted tower ruins. There is nobody around and it looks like it was damaged by the war and has never been rebuilt afterwards. From the south you can see fields", "You can go south");
        Location hc = new Location("lighthouse","You are in the abandoned lighthouse on top of some high cliffs. There are far reaching views from the window. There is some furniture and pictures on the walls. From the east you can see a long golden beach and from the south there is a little wood.", "You can go south or east");
        Location lb = new Location("hut","You are in a hut on a lonely beach. There are a few empty rooms. From the window you can see marshes to the south and the lighthouse on the high cliffs to the west.", "You can go west or south");
        
        bb.setExits(sf,mm,null,null);
        mm.setExits(go,dc,null,bb);
        dc.setExits(null,null,null,mm);
        sf.setExits(tr,go,bb,null);
        go.setExits(hc,ms,mm,sf);
        ms.setExits(lb,null,null,go);
        tr.setExits(null,null,sf,null);
        hc.setExits(null,lb,go,null);
        lb.setExits(null,null,ms,hc);

        Object sw = new Object("sword", "It's a rusty sword.");
        Object dd = new Object("dragon", "It's an angry, fire-breathing dragon!");

        tr.setObject(sw);
        hc.setObject(lp);
        dc.setObject(dd);

        dc.isLit = false;
        dd.takeable = -1;
        
        Location[] ls = new Location[] {bb,mm,dc,sf,go,ms,tr,hc,lb};
        locations = new ArrayList(Arrays.asList(ls));
    }
}