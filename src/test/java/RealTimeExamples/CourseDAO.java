package RealTimeExamples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseDAO {

    static public List<Course> getCourseList() {
        return Stream.of(
                new Course("Spring", "Framework", 98, 2500),
                new Course("Spring Boot", "Framework", 95, 2000),
                new Course("API", "Microservice", 97, 2200),
                new Course("Microservice", "Microservice", 95, 1500),
                new Course("Full Stack", "Framework", 91, 1200),
                new Course("AWS ", "Cloud", 99, 2050),
                new Course("Azure", "Cloud", 92, 2500),
                new Course("Docker", "Cloud", 89, 2900)
        ).collect(Collectors.toList());

    }
}
