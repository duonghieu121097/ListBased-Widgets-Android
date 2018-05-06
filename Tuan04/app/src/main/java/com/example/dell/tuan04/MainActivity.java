package com.example.dell.tuan04;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class MainActivity extends Activity {

    TextView txtmsg;
    ListView myListView;

    String[] items = {"Photo-1", "Photo-2", "Photo-3", "Photo-4", "Photo-5",
            "Photo-6", "Photo-7", "Photo-8", "Photo-9", "Photo-10",};

    Integer[] thumbnails = {R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,
            R.drawable.download,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this,
                android.R.layout.activity_list_item,
                // R.layout.my_text,   //try this later...
                items);
                myListView.setAdapter(aa);

        txtmsg = (TextView) findViewById(R.id.textView3);

        CustomIconLabelAdapter adapter = new CustomIconLabelAdapter(
                this,
                R.layout.activity_custom_icon_label_adapter,
                items,
                thumbnails);
        // bind intrinsic ListView to custom adapter
        myListView.setAdapter(adapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View v,
            int position, long id) {
            String text = "Position: " + position          + "\nData: " + items[position];
            txtmsg.setText(text);  }
        });
    }//onCreate
};



