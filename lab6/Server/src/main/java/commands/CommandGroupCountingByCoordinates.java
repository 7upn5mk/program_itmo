package commands;

import lab5.legacy.Person;
import server.ServerReader;

import java.util.HashSet;
import java.util.Set;

public class CommandGroupCountingByCoordinates extends  Command{
    public CommandGroupCountingByCoordinates(ServerReader serverReader, String des) {
        super(serverReader);
        setDescription(des);
    }
    @Override
    public String execute() {
        if (getCollection().isEmpty()) {
            return ("Colletion is empty");
        }
        String result = "";
        Set<Person> h = getCollection();
        for (int i=0;!h.isEmpty();i++) {
            int count = 0;
            HashSet<Person> tr=new HashSet<>();
            for (Person p: h) {
                double distant = Math.sqrt(Math.pow(p.getCoordinates().getX(),2)+Math.pow(p.getCoordinates().getY(),2));
                if (distant >= Math.pow(10,i) && distant < Math.pow(10,i+1)) {
                    count ++;
                    tr.add(p);
                }
            }
            if (!tr.isEmpty())
                for (Person p:tr) {
                    h.remove(p);
                }
            result += ("There are "+count+" persons with distance between "+Math.pow(10,i)+" and "+Math.pow(10,i+1)+"\n");
        }
        return result;
    }
}
