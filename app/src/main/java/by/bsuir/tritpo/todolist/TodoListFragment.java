package by.bsuir.tritpo.todolist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * Created by 1 on 15.11.2015.
 */
public class TodoListFragment extends Fragment {

    private ListView listView;
    private TodoListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_todo_list, container);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        listView = (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new TodoListAdapter(getContext());
        adapter.add(new Note("Сплести плед ", "На сегодня три ряда большого квадрата. Завтра 4 утром и вечером"));
        adapter.add(new Note("Выполнить дз по PL/SQL и англу", "Создать таблицы, написать код на ср и англ на чт."));
        adapter.add(new Note("Выбрать зимнее пальто", "Для подода в чт на Дом моды на Лебяжий"));
    }
}
