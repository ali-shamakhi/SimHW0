import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Integrate x^2 from 1 to 2");
        System.out.println("[2] Integrate e^(x^2) from 1 to 2");
        System.out.println("[3] Calculate Π");
        System.out.print("> ");
        int select = sc.nextInt();
        IntegralProblemSim problem;
        switch (select) {
            case 1:
                problem = new Integral_xPow2_1To2_Sim();
                break;
            case 2:
                problem = new Integral_ePowXPow2_1To2_Sim();
                break;
            case 3:
                problem = new Calculate_PI_Sim();
                break;
            default:
                System.err.println("Invalid input");
                return;
        }

        System.out.print("= ??? (Iterations: " + problem.getCountAllPoints() + ")");
        // TODO: Implement a dynamic approach to number of iterations, based on the number of passed iterations and the fluctuation of new results.
        while (problem.getCountAllPoints() < 1_000_000_000) {
            problem.generateNextPoint();
            if (problem.getCountAllPoints() % 1_000_000 == 0)
                System.out.print("\r= " + problem.getResult() + " (Iterations: " + problem.getCountAllPoints() + ")");
        }
        System.out.println("\r= " + problem.getResult() + " (Iterations: " + problem.getCountAllPoints() + ")");
    }
}
