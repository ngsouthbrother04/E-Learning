package src.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@SuperBuilder
public class TeacherSearchRes {
    private String username;

    private String name;

    private String status;

    private String createDateFrom;

    private String createDateTo;

    private int page;

    private int size;

    private String sort;
}
