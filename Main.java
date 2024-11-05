import Repositories.TodoListRepository;
import Repositories.TodoListRepositoryImpl;
import Services.TodoListService;
import Services.TodoListServiceImpl;
import Views.TodoListTerminalView;
import Views.TodoListView;


public class Main {
    public static void main(String[] args) {
       TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
       todoListView.run();
    }
}
