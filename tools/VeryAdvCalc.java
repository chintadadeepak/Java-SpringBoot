package tools;
// the inheritance betn AdvCalc and VeryAdvCalc is single level.
// the inheritance betn Calc and VeryAdvCalc is multi level.

public class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}
