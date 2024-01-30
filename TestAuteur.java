import org.junit.*;
import static org.junit.Assert.assertEquals;


public class TestAuteur{
    Auteur sophocle;

    @Before
    public void initialisation() {
        sophocle = new Auteur("Sophocle", 95, "citation_antigone", 0, "caca", 60, "citation_limiers");
    }   


    @Test
    public void test_quatra(){
        assertEquals(95, sophocle.getQualitéTragédie());
    }

    @Test
    public void test_citaTra(){
        assertEquals("citation_antigone", sophocle.getCitationTragédie());
    }

}