import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

public class SkillTest {
    
    @Test
    public void testSubtract()
    {
        assertEquals(0, Skill.subtract(2, 2));
    }
}
