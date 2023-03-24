package lambda.task3;

public class HeavyBox implements Comparable<HeavyBox> {
    private final int weight;
    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
    @Override
    public int compareTo(HeavyBox o) {
        return weight - o.getWeight();
    }
}
