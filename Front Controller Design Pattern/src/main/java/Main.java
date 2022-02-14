public class Main {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        System.out.println("1 ============");
        frontController.dispatchRequest("HOME");
        System.out.println("2 ============");
        frontController.dispatchRequest("STUDENT");
        System.out.println("3 ============");
        frontController.dispatchRequest("ADMIN");
        System.out.println("4 ============");
        frontController.dispatchRequest("Random");
    }
}
