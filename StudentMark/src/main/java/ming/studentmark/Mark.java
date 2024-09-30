package ming.studentmark;

/**
 *
 * @author user
 */
public class Mark extends Course{
    private double quiz,midterm,project,Final;
    
    public Mark(String cC, String cN,double q, double m, double p, double f){
        super(cC,cN);
        this.quiz = q;
        this.midterm = m;
        this.project = p;
        this.Final = f;
}
    
    public Mark(double quiz,double midterm,double project,double Final){
    this.quiz = quiz;
    this.midterm = midterm;
    this.project = project;
    this.Final = Final;
}
    
    public double getQuiz(){
        return quiz;
    }
    
    public double getMidTerm(){
        return midterm;
    }
    
    public double getProject(){
        return project;
    }
    
    public double getFinal(){
        return Final;
    }
    
    public void SetQuiz(double q){
         quiz = q;
     }
    
    public void SetMidTerm(double mT){
         midterm = mT;
     }
    
    public void SetProject(double p){
         project = p;
     }
    
    public void SetFinal(double f){
         Final = f;
     }
    
    public double get5PercentQuiz(){
        return quiz/100*5 ;
    }
    
    public double get35PercentMidTerm(){
        return midterm/100*35;
    }
    
    public double get20PercentProject(){
        return project/100*20;
    }
    
    public double get40PercentFinal(){
        return quiz/100*40;
    }
    
    public double get100PercentTotalMark(){
        return (quiz/100*5)+(midterm/100*35)+(project/100*20)+(quiz/100*40);
    }
}
