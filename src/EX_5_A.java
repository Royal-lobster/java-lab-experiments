/**
 * write a java program to implement single inheritance
 */

class CriminalBranch {
    String branch = "Criminal";
    int branchCode = 3;
    int needExperience = 5;
}

class Lawyer extends CriminalBranch {
    String license;
    int fee;
    int experience;

    Lawyer(String license, int fee, int experience) {
        this.license = license;
        this.fee = fee;
        this.experience = experience;
    }

    public void lawyerInfo() {
        System.out.println("Branch: " + branch);
        System.out.println("Branch Code: " + branchCode);
        System.out.println("License: " + license);
        System.out.println("Fee: " + fee);
        System.out.println("Experience: " + experience);
    }
}

public class EX_5_A {
    public static void main(String[] args) {
        Lawyer lawyer = new Lawyer("License", 100, 10);
        lawyer.lawyerInfo();
    }
}