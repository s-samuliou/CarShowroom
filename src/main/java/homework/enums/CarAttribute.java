package homework.enums;

public enum CarAttribute {
    BRAND(1),
    PRICE(2),
    YEAR(3);

    private final int value;

    CarAttribute(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
