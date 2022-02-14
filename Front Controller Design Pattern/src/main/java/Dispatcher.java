import Views.HomeView;
import Views.StudentView;
import Views.AdminView;
import Views.notFoundView;
import java.util.Locale;

public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;
    private AdminView adminView;
    private notFoundView notFoundView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
        adminView = new AdminView();
        notFoundView = new notFoundView();
    }

    public void dispatch(String request){
        switch (request.toLowerCase(Locale.ROOT)){
            case "student":
                studentView.show();
                break;
            case "home":
                homeView.show();
                break;
            case "admin":
                adminView.show();
                break;
            default:
                notFoundView.show();
                break;
        }
    }


}
