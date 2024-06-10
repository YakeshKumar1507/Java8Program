package RealTimeExamples;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CourseTest {

    public static void main(String[] args) {

        List<Course> courses = CourseDAO.getCourseList();

        // reviewScroeGreaterThan90; --> all match
        Predicate<Course> reviewScoreGreaterThan90 = course -> course.getReviewScore() > 90;
        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90));

        //reviewScoreLessThan90; -- noneMatch
        Predicate<Course> reviewScoreLessThan90 = course -> course.getReviewScore() < 90;
        System.out.println(courses.stream().noneMatch(reviewScoreLessThan90));

        // reviewsScoreGreaterThan95; --->anyMatch
        Predicate<Course> reviewsScoreGreaterThan95 = course -> course.getReviewScore() >= 95;
        System.out.println(courses.stream().anyMatch(reviewsScoreGreaterThan95));

        //ComaparingBasedNoOfStudents
        Comparator<Course> comparingNoOfStudents = Comparator.comparing(Course::getNuOfStudents);
        System.out.println(courses.stream().sorted(comparingNoOfStudents).collect(Collectors.toList()));

        //Reversed
        Comparator<Course> comparingNoOfStudentsReversed = Comparator.comparing(Course::getNuOfStudents).reversed();
        System.out.println(courses.stream().sorted(comparingNoOfStudentsReversed).collect(Collectors.toList()));

        //skip
        System.out.println(courses.stream().sorted(Comparator.comparing(Course::getCourse)).skip(3).collect(Collectors.toList()));

        //groupBt category
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(
                                Course::getCategory,
                                Collectors.mapping(Course::getCourse,Collectors.toList())
                        ))
        );

        //joining

        System.out.println(courses.stream().map(s->s.getCourse()).collect(Collectors.joining(",")));

        //findFirst
        System.out.println(courses.stream().filter(s->s.getReviewScore()<80).findFirst().orElse(new Course("python","programming",75,3000)));


    }
}
