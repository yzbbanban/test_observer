import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 */
public class Subject {
    private List<Observe> observes =new ArrayList<>();
    public void subscribe(Observe observe){
        observes.add(observe);
    }
    public void unSubscribe(Observe observe){
        observes.remove(observe);
    }

    public void notifyObserves() {
        for (Observe ob:observes) {
            ob.updata(this);
        }
    }
}
