package org.example.grade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest {
  @DisplayName("과목(코스)를 생성한다.")
  @Test
  void createTest() {
    assertThatCode(()-> new Course("OOP",3,"A"))
            .doesNotThrowAnyException(); //어떠한 exception도 일어나지 않는다.
  }
}
