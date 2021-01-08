package carracing.domain;

public class Car {

    private final String POSITION_MARKER = "-";
    private final int MINIMUM_NAME_LENGTH = 1;
    private final int MAXIMUM_NAME_LENGTH = 5;

    private String name;
    private int position;

    public Car(final String name) {
        this(name, 0);
    }

    public Car(final String name, int position) {
        if (!isValidNameFormat(name)) {
            throw new IllegalArgumentException("차 이름의 글자 길이는 1~5자 사이입니다.");
        }
        this.name = name;
        this.position = position;
    }

    public boolean isValidNameFormat(String name) {
        return name != null && MINIMUM_NAME_LENGTH <= name.length() && name.length() <= MAXIMUM_NAME_LENGTH;
    }

    public int go() {
        return this.position += 1;
    }

    public String getCarInfoString() {
        StringBuilder positionBuilder = new StringBuilder();

        positionBuilder.append(this.name);
        positionBuilder.append(" : ");

        for (int i = 0; i < this.position; i++) {
            positionBuilder.append(POSITION_MARKER);
        }

        return positionBuilder.toString();
    }

    public String getName() {
        return this.name;
    }

    public boolean isPositionEqualMaxMoveDistance(int maxMoveDistance) {
        return this.position == maxMoveDistance;
    }
}
