import Repositories.TodoListRepository;
import Repositories.TodoListRepositoryDbImpl;
import Repositories.TodoListRepositoryImpl;
import Services.TodoListService;
import Services.TodoListServiceImpl;
import Views.TodoListTerminalView;
import Views.TodoListView;
import config.Database;


public class Main {
    public static void main(String[] args) {
        Database database = new Database("databaseku", "root", "", "localhost", "3306");
        database.setup();
     TodoListRepository todoListRepository = new TodoListRepositoryDbImpl();

     TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
     TodoListView todoListView = new TodoListTerminalView(todoListService);
     todoListView.run();
    }
}
