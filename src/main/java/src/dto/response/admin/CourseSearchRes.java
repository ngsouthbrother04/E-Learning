package src.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Accessors(chain = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CourseSearchRes {
    private String name;

    private String status;

    private String teacherName;

    private String createDateFrom;

    private String createDateTo;

    private int ratingFrom;

    private int ratingTo;

    private String sort;

    private int page;

    private int size;
}
