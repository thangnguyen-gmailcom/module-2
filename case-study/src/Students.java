public class Students {
    private int id;
    private String name;
    private String gender;
    private String dayOfBirth;
    private double scoreOne = -1;
    private double scoreTwo = -1;
    private double scoreThree = -1;
    private double scoreFour = -1;
    private double mediumScore = -1;

    public Students() {}

    public Students(int id, String name, String gender, String dayOfBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public double getScoreOne() {
        return scoreOne;
    }

    public void setScoreOne(double scoreOne) {
        this.scoreOne = scoreOne;
    }

    public double getScoreTwo() {
        return scoreTwo;
    }

    public void setScoreTwo(double scoreTwo) {
        this.scoreTwo = scoreTwo;
    }

    public double getScoreThree() {
        return scoreThree;
    }

    public void setScoreThree(double scoreThree) {
        this.scoreThree = scoreThree;
    }

    public double getScoreFour() {
        return scoreFour;
    }

    public void setScoreFour(double scoreFour) {
        this.scoreFour = scoreFour;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    public void setMediumScore() {
        int n = 0;
        double total = 0;
        if (this.getScoreOne() > -1) {
            total += this.getScoreOne();
            n += 1;
        }
        if (this.getScoreTwo() > -1) {
            total += this.getScoreTwo();
            n += 1;
        }
        if (this.getScoreThree() > -1) {
            total += (this.getScoreThree() * 2);
            n += 2;
        }
        if (this.getScoreFour() > -1) {
            total += (this.getScoreFour() * 3);
            n += 3;
        }
        this.mediumScore = total / n;
    }

    public void printHeader() {
        System.out.println(String.format("%s", "+-----+---------------------+--------+----------------+------------+------------+------------+------------+---------------+"));
        System.out.format("%-5s |", "| Id");
        System.out.format("%-20s |", " Name");
        System.out.format("%-7s |", "gender");
        System.out.format("%-15s |", "day of birth");
        System.out.format("%-11s |", "point one");
        System.out.format("%-11s |", "point two");
        System.out.format("%-11s |", "point three");
        System.out.format("%-11s |", "point four");
        System.out.format("%-14s |", "Medium score");
        System.out.println();
        System.out.println(String.format("%s", "+-----+---------------------+--------+----------------+------------+------------+------------+------------+---------------+"));
    }

    public void printStudent() {
        System.out.format("| %-3s |", this.getId());
        System.out.format("%-20s |", this.getName());
        System.out.format("%-7s |", this.getGender());
        System.out.format("%-15s |", this.getDayOfBirth());
        System.out.format(this.getScoreOne() != -1 ?"%-11.1f |" :"%-11s |", this.getScoreOne() != -1 ? this.getScoreOne() : "");
        System.out.format(this.getScoreTwo() != -1 ?"%-11.1f |" :"%-11s |", this.getScoreTwo() != -1 ? this.getScoreTwo() : "");
        System.out.format(this.getScoreOne() != -1 ?"%-11.1f |" :"%-11s |", this.getScoreThree() != -1 ? this.getScoreThree() : "");
        System.out.format(this.getScoreOne() != -1 ?"%-11.1f |" :"%-11s |", this.getScoreFour() != -1 ? this.getScoreFour() : "");
        System.out.format(this.getMediumScore() != -1 ?"%-14.1f |" :"%-14s |", this.getMediumScore() != -1 ? this.getMediumScore(): "");
        System.out.println();
        System.out.println(String.format("%s", "+-----+---------------------+--------+----------------+------------+------------+------------+------------+---------------+"));

    }
}