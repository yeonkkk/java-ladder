package utils;

public enum ErrorMessage {

    INVALID_USER_NAME_LENGTH_BY_MINIMUM_LIMIT("이름의 길이는 %d 이상이여야 합니다."),
    INVALID_USER_NAME_LENGTH_BY_MAXIMUM_LIMIT("이름의 길이는 %d 이하여야 합니다."),
    INVALID_USER_NUMBER_NUMBER_BY_MINIMUM_LIMIT("참여자의 수는 %d 이상이여야 합니다."),
    INVALID_USER_NUMBER_NUMBER_BY_MAXIMUM_LIMIT("참여자의 수는 %d 이하여야 합니다."),
    INDEX_OUT_OF_BOUNDS("인덱스의 범위를 벗어났습니다."),
    NOT_FOUND_USER("유저가 존재하지 않습니다."),
    DUPLICATE_USER_NAME("중복된 이름을 입력할 수 없습니다."),
    INVALID_LADDER_HEIGHT_BY_MINIMUM_LIMIT("사다리의 높이는 %d 이상입니다."),
    INVALID_LADDER_HEIGHT_BY_MAXIMUM_LIMIT("사다리의 높이는 %d 이하입니다."),
    INVALID_LADDER_HEIGHT_INPUT("사다리의 높이는 숫자만 입력 가능합니다."),
    INVALID_REWARDS_SIZE("실행 결과는 %d개 입력해야합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
