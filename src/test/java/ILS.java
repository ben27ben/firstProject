import java.io.Serializable;

public class ILS extends Coins implements Serializable {
     double value = 0.28;

    @Override
    public double getvalue() {
        return this.value;
    }
}
