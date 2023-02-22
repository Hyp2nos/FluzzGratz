public class FluzzGratz implements IFluzzGratz{
    public String check(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FluzzGratz";
        else if (n % 3 == 0) return "Fluzz";
        else if (n % 5 == 0) return "Gratz";
        else return String.valueOf(n);
    }
}
