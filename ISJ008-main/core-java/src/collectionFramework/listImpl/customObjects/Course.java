package collectionFramework.listImpl.customObjects;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Course implements Comparable<Course> {
    private int id;
    private String name;
    private int price;

    @Override
    public int compareTo(Course course) {
       // return this.id - course.id;
       // return this.price - course.price;
        return this.name.compareTo(course.name);
    }
}
