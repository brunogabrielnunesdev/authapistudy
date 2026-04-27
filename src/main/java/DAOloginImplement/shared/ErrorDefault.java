package DAOloginImplement.shared;

import java.time.LocalDateTime;

public record ErrorDefault(
        int status,
        String path,
        LocalDateTime time,
        String error
) {
}
