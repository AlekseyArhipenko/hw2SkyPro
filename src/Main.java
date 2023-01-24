public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var weightOfOneBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeightOfFighters = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес бойцов " +  totalWeightOfFighters + " кг");
        var weightDifference = weightOfOneBoxer - weightOfTheSecondBoxer;
        System.out.println("Разница в весе бойцов составляет " + weightDifference + " кг");

        weightDifference = Math.max(weightOfOneBoxer, weightOfTheSecondBoxer) - Math.min(weightOfOneBoxer, weightOfTheSecondBoxer);
        System.out.println("Разница в весе бойцов составляет " + weightDifference + " кг");
        weightDifference = Math.max(weightOfOneBoxer, weightOfTheSecondBoxer) % Math.min(weightOfOneBoxer, weightOfTheSecondBoxer);
        System.out.println("Разница в весе бойцов составляет " + weightDifference + " кг");
    }
}