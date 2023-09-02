// Advance Calculator will have it's own methods
// and Calc methods as well due to inheritance
// the inheritance between Calc and AdvCalc is single level inheritance
public class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
