package test.pkgcase.exercises.pkg10.study.points.mandatory;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestCaseExercises10StudyPointsMandatoryTest {

    // Fields
    TestCaseExercises10StudyPointsMandatory test = new TestCaseExercises10StudyPointsMandatory();

    @Test // Listen er tom, der tilføjes et object add(Object o), herefter kaldes size
    public void testAdd_Object1() {
        System.out.println("Test1 - add(Object o)");
        test.add("1");
        int result = test.size();
        assertEquals(1, result);
    }

    @Test // Listen er tom, der tilføjes fem til listen
    // Herefter kaldes size, der tilføjes en til og size kaldes igen
    public void testAdd_Object2() {
        System.out.println("Test2 - add(Object o)");
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");

        System.out.println("Size of list = " + test.size());

        test.add("6");

        System.out.println("Added one more");

        int result = test.size();
        assertEquals(6, result);
    }

    @Test // Tester size() ved tom liste
    public void testSize1() {
        System.out.println("Test1 - size()");
        int result = test.size();
        assertEquals(0, result);
    }

    @Test // Tester size() ved 3 i liste
    public void testSize2() {
        System.out.println("Test2 - size()");
        test.add("1");
        test.add("2");
        test.add("3");
        int result = test.size();
        assertEquals(3, result);
    }

    @Test // Tester size() ved 6 i liste
    public void testSize3() {
        System.out.println("Test3 - size()");
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");
        test.add("6");
        int result = test.size();
        assertEquals(6, result);
    }

    @Test(expected = IndexOutOfBoundsException.class) // Listen er tom, get(int index) kaldes
    public void testGet1() {
        System.out.println("Test1 - get(int index)");
        test.get(2);
    }

    @Test // På plads to i liste står: (2, “Peter”) get(int index) kaldes
    public void testGet2() {
        System.out.println("Test2 - get(int index)");
        test.add("Philip");
        test.add("Peter");
        Object result = test.get(1);
        assertEquals("Peter", result);
    }

    @Test
    public void testAdd_int_Object() {
    }

    @Test(expected = IndexOutOfBoundsException.class) // Listen er tom, remove(int index) kaldes
    public void testRemove1() {
        System.out.println("Test1 - remove(int index)");
        test.remove(0);
    }

    @Test // Der er noget på første plads i listen, remove(int index) kaldes
    public void testRemove2() {
        System.out.println("Test2 - remove(int index)");
        test.add("Philip");
        test.remove(0);
        int result = test.size();
        assertEquals(0, result);
    }

}
