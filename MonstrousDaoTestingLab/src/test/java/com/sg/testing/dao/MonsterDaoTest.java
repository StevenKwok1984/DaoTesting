package com.sg.testing.dao;

import com.sg.testing.dao.implementations.AGoodMonsterDao;
import com.sg.testing.model.Monster;
import org.junit.jupiter.api.*;

import static com.sg.testing.model.MonsterType.VAMPIRE;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterDaoTest {
    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MonsterDao goodMonster = new AGoodMonsterDao();
    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    public void testAddGetStudent() throws Exception {
        MonsterDao goodMonster = new AGoodMonsterDao();

        // Create our method test inputs
        int id = 1;
        Monster monster = new AGoodMonsterDao(id);
        monster.setName("Harry Potter");
        monster.setType(VAMPIRE);
        monster.setFavoriteFood("Feet");
        monster.setPeopleEaten(100);


        //  Add the student to the DAO
        goodMonster.addMonster(id, monster);
        // Get the student from the DAO
        Monster retrievedStudent = goodMonster.getMonster(id);

        // Check the data is equal
        assertEquals(student.getStudentId(),
                retrievedStudent.getStudentId(),
                "Checking student id.");
        assertEquals(student.getFirstName(),
                retrievedStudent.getFirstName(),
                "Checking student first name.");
        assertEquals(student.getLastName(),
                retrievedStudent.getLastName(),
                "Checking student last name.");
        assertEquals(student.getCohort(),
                retrievedStudent.getCohort(),
                "Checking student cohort.");
    }


}