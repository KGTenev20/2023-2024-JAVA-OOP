public class Tree {
    private String species;
    private int ageInYears;
    private double heightInMeters;
    private int numberOfBranches;
    private int numberOfLeaves;

    public Tree(String species, int ageInYears, double heightInMeters, int numberOfBranches, int numberOfLeaves) {
        this.species = species;
        this.ageInYears = ageInYears;
        this.heightInMeters = heightInMeters;
        this.numberOfBranches = numberOfBranches;
        this.numberOfLeaves = numberOfLeaves;
    }

    public void grow(int yearsToAdd, double heightToAdd, int branchesToAdd, int leavesToAdd) {
        ageInYears += yearsToAdd;
        heightInMeters += heightToAdd;
        numberOfBranches += branchesToAdd;
        numberOfLeaves += leavesToAdd;
    }

    public void shedLeaves(int leavesToShed) {
        if (leavesToShed > numberOfLeaves) {
            numberOfLeaves = 0;
        } else {
            numberOfLeaves -= leavesToShed;
        }
    }

    public String getTreeInfo() {
        return "Species: " + species +
                "\nAge: " + ageInYears + " years" +
                "\nHeight: " + heightInMeters + " meters" +
                "\nNumber of Branches: " + numberOfBranches +
                "\nNumber of Leaves: " + numberOfLeaves;
    }