package src.dto.request.user;

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
public class SearchSignedUpCourseReq {
    private String name;
    private String dateFrom;
    private String dateTo;
    private String teacherName;
    private int ratingFrom;
    private int ratingTo;
    private String status;
    private int numberOfLessons;
}
