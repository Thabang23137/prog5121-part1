package prog5121poe;

public class LoginTest {


    public void testUsernameCorrect() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976");

        assertTrue(login.checkUserName());
    }

   
    public void testUsernameIncorrect() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyle!!!!!!",
                "Ch&&sec@ke99!",
                "+27838968976");

        assertFalse(login.checkUserName());
    }

 
    public void testPasswordCorrect() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976");

        assertTrue(login.checkPasswordComplexity());
    }

   
    public void testPasswordIncorrect() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "password",
                "+27838968976");

        assertFalse(login.checkPasswordComplexity());
    }

    
    public void testCellCorrect() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976");

        assertTrue(login.checkCellPhoneNumber());
    }

    public void testCellIncorrect() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "08966553");

        assertFalse(login.checkCellPhoneNumber());
    }

   
    public void testLoginSuccess() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976");

        assertTrue(login.loginUser(
                "kyl_1",
                "Ch&&sec@ke99!"));
    }

  
    public void testLoginFailed() {

        Login login = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976");

        assertFalse(login.loginUser(
                "wrong",
                "wrong"));
    }


    private void assertFalse(boolean loginUser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertTrue(boolean checkUserName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}