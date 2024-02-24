package com.example.lab_3_android_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner custom_spinner;
    private  ListView listView;
    ArrayAdapter<String> adapter;
    CustomAdapter customAdapter ;
    private AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = new String[]{"item1", "item2", "item3"};
//        custom_spinner = findViewById(R.id.custom_spinner);

//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,items);
//        custom_spinner.setAdapter(arrayAdapter);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        autoCompleteTextView.setAdapter(adapter);

        listView = findViewById(R.id.listitem);

        // Danh sách dữ liệu
        List<String> itemList = Arrays.asList("Item 1", "Item 2", "Item 3","Item 4");

        // Tạo và thiết lập adapter
        customAdapter =new CustomAdapter(this, itemList);

        // Đặt adapter cho ListView
        listView.setAdapter(customAdapter);

    }

}