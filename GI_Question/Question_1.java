package GI_Question;

public class Question_1 extends translation{
    public static void main(String[] args) {

        translation.register("X", "456");
        translation.register("Y", "123");

        System.out.println(translation.revision("X%Y%_%X%"));
    }
    
}
