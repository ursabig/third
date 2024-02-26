package Lesson9;


public class UserLesson {

    private String username;
    private String password;
    private String fullname;
    private String firstname;
    private String lastname;
    private boolean active;

//    дефолтный конструктор существует, пока мы не создали новый. Ниже мы объявили, что для объекта класса UserLesson у нас будет обязательным полем username
    public UserLesson(String username) {
      this.username = username;
  }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Pass is too short");
        } else {
            this.password = password;
        }
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        String[] parts = fullname.split("");
        this.firstname = parts[0];
        this.lastname = parts[1];
    }
}
