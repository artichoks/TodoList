package by.bsuir.tritpo.todolist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by 1 on 17.11.2015.
 */
public class TodoListAdapter extends ArrayAdapter<Note> {

    public TodoListAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = View.inflate(parent.getContext(), R.layout.item_note, null);
        } else {
            view = convertView;
        }

        final TextView titleView = (TextView) view.findViewById(R.id.title);
        final TextView textView = (TextView) view.findViewById(R.id.text);
        titleView.setText(getItem(position).title);
        textView.setText(getItem(position).text);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(textView.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
            }
        });

        return view;
    }
}
