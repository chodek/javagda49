package concurrency.synchronizing;

public class Pair {
    private Integer left;
    private Integer right;

    public Pair(final Integer left, final Integer right) {
        this.left = left;
        this.right = right;
    }

    public void incrementLeft() {
        left++;
    }

    public void incrementRight() {
        synchronized (this) {
            right++;
        }
    }

    public Integer getLeft() {
        return left;
    }

    public Integer getRight() {
        return right;
    }
}

