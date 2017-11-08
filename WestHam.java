public class WestHam
{
    public static void main(){
        Team westHam = new Team("West Ham", 20);
        
        Athlete lanzini = new Athlete(26, "Lanzini");
        westHam.addAthlete(lanzini, 0);
        
        Athlete noble = new Athlete(33, "Noble");
        westHam.addAthlete(noble, 1);
        
        System.out.println(westHam);
        
    }
    
    
    
    
    
}