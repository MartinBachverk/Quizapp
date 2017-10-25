package com.example.opilane.simplequiz;


public class Questions {
    public String MyQuestions[] = {
        "Mis värvi on taevas?",
        "Mis logo on Apple firmal?",
        "Millist ilma kohtub eestis kõige rohkem?",
        "Mitme aastaselt tavaliselt mindakse kooli?",
        "Keda pole olemas?",
        "Mis värvi on tthk kool?",
        "Kes on Venemaa president?",
        "Mis maksab rohkem?",
        "Kui palju inimesi elab eestis?",
        "Mis rahaühik on eestis?"

    };

    public String MyChoices [] [] ={
            {"Punane","Sinine","Kollane","Roheline"},
            {"Õun","Pirn","Päike","Lamp"},
            {"Päikeselist","Vihmalist","Tuulist ja vihmalist","Seda polegi"},
            {"5","7","17","15"},
            {"Karu","Pandat","Hobust","Unicorni"},
            {"Punane","Hall","Punane ja hall","Roosa"},
            {"Kersti Kaljulaid","Trump","Martin Bachverk","Putin"},
            {"Iphone","Samsung","Motorolla","Nokia"},
            {"1,3 mil","3,1 mil","1,3 tuhat","5 inimest"},
            {"Rubla","Nael","Euro","Kroon"}

    };

    public String MyCorrectAnswers [] = {
            "Sinine","Õun","Tuulist ja vihmalist","7","Unicorni","Punane ja hall","Putin","Iphone","1,3 mil","Euro"
    };

    public int getLength() {return MyQuestions.length;}

    public String getQuestions(int a) {
        String question = MyQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0=MyChoices[index][num -1];
        return choice0;
    }

    public String getCorrectAnswer (int a){
        String answer = MyCorrectAnswers[a];
        return answer;
    }
}
