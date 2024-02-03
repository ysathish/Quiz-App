import java.util.Scanner;

public class QuestionService {
    Questions[] questions=new Questions[5];
    String selection[] =new String[5];
    public QuestionService(){
        questions[0]=new Questions(1,"What is the capital of France?", "Paris", "London", "Berlin", "Rome", "Paris");
        questions[1]=new Questions(2, "Who wrote 'Romeo and Juliet'?", "William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain", "William Shakespeare");        
        questions[2]=new Questions(3, "What is the chemical symbol for water?", "H2O", "CO2", "NaCl", "O2", "H2O");
        questions[3]=new Questions(4, "What is the tallest mammal?", "Giraffe", "Elephant", "Horse", "Rhino", "Giraffe");
        questions[4]=new Questions(5, "What is the currency of Japan?", "Yen", "Euro", "Dollar", "Pound", "Yen");
    }
        

    
    public void displayQuestion(){
        int i=0;
        for(Questions q:questions){
        System.out.println("Question no:"+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc=new Scanner(System.in);
        selection[i]=sc.nextLine();
        i++;

        }
        for(String s:selection){
            System.out.println(s);
        }
        
    }
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Questions que=questions[i];
            String actualscore=que.getAnswer();
            String userAnswers=selection[i];
            if(actualscore.equals(userAnswers)){
                score++;

            }
        }
        System.out.println("your score is"+score);
    }
}
