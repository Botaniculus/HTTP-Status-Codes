package com.botaniculus.http_status_codes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[]=
    {
            "100",
            "101",

            "200",
            "201",
            "202",
            "203",
            "204",
            "205",
            "206",

            "300",
            "301",
            "302",
            "303",
            "304",
            "305",
            "307",

            "400",
            "401",
            "402",
            "403",
            "404",
            "405",
            "406",
            "407",
            "408",
            "409",
            "410",
            "411",
            "412",
            "413",
            "414",
            "415",
            "416",
            "417",

            "500",
            "501",
            "502",
            "503",
            "504",
            "505"
    };
    String mContent[]={
            "Continue",
            "Switching Protocols",

            "OK",
            "Created",
            "Accepted",
            "Non-Authoritative Information",
            "No Content",
            "Reset Content",
            "Partial Content",

            "Multiple Choices",
            "Moved Permanently",
            "Found",
            "See Other",
            "Not Modified",
            "Use Proxy",
            "Temporary Redirect",

            "Bad Request",
            "Unauthorized",
            "Payment Required",
            "Forbidden",
            "Not Found",
            "Method Not Allowed",
            "Not Acceptable",
            "Proxy Authentication Required",
            "Request Timeout",
            "Conflict",
            "Gone",
            "Length Required",
            "Precondition Failed",
            "Request Entity Too Large",
            "Request-URI Too Long",
            "Unsupported Media Type",
            "Request Range Not Satisfiable",
            "Expectation Failed",

            "Internal Server Error",
            "Not Implemented",
            "Bad Gateway",
            "Service Unavailable",
            "Gateway Timeout",
            "HTTP Version Not Supported"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mContent);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rContent[];
        MyAdapter(Context c, String title[], String content[]){
            super(c, R.layout.row, R.id.numTxt, title);
            this.context=c;
            this.rTitle=title;
            this.rContent=content;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent,false);
            TextView myTitle = row.findViewById(R.id.numTxt);
            TextView myContent = row.findViewById(R.id.contentTxt);

            myTitle.setText(rTitle[position]);
            myContent.setText(rContent[position]);

            return row;
        }
    }
}
