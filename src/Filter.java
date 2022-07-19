import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;
    public Filter(int treshold) {
        this.threshold = treshold;
    }
    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer s : source) {
            if (s < threshold) {
                logger.log(String.format("Элемент \"%d\" проходит",s));
                result.add(s);
            }else{
                logger.log(String.format("Элемент \"%d\" не проходит",s));
            }
        }
        logger.log(String.format("Прошло фильтр %d элементов из %d",result.size(), source.size()));
        return result;

//        return source.stream()
//                .filter(s -> s > threshold)
//                .toList();
    }
}