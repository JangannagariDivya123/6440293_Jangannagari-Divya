public class PatternMatchingSwitch {
    public static void checkType(Object obj) {
        String result = switch (obj) {
            case Integer i -> "Integer with value " + i;
            case String s -> "String with value '" + s + "'";
            case Double d -> "Double with value " + d;
            case null -> "Object is null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkType(1235);
        checkType("Hi");
        checkType(17.67);
        checkType(true);
        checkType(null);
    }
}
