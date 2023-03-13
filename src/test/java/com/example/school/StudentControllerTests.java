package com.example.school;

import com.example.school.model.StudentRowMapper;
import com.example.school.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentControllerTests {

        @Autowired
        private MockMvc mockMvc;

        @Autowired
        private JdbcTemplate jdbcTemplate;

        ObjectMapper objectMapper = new ObjectMapper();

        ObjectWriter objectWriter = objectMapper.writer();

        ArrayList<Student> studentsList = new ArrayList<>();
        {
                studentsList.add(new Student(1, "John", "Male", 1));
                studentsList.add(new Student(2, "David", "Male", 2));
                studentsList.add(new Student(3, "William", "Male", 3));
                studentsList.add(new Student(4, "Ryan", "Male", 4));
                studentsList.add(new Student(5, "Jacob", "Male", 5));
                studentsList.add(new Student(6, "Michael", "Male", 6));
                studentsList.add(new Student(7, "Daniel", "Male", 7));
                studentsList.add(new Student(8, "Benjamin", "Male", 8));
                studentsList.add(new Student(9, "Henry", "Male", 9));
                studentsList.add(new Student(10, "Ethan", "Male", 10));
                studentsList.add(new Student(11, "Emma", "Female", 1));
                studentsList.add(new Student(12, "Sophia", "Female", 2));
                studentsList.add(new Student(13, "Olivia", "Female", 3));
                studentsList.add(new Student(14, "Ava", "Female", 4));
                studentsList.add(new Student(15, "Isabella", "Female", 5));
                studentsList.add(new Student(16, "Mia", "Female", 6));
                studentsList.add(new Student(17, "Charlotte", "Female", 7));
                studentsList.add(new Student(18, "Amelia", "Female", 8));
                studentsList.add(new Student(19, "Harper", "Female", 9));
                studentsList.add(new Student(20, "Evelyn", "Female", 10));
        }

        @Test
        @Order(1)
        public void testgetStudents() throws Exception {
                mockMvc.perform(get("/students")).andExpect(status().isOk())
                                .andExpect(jsonPath("$", Matchers.hasSize(20)))
                                .andExpect(jsonPath("$[0].studentId",
                                                Matchers.equalTo(studentsList.get(0).getStudentId())))
                                .andExpect(jsonPath("$[0].studentName",
                                                Matchers.equalTo(studentsList.get(0).getStudentName())))
                                .andExpect(jsonPath("$[0].gender", Matchers.equalTo(studentsList.get(0).getGender())))
                                .andExpect(jsonPath("$[0].standard",
                                                Matchers.equalTo(studentsList.get(0).getStandard())))

                                .andExpect(jsonPath("$[1].studentId",
                                                Matchers.equalTo(studentsList.get(1).getStudentId())))
                                .andExpect(jsonPath("$[1].studentName",
                                                Matchers.equalTo(studentsList.get(1).getStudentName())))
                                .andExpect(jsonPath("$[1].gender", Matchers.equalTo(studentsList.get(1).getGender())))
                                .andExpect(jsonPath("$[1].standard",
                                                Matchers.equalTo(studentsList.get(1).getStandard())))

                                .andExpect(jsonPath("$[2].studentId",
                                                Matchers.equalTo(studentsList.get(2).getStudentId())))
                                .andExpect(jsonPath("$[2].studentName",
                                                Matchers.equalTo(studentsList.get(2).getStudentName())))
                                .andExpect(jsonPath("$[2].gender", Matchers.equalTo(studentsList.get(2).getGender())))
                                .andExpect(jsonPath("$[2].standard",
                                                Matchers.equalTo(studentsList.get(2).getStandard())))

                                .andExpect(jsonPath("$[3].studentId",
                                                Matchers.equalTo(studentsList.get(3).getStudentId())))
                                .andExpect(jsonPath("$[3].studentName",
                                                Matchers.equalTo(studentsList.get(3).getStudentName())))
                                .andExpect(jsonPath("$[3].gender", Matchers.equalTo(studentsList.get(3).getGender())))
                                .andExpect(jsonPath("$[3].standard",
                                                Matchers.equalTo(studentsList.get(3).getStandard())))

                                .andExpect(jsonPath("$[4].studentId",
                                                Matchers.equalTo(studentsList.get(4).getStudentId())))
                                .andExpect(jsonPath("$[4].studentName",
                                                Matchers.equalTo(studentsList.get(4).getStudentName())))
                                .andExpect(jsonPath("$[4].gender", Matchers.equalTo(studentsList.get(4).getGender())))
                                .andExpect(jsonPath("$[4].standard",
                                                Matchers.equalTo(studentsList.get(4).getStandard())))

                                .andExpect(jsonPath("$[5].studentId",
                                                Matchers.equalTo(studentsList.get(5).getStudentId())))
                                .andExpect(jsonPath("$[5].studentName",
                                                Matchers.equalTo(studentsList.get(5).getStudentName())))
                                .andExpect(jsonPath("$[5].gender", Matchers.equalTo(studentsList.get(5).getGender())))
                                .andExpect(jsonPath("$[5].standard",
                                                Matchers.equalTo(studentsList.get(5).getStandard())))

                                .andExpect(jsonPath("$[6].studentId",
                                                Matchers.equalTo(studentsList.get(6).getStudentId())))
                                .andExpect(jsonPath("$[6].studentName",
                                                Matchers.equalTo(studentsList.get(6).getStudentName())))
                                .andExpect(jsonPath("$[6].gender", Matchers.equalTo(studentsList.get(6).getGender())))
                                .andExpect(jsonPath("$[6].standard",
                                                Matchers.equalTo(studentsList.get(6).getStandard())))

                                .andExpect(jsonPath("$[7].studentId",
                                                Matchers.equalTo(studentsList.get(7).getStudentId())))
                                .andExpect(jsonPath("$[7].studentName",
                                                Matchers.equalTo(studentsList.get(7).getStudentName())))
                                .andExpect(jsonPath("$[7].gender", Matchers.equalTo(studentsList.get(7).getGender())))
                                .andExpect(jsonPath("$[7].standard",
                                                Matchers.equalTo(studentsList.get(7).getStandard())))

                                .andExpect(jsonPath("$[8].studentId",
                                                Matchers.equalTo(studentsList.get(8).getStudentId())))
                                .andExpect(jsonPath("$[8].studentName",
                                                Matchers.equalTo(studentsList.get(8).getStudentName())))
                                .andExpect(jsonPath("$[8].gender", Matchers.equalTo(studentsList.get(8).getGender())))
                                .andExpect(jsonPath("$[8].standard",
                                                Matchers.equalTo(studentsList.get(8).getStandard())))

                                .andExpect(jsonPath("$[9].studentId",
                                                Matchers.equalTo(studentsList.get(9).getStudentId())))
                                .andExpect(jsonPath("$[9].studentName",
                                                Matchers.equalTo(studentsList.get(9).getStudentName())))
                                .andExpect(jsonPath("$[9].gender", Matchers.equalTo(studentsList.get(9).getGender())))
                                .andExpect(jsonPath("$[9].standard",
                                                Matchers.equalTo(studentsList.get(9).getStandard())))

                                .andExpect(jsonPath("$[10].studentId",
                                                Matchers.equalTo(studentsList.get(10).getStudentId())))
                                .andExpect(jsonPath("$[10].studentName",
                                                Matchers.equalTo(studentsList.get(10).getStudentName())))
                                .andExpect(jsonPath("$[10].gender", Matchers.equalTo(studentsList.get(10).getGender())))
                                .andExpect(jsonPath("$[10].standard",
                                                Matchers.equalTo(studentsList.get(10).getStandard())))

                                .andExpect(jsonPath("$[11].studentId",
                                                Matchers.equalTo(studentsList.get(11).getStudentId())))
                                .andExpect(jsonPath("$[11].studentName",
                                                Matchers.equalTo(studentsList.get(11).getStudentName())))
                                .andExpect(jsonPath("$[11].gender", Matchers.equalTo(studentsList.get(11).getGender())))
                                .andExpect(jsonPath("$[11].standard",
                                                Matchers.equalTo(studentsList.get(11).getStandard())))

                                .andExpect(jsonPath("$[12].studentId",
                                                Matchers.equalTo(studentsList.get(12).getStudentId())))
                                .andExpect(jsonPath("$[12].studentName",
                                                Matchers.equalTo(studentsList.get(12).getStudentName())))
                                .andExpect(jsonPath("$[12].gender", Matchers.equalTo(studentsList.get(12).getGender())))
                                .andExpect(jsonPath("$[12].standard",
                                                Matchers.equalTo(studentsList.get(12).getStandard())))

                                .andExpect(jsonPath("$[13].studentId",
                                                Matchers.equalTo(studentsList.get(13).getStudentId())))
                                .andExpect(jsonPath("$[13].studentName",
                                                Matchers.equalTo(studentsList.get(13).getStudentName())))
                                .andExpect(jsonPath("$[13].gender", Matchers.equalTo(studentsList.get(13).getGender())))
                                .andExpect(jsonPath("$[13].standard",
                                                Matchers.equalTo(studentsList.get(13).getStandard())))

                                .andExpect(jsonPath("$[14].studentId",
                                                Matchers.equalTo(studentsList.get(14).getStudentId())))
                                .andExpect(jsonPath("$[14].studentName",
                                                Matchers.equalTo(studentsList.get(14).getStudentName())))
                                .andExpect(jsonPath("$[14].gender", Matchers.equalTo(studentsList.get(14).getGender())))
                                .andExpect(jsonPath("$[14].standard",
                                                Matchers.equalTo(studentsList.get(14).getStandard())))

                                .andExpect(jsonPath("$[15].studentId",
                                                Matchers.equalTo(studentsList.get(15).getStudentId())))
                                .andExpect(jsonPath("$[15].studentName",
                                                Matchers.equalTo(studentsList.get(15).getStudentName())))
                                .andExpect(jsonPath("$[15].gender", Matchers.equalTo(studentsList.get(15).getGender())))
                                .andExpect(jsonPath("$[15].standard",
                                                Matchers.equalTo(studentsList.get(15).getStandard())))

                                .andExpect(jsonPath("$[16].studentId",
                                                Matchers.equalTo(studentsList.get(16).getStudentId())))
                                .andExpect(jsonPath("$[16].studentName",
                                                Matchers.equalTo(studentsList.get(16).getStudentName())))
                                .andExpect(jsonPath("$[16].gender", Matchers.equalTo(studentsList.get(16).getGender())))
                                .andExpect(jsonPath("$[16].standard",
                                                Matchers.equalTo(studentsList.get(16).getStandard())))

                                .andExpect(jsonPath("$[17].studentId",
                                                Matchers.equalTo(studentsList.get(17).getStudentId())))
                                .andExpect(jsonPath("$[17].studentName",
                                                Matchers.equalTo(studentsList.get(17).getStudentName())))
                                .andExpect(jsonPath("$[17].gender", Matchers.equalTo(studentsList.get(17).getGender())))
                                .andExpect(jsonPath("$[17].standard",
                                                Matchers.equalTo(studentsList.get(17).getStandard())))

                                .andExpect(jsonPath("$[18].studentId",
                                                Matchers.equalTo(studentsList.get(18).getStudentId())))
                                .andExpect(jsonPath("$[18].studentName",
                                                Matchers.equalTo(studentsList.get(18).getStudentName())))
                                .andExpect(jsonPath("$[18].gender", Matchers.equalTo(studentsList.get(18).getGender())))
                                .andExpect(jsonPath("$[18].standard",
                                                Matchers.equalTo(studentsList.get(18).getStandard())))

                                .andExpect(jsonPath("$[19].studentId",
                                                Matchers.equalTo(studentsList.get(19).getStudentId())))
                                .andExpect(jsonPath("$[19].studentName",
                                                Matchers.equalTo(studentsList.get(19).getStudentName())))
                                .andExpect(jsonPath("$[19].gender", Matchers.equalTo(studentsList.get(19).getGender())))
                                .andExpect(jsonPath("$[19].standard",
                                                Matchers.equalTo(studentsList.get(19).getStandard())));
        }

        @Test
        @Order(2)
        public void testgetNotFound() throws Exception {
                mockMvc.perform(get("/students/22")).andExpect(status().isNotFound());
        }

        @Test
        @Order(3)
        public void testgetStudentById() throws Exception {
                mockMvc.perform(get("/students/1")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(0).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(0).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(0).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(0).getStandard())));

                mockMvc.perform(get("/students/2")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(1).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(1).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(1).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(1).getStandard())));

                mockMvc.perform(get("/students/3")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(2).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(2).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(2).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(2).getStandard())));

                mockMvc.perform(get("/students/4")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(3).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(3).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(3).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(3).getStandard())));

                mockMvc.perform(get("/students/5")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(4).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(4).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(4).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(4).getStandard())));

                mockMvc.perform(get("/students/6")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(5).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(5).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(5).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(5).getStandard())));

                mockMvc.perform(get("/students/7")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(6).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(6).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(6).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(6).getStandard())));

                mockMvc.perform(get("/students/8")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(7).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(7).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(7).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(7).getStandard())));

                mockMvc.perform(get("/students/9")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(8).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(8).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(8).getGender())))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(studentsList.get(8).getStandard())));

                mockMvc.perform(get("/students/10")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(9).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(9).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(9).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(9).getStandard())));

                mockMvc.perform(get("/students/11")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(10).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(10).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(10).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(10).getStandard())));
                mockMvc.perform(get("/students/12")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(11).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(11).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(11).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(11).getStandard())));
                mockMvc.perform(get("/students/13")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(12).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(12).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(12).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(12).getStandard())));
                mockMvc.perform(get("/students/14")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(13).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(13).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(13).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(13).getStandard())));
                mockMvc.perform(get("/students/15")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(14).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(14).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(14).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(14).getStandard())));
                mockMvc.perform(get("/students/16")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(15).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(15).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(15).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(15).getStandard())));
                mockMvc.perform(get("/students/17")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(16).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(16).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(16).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(16).getStandard())));
                mockMvc.perform(get("/students/18")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(17).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(17).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(17).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(17).getStandard())));
                mockMvc.perform(get("/students/19")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(18).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(18).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(18).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(18).getStandard())));
                mockMvc.perform(get("/students/20")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId",
                                                Matchers.equalTo(studentsList.get(19).getStudentId())))
                                .andExpect(jsonPath("$.studentName",
                                                Matchers.equalTo(studentsList.get(19).getStudentName())))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo(studentsList.get(19).getGender())))
                                .andExpect(jsonPath("$.standard",
                                                Matchers.equalTo(studentsList.get(19).getStandard())));

        }

        @Test
        @Order(4)
        public void testpost() throws Exception {
                Student student = new Student(21, "TestName", "Male", 5);
                String content = objectWriter.writeValueAsString(student);

                MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/students")
                                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                                .content(content);

                mockMvc.perform(mockRequest).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId", Matchers.equalTo(21)))
                                .andExpect(jsonPath("$.studentName", Matchers.equalTo("TestName")))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo("Male")))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(5)));
        }

        @Test
        @Order(5)
        public void testafterpost() throws Exception {
                mockMvc.perform(get("/students/21")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId", Matchers.equalTo(21)))
                                .andExpect(jsonPath("$.studentName", Matchers.equalTo("TestName")))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo("Male")))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(5)));

        }

        @Test
        @Order(6)
        public void testDbAfterPost() throws Exception {
                Student student = jdbcTemplate.queryForObject("select * from student where studentid = ?",
                                new StudentRowMapper(), 21);

                assertEquals(student.getStudentName(), "TestName");
                assertEquals(student.getGender(), "Male");
                assertEquals(student.getStandard(), 5);
        }

        @Test
        @Order(7)
        public void testput() throws Exception {
                Student student = new Student(13, "Yuvi", "Male", 7);
                String content = objectWriter.writeValueAsString(student);

                MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.put("/students/13")
                                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                                .content(content);

                mockMvc.perform(mockRequest).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId", Matchers.equalTo(13)))
                                .andExpect(jsonPath("$.studentName", Matchers.equalTo("Yuvi")))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo("Male")))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(7)));

        }

        @Test
        @Order(8)
        public void testafterput() throws Exception {

                mockMvc.perform(get("/students/13")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId", Matchers.equalTo(13)))
                                .andExpect(jsonPath("$.studentName", Matchers.equalTo("Yuvi")))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo("Male")))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(7)));

        }

        @Test
        @Order(9)
        public void testDbAfterPut() throws Exception {
                Student student = jdbcTemplate.queryForObject("select * from student where studentid = ?",
                                new StudentRowMapper(), 13);

                assertEquals(student.getStudentName(), "Yuvi");
                assertEquals(student.getGender(), "Male");
                assertEquals(student.getStandard(), 7);
        }

        @Test
        @Order(10)
        public void testdelete() throws Exception {

                MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.delete("/students/21")
                                .contentType(MediaType.APPLICATION_JSON);
                mockMvc.perform(mockRequest).andExpect(status().isOk());
        }

        @Test
        @Order(11)
        public void testafterdelete() throws Exception {
                mockMvc.perform(get("/students")).andExpect(status().isOk())
                                .andExpect(jsonPath("$", Matchers.hasSize(20)))
                                .andExpect(jsonPath("$[0].studentId",
                                                Matchers.equalTo(studentsList.get(0).getStudentId())))
                                .andExpect(jsonPath("$[0].studentName",
                                                Matchers.equalTo(studentsList.get(0).getStudentName())))
                                .andExpect(jsonPath("$[0].gender", Matchers.equalTo(studentsList.get(0).getGender())))
                                .andExpect(jsonPath("$[0].standard",
                                                Matchers.equalTo(studentsList.get(0).getStandard())))

                                .andExpect(jsonPath("$[1].studentId",
                                                Matchers.equalTo(studentsList.get(1).getStudentId())))
                                .andExpect(jsonPath("$[1].studentName",
                                                Matchers.equalTo(studentsList.get(1).getStudentName())))
                                .andExpect(jsonPath("$[1].gender", Matchers.equalTo(studentsList.get(1).getGender())))
                                .andExpect(jsonPath("$[1].standard",
                                                Matchers.equalTo(studentsList.get(1).getStandard())))

                                .andExpect(jsonPath("$[2].studentId",
                                                Matchers.equalTo(studentsList.get(2).getStudentId())))
                                .andExpect(jsonPath("$[2].studentName",
                                                Matchers.equalTo(studentsList.get(2).getStudentName())))
                                .andExpect(jsonPath("$[2].gender", Matchers.equalTo(studentsList.get(2).getGender())))
                                .andExpect(jsonPath("$[2].standard",
                                                Matchers.equalTo(studentsList.get(2).getStandard())))

                                .andExpect(jsonPath("$[3].studentId",
                                                Matchers.equalTo(studentsList.get(3).getStudentId())))
                                .andExpect(jsonPath("$[3].studentName",
                                                Matchers.equalTo(studentsList.get(3).getStudentName())))
                                .andExpect(jsonPath("$[3].gender", Matchers.equalTo(studentsList.get(3).getGender())))
                                .andExpect(jsonPath("$[3].standard",
                                                Matchers.equalTo(studentsList.get(3).getStandard())))

                                .andExpect(jsonPath("$[4].studentId",
                                                Matchers.equalTo(studentsList.get(4).getStudentId())))
                                .andExpect(jsonPath("$[4].studentName",
                                                Matchers.equalTo(studentsList.get(4).getStudentName())))
                                .andExpect(jsonPath("$[4].gender", Matchers.equalTo(studentsList.get(4).getGender())))
                                .andExpect(jsonPath("$[4].standard",
                                                Matchers.equalTo(studentsList.get(4).getStandard())))

                                .andExpect(jsonPath("$[5].studentId",
                                                Matchers.equalTo(studentsList.get(5).getStudentId())))
                                .andExpect(jsonPath("$[5].studentName",
                                                Matchers.equalTo(studentsList.get(5).getStudentName())))
                                .andExpect(jsonPath("$[5].gender", Matchers.equalTo(studentsList.get(5).getGender())))
                                .andExpect(jsonPath("$[5].standard",
                                                Matchers.equalTo(studentsList.get(5).getStandard())))

                                .andExpect(jsonPath("$[6].studentId",
                                                Matchers.equalTo(studentsList.get(6).getStudentId())))
                                .andExpect(jsonPath("$[6].studentName",
                                                Matchers.equalTo(studentsList.get(6).getStudentName())))
                                .andExpect(jsonPath("$[6].gender", Matchers.equalTo(studentsList.get(6).getGender())))
                                .andExpect(jsonPath("$[6].standard",
                                                Matchers.equalTo(studentsList.get(6).getStandard())))

                                .andExpect(jsonPath("$[7].studentId",
                                                Matchers.equalTo(studentsList.get(7).getStudentId())))
                                .andExpect(jsonPath("$[7].studentName",
                                                Matchers.equalTo(studentsList.get(7).getStudentName())))
                                .andExpect(jsonPath("$[7].gender", Matchers.equalTo(studentsList.get(7).getGender())))
                                .andExpect(jsonPath("$[7].standard",
                                                Matchers.equalTo(studentsList.get(7).getStandard())))

                                .andExpect(jsonPath("$[8].studentId",
                                                Matchers.equalTo(studentsList.get(8).getStudentId())))
                                .andExpect(jsonPath("$[8].studentName",
                                                Matchers.equalTo(studentsList.get(8).getStudentName())))
                                .andExpect(jsonPath("$[8].gender", Matchers.equalTo(studentsList.get(8).getGender())))
                                .andExpect(jsonPath("$[8].standard",
                                                Matchers.equalTo(studentsList.get(8).getStandard())))

                                .andExpect(jsonPath("$[9].studentId",
                                                Matchers.equalTo(studentsList.get(9).getStudentId())))
                                .andExpect(jsonPath("$[9].studentName",
                                                Matchers.equalTo(studentsList.get(9).getStudentName())))
                                .andExpect(jsonPath("$[9].gender", Matchers.equalTo(studentsList.get(9).getGender())))
                                .andExpect(jsonPath("$[9].standard",
                                                Matchers.equalTo(studentsList.get(9).getStandard())))

                                .andExpect(jsonPath("$[10].studentId",
                                                Matchers.equalTo(studentsList.get(10).getStudentId())))
                                .andExpect(jsonPath("$[10].studentName",
                                                Matchers.equalTo(studentsList.get(10).getStudentName())))
                                .andExpect(jsonPath("$[10].gender", Matchers.equalTo(studentsList.get(10).getGender())))
                                .andExpect(jsonPath("$[10].standard",
                                                Matchers.equalTo(studentsList.get(10).getStandard())))

                                .andExpect(jsonPath("$[11].studentId",
                                                Matchers.equalTo(studentsList.get(11).getStudentId())))
                                .andExpect(jsonPath("$[11].studentName",
                                                Matchers.equalTo(studentsList.get(11).getStudentName())))
                                .andExpect(jsonPath("$[11].gender", Matchers.equalTo(studentsList.get(11).getGender())))
                                .andExpect(jsonPath("$[11].standard",
                                                Matchers.equalTo(studentsList.get(11).getStandard())))

                                .andExpect(jsonPath("$[12].studentId",
                                                Matchers.equalTo(13)))
                                .andExpect(jsonPath("$[12].studentName",
                                                Matchers.equalTo("Yuvi")))
                                .andExpect(jsonPath("$[12].gender", Matchers.equalTo("Male")))
                                .andExpect(jsonPath("$[12].standard",
                                                Matchers.equalTo(7)))

                                .andExpect(jsonPath("$[13].studentId",
                                                Matchers.equalTo(studentsList.get(13).getStudentId())))
                                .andExpect(jsonPath("$[13].studentName",
                                                Matchers.equalTo(studentsList.get(13).getStudentName())))
                                .andExpect(jsonPath("$[13].gender", Matchers.equalTo(studentsList.get(13).getGender())))
                                .andExpect(jsonPath("$[13].standard",
                                                Matchers.equalTo(studentsList.get(13).getStandard())))

                                .andExpect(jsonPath("$[14].studentId",
                                                Matchers.equalTo(studentsList.get(14).getStudentId())))
                                .andExpect(jsonPath("$[14].studentName",
                                                Matchers.equalTo(studentsList.get(14).getStudentName())))
                                .andExpect(jsonPath("$[14].gender", Matchers.equalTo(studentsList.get(14).getGender())))
                                .andExpect(jsonPath("$[14].standard",
                                                Matchers.equalTo(studentsList.get(14).getStandard())))

                                .andExpect(jsonPath("$[15].studentId",
                                                Matchers.equalTo(studentsList.get(15).getStudentId())))
                                .andExpect(jsonPath("$[15].studentName",
                                                Matchers.equalTo(studentsList.get(15).getStudentName())))
                                .andExpect(jsonPath("$[15].gender", Matchers.equalTo(studentsList.get(15).getGender())))
                                .andExpect(jsonPath("$[15].standard",
                                                Matchers.equalTo(studentsList.get(15).getStandard())))

                                .andExpect(jsonPath("$[16].studentId",
                                                Matchers.equalTo(studentsList.get(16).getStudentId())))
                                .andExpect(jsonPath("$[16].studentName",
                                                Matchers.equalTo(studentsList.get(16).getStudentName())))
                                .andExpect(jsonPath("$[16].gender", Matchers.equalTo(studentsList.get(16).getGender())))
                                .andExpect(jsonPath("$[16].standard",
                                                Matchers.equalTo(studentsList.get(16).getStandard())))

                                .andExpect(jsonPath("$[17].studentId",
                                                Matchers.equalTo(studentsList.get(17).getStudentId())))
                                .andExpect(jsonPath("$[17].studentName",
                                                Matchers.equalTo(studentsList.get(17).getStudentName())))
                                .andExpect(jsonPath("$[17].gender", Matchers.equalTo(studentsList.get(17).getGender())))
                                .andExpect(jsonPath("$[17].standard",
                                                Matchers.equalTo(studentsList.get(17).getStandard())))

                                .andExpect(jsonPath("$[18].studentId",
                                                Matchers.equalTo(studentsList.get(18).getStudentId())))
                                .andExpect(jsonPath("$[18].studentName",
                                                Matchers.equalTo(studentsList.get(18).getStudentName())))
                                .andExpect(jsonPath("$[18].gender", Matchers.equalTo(studentsList.get(18).getGender())))
                                .andExpect(jsonPath("$[18].standard",
                                                Matchers.equalTo(studentsList.get(18).getStandard())))

                                .andExpect(jsonPath("$[19].studentId",
                                                Matchers.equalTo(studentsList.get(19).getStudentId())))
                                .andExpect(jsonPath("$[19].studentName",
                                                Matchers.equalTo(studentsList.get(19).getStudentName())))
                                .andExpect(jsonPath("$[19].gender", Matchers.equalTo(studentsList.get(19).getGender())))
                                .andExpect(jsonPath("$[19].standard",
                                                Matchers.equalTo(studentsList.get(19).getStandard())));

        }

        @Test
        @Order(12)
        public void testBulkPost() throws Exception {
                ArrayList<Student> students = new ArrayList<>();
                students.add(new Student(22, "Emma Johnson", "Female", 8));
                students.add(new Student(23, "William Davis", "Male", 3));
                students.add(new Student(24, "Olivia Anderson", "Female", 9));
                String content = objectWriter.writeValueAsString(students);

                MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/students/bulk")
                                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                                .content(content);

                mockMvc.perform(mockRequest).andExpect(status().isOk())
                                .andExpect(content().string("Successfully added 3 students"));
        }

        @Test
        @Order(13)
        public void testAfterBulkPost() throws Exception {
                mockMvc.perform(get("/students/22")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId", Matchers.equalTo(22)))
                                .andExpect(jsonPath("$.studentName", Matchers.equalTo("Emma Johnson")))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo("Female")))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(8)));
                mockMvc.perform(get("/students/23")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId", Matchers.equalTo(23)))
                                .andExpect(jsonPath("$.studentName", Matchers.equalTo("William Davis")))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo("Male")))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(3)));
                mockMvc.perform(get("/students/24")).andExpect(status().isOk()).andExpect(jsonPath("$",
                                notNullValue()))
                                .andExpect(jsonPath("$.studentId", Matchers.equalTo(24)))
                                .andExpect(jsonPath("$.studentName", Matchers.equalTo("Olivia Anderson")))
                                .andExpect(jsonPath("$.gender", Matchers.equalTo("Female")))
                                .andExpect(jsonPath("$.standard", Matchers.equalTo(9)));

        }

        @Test
        @Order(14)
        public void testDbAfterBulkPost() throws Exception {
                Student student = jdbcTemplate.queryForObject("select * from student where studentid = ?",
                                new StudentRowMapper(), 22);

                assertEquals(student.getStudentName(), "Emma Johnson");
                assertEquals(student.getGender(), "Female");
                assertEquals(student.getStandard(), 8);

                student = jdbcTemplate.queryForObject("select * from student where studentid = ?",
                                new StudentRowMapper(), 23);

                assertEquals(student.getStudentName(), "William Davis");
                assertEquals(student.getGender(), "Male");
                assertEquals(student.getStandard(), 3);

                student = jdbcTemplate.queryForObject("select * from student where studentid = ?",
                                new StudentRowMapper(), 24);

                assertEquals(student.getStudentName(), "Olivia Anderson");
                assertEquals(student.getGender(), "Female");
                assertEquals(student.getStandard(), 9);
        }

        @AfterAll
        public void cleanup() {
                jdbcTemplate.execute("drop table student");
        }

}
