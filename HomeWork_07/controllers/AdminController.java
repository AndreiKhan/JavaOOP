package controllers;

import models.User;
import services.IFilmService;
import views.AdminView;

public class AdminController {

    private User user;
    private IFilmService adminSrv;
    private AdminView adminView;

    public AdminController(User user, IFilmService adminSrv) {
        this.user = user;
        this.adminSrv = adminSrv;
        adminView = new AdminView();
    }

    public void Run(int choose){
        if(choose == 1)
            addMovie();
        if(choose == 2)
            editMovie();
        if(choose == 3)
            deleteMovie();
        if(choose == 4)
            getMovie();
    }
    
    void addMovie(){
        var movieName = adminView.showAddMenu();
        adminSrv.addMovie(movieName);
    }

    void editMovie(){
        var movieName = adminView.showEditMenu();
        adminSrv.editMovie(movieName);
    }

    void deleteMovie(){
        var movieName = adminView.showDeleteMenu();
        adminSrv.deleteMovie(movieName);
    }

    void getMovie(){
        var movieName = adminView.showGetMenu();
        adminSrv.getMovie(movieName);
    }
}
