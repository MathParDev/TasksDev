package mathpar.web.learning.tasks.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskSectionsResponseDto {

    Long id;

    List<SectionResponseDto> sectionsList;

}
