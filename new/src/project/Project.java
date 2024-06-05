package project;

import java.util.Scanner;

public class Project {
    public String getComputerChoice(){
        String choice;
        int rn= (int) (Math.random()*3)+1;
        if(rn==1){
            choice="rock";
        }
        else if(rn ==2 ){
            choice="paper";
        }
        else{
            choice="scissor";
        }
        return choice;
    }
    public String getUserInput(){
        String uchoice;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice:");
        uchoice= sc.nextLine();
        return uchoice.toLowerCase();
    }
    public String getResult(String c, String uc){
        if(uc.equals(c)){
            return "draw";
        }
        else if(uc.equals("paper") && c.equals("rock")){
            return "win";
        }
        else if(uc.equals("rock") && c.equals("scissor")){
            return "win";
        }
        else if(uc.equals("scissor") && c.equals("paper")){
            return "win";
        }
        else{
            return "lose";
        }
    }
    public static void main(String[] args) {
        Project p = new Project();
        String cc = p.getComputerChoice();
        String uc;
        while(true) {
            uc = p.getUserInput();
    
            if (uc.equals("rock") || uc.equals("paper") || uc.equals("scissors")) {
                break;
            }
        }
       
        String status = p.getResult(cc, uc);
        System.out.println("User Choice: "+ uc);
        System.out.println("Computer Choice: "+ cc);
        System.out.println("Status: "+ status);
    }
}
